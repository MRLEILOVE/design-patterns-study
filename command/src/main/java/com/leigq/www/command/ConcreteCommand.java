package com.leigq.www.command;

/**
 * 具体命令
 * <br/>
 *
 * @author ：leigq
 * @date ：2019/7/11 11:58
 */
public class ConcreteCommand extends Command {

	private Receiver receiver;

	public ConcreteCommand() {
		this.receiver = new Receiver();
	}

	@Override
	public void execute() {
		receiver.action();
	}
}
