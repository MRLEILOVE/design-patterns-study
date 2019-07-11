package com.leigq.www.strategy;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.Map;

/**
 * 测试类
 * <br/>
 *
 * @author ：leigq
 * @date ：2019/7/11 09:37
 */
public class StrategyMain {

	public static void main(String[] args) {
		Context context = new Context();
		context.setStrategy(new ConcreteStrategyA());
		context.doSomeThing();
	}
}
