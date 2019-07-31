package com.leigq.www.adapter;

import com.leigq.www.adapter.adapter.ObjectAdapter;
import com.leigq.www.adapter.common.Adaptee;
import com.leigq.www.adapter.common.Target;

/**
 * 对象适配器测试
 * <br/>
 *
 * @author ：leigq
 * @date ：2019/7/31 21:39
 */
public class ObjectAdapterTest {
	public static void main(String[] args) {
		Target target = new ObjectAdapter(new Adaptee());
		target.request();
	}
}
