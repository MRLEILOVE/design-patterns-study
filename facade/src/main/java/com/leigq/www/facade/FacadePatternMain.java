package com.leigq.www.facade;

/**
 * 外观模式运行主类
 * <br/>
 *
 * @author ：leigq
 * @date ：2019/7/9 17:12
 */
public class FacadePatternMain {

	public static void main(String[] args) {
		Facade facade = new Facade();
		facade.method();
	}

}
