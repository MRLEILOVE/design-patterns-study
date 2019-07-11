package com.leigq.www.strategy;

import org.springframework.stereotype.Component;

/**
 * 具体策略类A
 * <br/>
 *
 * @author ：leigq
 * @date ：2019/7/11 09:33
 */
@Component
public class ConcreteStrategyA implements Strategy {
	@Override
	public void doSomeThing() {
		System.out.println("具体策略类A doSomeThing() 被执行");
	}
}
