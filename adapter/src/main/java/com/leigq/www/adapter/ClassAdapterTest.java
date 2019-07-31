package com.leigq.www.adapter;

import com.leigq.www.adapter.adapter.ClassAdapter;
import com.leigq.www.adapter.common.Target;

/**
 * 类适配器测试
 * <br/>
 *
 * @author ：leigq
 * @date ：2019/7/31 21:35
 */
public class ClassAdapterTest {
	public static void main(String[] args) {
		Target target = new ClassAdapter();
		target.request();
	}
}
