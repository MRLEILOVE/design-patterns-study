package com.leigq.www.prototype;

/**
 * 测试主类
 * <br/>
 * 参考：<a href='https://www.cnblogs.com/shakinghead/p/7651502.html'>Java 浅拷贝和深拷贝的理解和实现方式</a>
 * <br/>
 *
 * @author ：leigq
 * @date ：2019/7/31 16:46
 */
public class Main {

	public static void main(String[] args) throws CloneNotSupportedException {
		Person personOne = new Person();
		personOne.setName("tom");
		Age age1 = new Age();
		age1.setAge(10);
		personOne.setAge(age1);
		System.out.println(String.format("personOne = %s", personOne));

		Person personTwo = personOne.clone();
		personTwo.setName("jack");
		// 使用这种方式修改age属性值的话，stu2是不会跟着改变的。因为创建了一个新的Age类对象而不是改变原对象的实例值
//		Age age2 = new Age();
//		age2.setAge(20);
//		personTwo.setAge(age2);
		System.out.println(String.format("personTwo = %s", personTwo));

		System.out.println("-------------------------------------");

		// 改变 person1 的 age，person2 的 age 也跟着变了，这就是浅克隆，打开 Person 类中的深度克隆注释看看？
		age1.setAge(20);
		//
		System.out.println(String.format("personOne = %s", personOne));
		System.out.println(String.format("personTwo = %s", personTwo));
		System.out.println();
		System.out.println(String.format("personOne == personTwo ? %s", personOne == personTwo));
	}

}
