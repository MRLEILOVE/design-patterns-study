package com.leigq.www.single;

/**
 * 枚举实现单例
 * <br/>
 * 这种方式是Effective Java作者Josh Bloch 提倡的方式，它不仅能避免多线程同步问题，而且还能防止反序列化重新创建新的对象，可谓是很坚强的壁垒啊，
 * 不过，个人认为由于1.5中才加入enum特性，用这种方式写不免让人感觉生疏，在实际工作中，我也很少看见有人这么写过。
 * <br/>
 *
 * @author ：leigq
 * @date ：2019/7/6 14:16
 */
public enum EnumSingle {

    INSTANCE;

    /**
     * 任何方法
     */
    public void whateverMethod() {

    }


    // 测试
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            System.out.println(EnumSingle.INSTANCE.hashCode());
        }
    }
}
