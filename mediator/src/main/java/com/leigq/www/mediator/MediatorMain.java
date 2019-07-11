package com.leigq.www.mediator;

/**
 * 中介者模式测试
 * <br/>
 *
 * @author ：leigq
 * @date ：2019/7/11 10:58
 */
public class MediatorMain {

	public static void main(String[] args) {
		// 初始化中介
		Mediator mediator = new ConcreteMediator();
		// 初始化同事
		Colleague colleagueA = new ConcreteColleagueA();
		Colleague colleagueB = new ConcreteColleagueB();
		// 将同事注册至中介
		mediator.register(colleagueA);
		mediator.register(colleagueB);

		// 同事之间相互发消息
		colleagueA.send("我是同事A!");
		colleagueB.send("我是同事B!");
	}

}
