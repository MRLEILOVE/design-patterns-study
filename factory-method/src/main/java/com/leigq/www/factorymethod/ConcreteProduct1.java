package com.leigq.www.factorymethod;

/**
 * 具体产品1：实现抽象产品中的抽象方法
 * <br/>
 *
 * @author ：leigq
 * @date ：2019/7/15 10:02
 */
public class ConcreteProduct1 implements Product {
	@Override
	public void show() {
		System.out.println("具体产品1显示...");
	}
}
