package com.leigq.www.state;

/**
 * 功能实现接口1
 * <br/>
 *
 * @author ：leigq
 * @date ：2019/7/10 15:57
 */
public class OffLineState implements Function{
	@Override
	public void drive() {
		System.out.println("不在线的 drive");
	}

	@Override
	public void run() {
		System.out.println("不在线的 run");
	}

	@Override
	public void back() {
		System.out.println("不在线的 back");
	}
}
