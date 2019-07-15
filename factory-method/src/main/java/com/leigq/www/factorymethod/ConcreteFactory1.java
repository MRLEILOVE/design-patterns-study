package com.leigq.www.factorymethod;

/**
 * 具体工厂1：实现了产品1的生成方法
 * <br/>
 *
 * @author ：leigq
 * @date ：2019/7/15 10:04
 */
public class ConcreteFactory1 implements AbstractFactory {
	@Override
	public Product newProduct() {
		System.out.println("具体工厂1生成-->具体产品1...");
		return new ConcreteProduct1();
	}
}
