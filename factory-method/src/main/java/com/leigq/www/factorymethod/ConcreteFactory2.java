package com.leigq.www.factorymethod;

/**
 * 具体工厂2：实现了产品2的生成方法
 * <br/>
 *
 * @author ：leigq
 * @date ：2019/7/15 10:04
 */
public class ConcreteFactory2 implements AbstractFactory {
	@Override
	public Product newProduct() {
		System.out.println("具体工厂2生成-->具体产品2...");
		return new ConcreteProduct2();
	}
}
