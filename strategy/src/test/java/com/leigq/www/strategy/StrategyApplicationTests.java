package com.leigq.www.strategy;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.Map;

@RunWith(SpringRunner.class)
@SpringBootTest
public class StrategyApplicationTests {

	/*
	* spring实现依赖查找，Spring 会把实现 Strategy 接口的实现类，以首字母小写的类名为key,实例为value，注入至Map。
	* 参考：https://segmentfault.com/a/1190000017079464
	* */
	@Resource
	private Map<String, Strategy> strategyMap;

	@Test
	public void contextLoads() {
		Context context = new Context();
		context.setStrategy(strategyMap.get("concreteStrategyA"));
		context.doSomeThing();
	}

}
