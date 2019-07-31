package com.leigq.www.adapter.common;

/**
 * 适配者接口，它是被访问和适配的现存组件库中的组件接口
 * <br/>
 *
 * @author ：leigq
 * @date ：2019/7/31 21:28
 */
public class Adaptee {

	/**
	 * 具体请求
	 * <br/>
	 * create by: leigq
	 * <br/>
	 * create time: 2019/7/31 21:32
	 * @return  
	 */
	public void specificRequest() {
		System.out.println("适配者中的业务代码被调用...");
	}

}
