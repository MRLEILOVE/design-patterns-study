package com.leigq.www.adapter.adapter;

import com.leigq.www.adapter.common.Adaptee;
import com.leigq.www.adapter.common.Target;

/**
 * 对象适配器，它是一个转换器，通过继承或引用适配者的对象，把适配者接口转换成目标接口，让客户按目标接口的格式访问适配者。
 * <br/>
 *
 * @author ：leigq
 * @date ：2019/7/31 21:36
 */
public class ObjectAdapter implements Target {
	private Adaptee adaptee;

	public ObjectAdapter(Adaptee adaptee) {
		this.adaptee = adaptee;
	}

	@Override
	public void request() {
		adaptee.specificRequest();
	}
}
