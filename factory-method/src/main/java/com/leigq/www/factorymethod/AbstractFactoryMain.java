package com.leigq.www.factorymethod;

/**
 * 工厂方法模式测试
 * <br/>
 *
 * @author ：leigq
 * @date ：2019/7/15 10:06
 */
public class AbstractFactoryMain {
	public static void main(String[] args) {
		AbstractFactory concreteFactory1 = new ConcreteFactory1();
		Product concreteProduct1 = concreteFactory1.newProduct();
		concreteProduct1.show();

		AbstractFactory concreteFactory2 = new ConcreteFactory2();
		Product concreteProduct2 = concreteFactory2.newProduct();
		concreteProduct2.show();
	}
}
