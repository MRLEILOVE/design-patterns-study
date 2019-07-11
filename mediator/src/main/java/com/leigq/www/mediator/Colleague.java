package com.leigq.www.mediator;

/**
 * 抽象同事类
 * <br/>
 *
 * @author ：leigq
 * @date ：2019/7/11 11:00
 */
public abstract class Colleague {

	protected Mediator mediator;

	public void setMediator(Mediator mediator) {
		this.mediator = mediator;
	}

	public abstract void receive();

	public abstract void send(String msg);

}
