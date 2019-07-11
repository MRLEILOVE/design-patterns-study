package com.leigq.www.mediator;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * 具体中介者
 * <br/>
 *
 * @author ：leigq
 * @date ：2019/7/11 11:03
 */
public class ConcreteMediator extends Mediator {

	// 保存所有同事
	private List<Colleague> colleagues = new ArrayList<>();

	@Override
	public void register(Colleague colleague) {
		if (!colleagues.contains(colleague)) {
			colleagues.add(colleague);
			// 给同事设置中介
			colleague.setMediator(this);
		}
	}

	@Override
	public void relay(Colleague colleague) {
		colleagues.forEach(colleague1 -> {
			if (!Objects.equals(colleague1, colleague)) {
				colleague1.receive();
			}
		});
	}
}
