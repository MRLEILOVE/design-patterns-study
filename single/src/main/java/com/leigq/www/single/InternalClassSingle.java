package com.leigq.www.single;

/**
 * 静态内部类单例
 * <br/>
 * 这种方式同样利用了classloader的机制来保证初始化instance时只有一个线程，它跟第三种和第四种方式细微的差别是前两种是只要Singleton类被装载了，
 * 那么instance就会被实例化，也就没有达到lazy loading效果，而这种方式是Singleton类被装载了，instance不一定被初始化。
 * 因为SingleHolder类没有被主动使用，只有显示通过调用getInstance方法时才会显示装载SingleHolder类，从而实例化instance。
 * 想象一下，如果实例化instance很消耗资源，我想让他延迟加载，另外一方面，我不希望在Singleton类加载时就实例化，
 * 因为我不能确保Singleton类还可能在其他的地方被主动使用从而被加载，那么这个时候实例化instance显然是不合适的。
 * 这个时候，这种方式相比 HungryManSingle 中的两种饿汉方式就显得很合理。
 * <br/>
 *
 * @author ：leigq
 * @date ：2019/7/6 12:10
 */
public class InternalClassSingle {


    private InternalClassSingle (){}

    private static final class InternalClassSingleHolder {
        private static InternalClassSingle internalClassSingle = new InternalClassSingle();
    }

    public static InternalClassSingle getInstance() {
        return InternalClassSingleHolder.internalClassSingle;
    }

}
