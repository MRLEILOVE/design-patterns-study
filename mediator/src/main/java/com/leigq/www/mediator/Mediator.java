package com.leigq.www.mediator;

/**
 * 抽象中介者
 * <br/>
 *
 * @author ：leigq
 * @date ：2019/7/11 11:02
 */
public abstract class Mediator {

	public abstract void register(Colleague colleague);

	public abstract void relay(Colleague colleague); //转发

}
