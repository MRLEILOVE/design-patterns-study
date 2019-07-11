package com.leigq.www.command;

/**
 * 测试
 * <br/>
 *
 * @author ：leigq
 * @date ：2019/7/11 12:02
 */
public class CommandMain {
	public static void main(String[] args) {
		// 初始化命令
		Command command = new ConcreteCommand();
		// 初始化调用者
		Invoker invoker = new Invoker(command);
		System.out.println("客户访问调用者的call()方法...");
		invoker.call();
	}
}
