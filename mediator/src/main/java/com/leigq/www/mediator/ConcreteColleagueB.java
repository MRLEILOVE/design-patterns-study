package com.leigq.www.mediator;

/**
 * 具体同事类B
 * <br/>
 *
 * @author ：leigq
 * @date ：2019/7/11 11:00
 */
public class ConcreteColleagueB extends Colleague {

	@Override
	public void receive() {
		// B 应该收到 A 的消息
		System.out.println("具体同事类 B 收到消息");
	}

	@Override
	public void send(String msg) {
		System.out.println(msg);
		// 请中介者转发
		mediator.relay(this);
	}
}
