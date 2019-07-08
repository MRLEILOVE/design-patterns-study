package com.leigq.www.single;

import java.util.Objects;

/**
 * 双重校验锁单例
 * <br/>
 * 这个是第二种方式的升级版，俗称双重检查锁定，详情参考:https://www.cnblogs.com/andy-zhou/p/5363585.html
 * 在JDK1.5之后，双重检查锁定才能够正常达到单例效果
 * <br/>
 *
 * @author ：leigq
 * @date ：2019/7/6 14:22
 */
public class DoubleCheckLockSingle {


    private volatile static DoubleCheckLockSingle single;

    private DoubleCheckLockSingle() {
    }

    public static DoubleCheckLockSingle getInstance() {
        if (Objects.isNull(single)) {
            synchronized (DoubleCheckLockSingle.class) {
                if (Objects.isNull(single)) {
                    single = new DoubleCheckLockSingle();
                }
            }
        }
        return single;
    }


    // 测试
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            System.out.println(getInstance().hashCode());
        }
    }


}
