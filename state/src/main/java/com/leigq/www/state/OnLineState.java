package com.leigq.www.state;

/**
 * 功能实现接口2
 * <br/>
 *
 * @author ：leigq
 * @date ：2019/7/10 15:58
 */
public class OnLineState implements Function {
	@Override
	public void drive() {
		System.out.println("在线的 drive");
	}

	@Override
	public void run() {
		System.out.println("在线的 run");
	}

	@Override
	public void back() {
		System.out.println("在线的 back");
	}
}
