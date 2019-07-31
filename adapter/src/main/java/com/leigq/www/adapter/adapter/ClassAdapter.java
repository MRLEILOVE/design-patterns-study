package com.leigq.www.adapter.adapter;

import com.leigq.www.adapter.common.Adaptee;
import com.leigq.www.adapter.common.Target;

/**
 * 类适配器，对象适配器，它是一个转换器，通过继承或引用适配者的对象，把适配者接口转换成目标接口，让客户按目标接口的格式访问适配者。
 * <br/>
 *
 * @author ：leigq
 * @date ：2019/7/31 21:34
 */
public class ClassAdapter extends Adaptee implements Target {

	@Override
	public void request() {
		specificRequest();
	}
}
