package com.leigq.www.state;

/**
 * Controller
 * <br/>
 *
 * @author ：leigq
 * @date ：2019/7/10 16:04
 */
public class StateController implements State {

	private Function function;

	@Override
	public void OffLine() {
		setState(new OffLineState());
	}

	@Override
	public void OnLine() {
		setState(new OnLineState());
	}

	public void drive() {
		function.drive();
	}

	public void run() {
		function.run();
	}

	public void back() {
		function.back();
	}

	/**
	 * 设置不同的状态
	 * <br/>
	 * create by: leigq
	 * <br/>
	 * create time: 2019/7/10 16:10
	 * @return
	 */
	private void setState(Function function) {
		this.function = function;
	}
}
