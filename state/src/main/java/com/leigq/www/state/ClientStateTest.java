package com.leigq.www.state;

/**
 * 客户端测试
 * <br/>
 * 参考：https://blog.csdn.net/qq_30124547/article/details/53144097
 * <br/>
 *
 * @author ：leigq
 * @date ：2019/7/10 16:10
 */
public class ClientStateTest {

	public static void main(String[] args) {
		StateController controller = new StateController();
		// 设置不在线状态
		controller.OffLine();
		// 省去了很多if-else的结构
		controller.drive();
		controller.run();
		controller.back();

		// 设置在线状态
		controller.OnLine();
		// 省去了很多if-else的结构
		controller.drive();
		controller.run();
		controller.back();
	}

}
