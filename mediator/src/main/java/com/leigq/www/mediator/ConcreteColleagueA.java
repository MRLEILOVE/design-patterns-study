package com.leigq.www.mediator;

/**
 * 具体同事类A
 * <br/>
 *
 * @author ：leigq
 * @date ：2019/7/11 11:00
 */
public class ConcreteColleagueA extends Colleague {

	@Override
	public void receive() {
		// A 应该收到 B 的消息
		System.out.println("具体同事类 A 收到消息");
	}

	@Override
	public void send(String msg) {
		System.out.println(msg);
		// 请中介者转发
		mediator.relay(this);
	}
}
