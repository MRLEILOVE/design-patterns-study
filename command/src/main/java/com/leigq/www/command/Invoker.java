package com.leigq.www.command;

/**
 * 调用者
 * <br/>
 *
 * @author ：leigq
 * @date ：2019/7/11 12:01
 */
public class Invoker {

	private Command command;

	public Invoker(Command command) {
		this.command = command;
	}

	public void call() {
		System.out.println("调用者执行命令command...");
		command.execute();
	}

}
