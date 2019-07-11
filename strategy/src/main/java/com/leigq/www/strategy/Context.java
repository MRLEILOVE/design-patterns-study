package com.leigq.www.strategy;

/**
 * 环境类
 * <br/>
 *
 * @author ：leigq
 * @date ：2019/7/11 09:34
 */
public class Context {

	private Strategy strategy;

	public void setStrategy(Strategy strategy) {
		this.strategy = strategy;
	}

	public void doSomeThing() {
		strategy.doSomeThing();
	}
}
