package com.leigq.www.single;

/**
 * 饿汉单例模式
 * <br/>
 *
 * @author ：leigq
 * @date ：2019/7/6 11:51
 */
public class HungryManSingle {

    private HungryManSingle() {}

    /**
     * 第一种 基于classloader机制
     * <br/>
     * 这种方式基于classloader机制，避免了多线程的同步问题，不过instance在类装载时就实例化，虽然导致类装载的原因有很多种，在单例模式中大多数都是调用getInstance方法，
     * 但也不确定有其他的方式或者说静态方法导致类装载，此时初始化instance显然没有达到lazy loading的效果。
     */
    private static HungryManSingle hungryManSingle = new HungryManSingle();

    public static HungryManSingle getInstance1() {
        return hungryManSingle;
    }

    /**
     * 第二种 饿汉，变种
     * 看似差别挺大，实则与上面方式差不多，都是在类初始化即实例化instance。
     */
    private static HungryManSingle single;

    static {
        single = new HungryManSingle();
    }

    public static HungryManSingle getInstance2() {
        return single;
    }

    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            System.out.println(HungryManSingle.getInstance1().hashCode());
            System.out.println("--------------");
            System.out.println(HungryManSingle.getInstance2().hashCode());
        }
    }
}
