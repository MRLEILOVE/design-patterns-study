package com.leigq.www.single;

import java.util.Objects;

/**
 * 懒汉单例模式
 * <br/>
 *
 * @author ：leigq
 * @date ：2019/7/6 11:51
 */
public class LazySingle {

    private LazySingle() {}

    private static LazySingle lazySingle;

    /**
     * 第一种（懒汉，线程不安全）
     * 这种写法lazy loading很明显，但是致命的是在多线程不能正常工作。
     */
    public static LazySingle getInstance1() {
        if (Objects.isNull(lazySingle)) {
            lazySingle = new LazySingle();
        }
        return lazySingle;
    }


    /**
     * 第二种（懒汉，线程安全）
     * 这种写法能够在多线程中很好的工作，而且看起来也具备很好的lazy loading，但是效率太低，99%情况下不需要同步。
     */
    public static synchronized LazySingle getInstance2() {
        if (Objects.isNull(lazySingle)) {
            lazySingle = new LazySingle();
        }
        return lazySingle;
    }

    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            System.out.println(LazySingle.getInstance1().hashCode());
            System.out.println("---------------");
            System.out.println(LazySingle.getInstance2().hashCode());
        }
    }

}
