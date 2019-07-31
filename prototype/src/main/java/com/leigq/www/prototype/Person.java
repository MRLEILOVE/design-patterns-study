package com.leigq.www.prototype;

import java.util.List;

/**
 * 人
 * <br/>
 *
 * @author ：leigq
 * @date ：2019/7/31 16:42
 */
// 如果要克隆就必须实现Cloneable接口
public class Person implements Cloneable{

	private String name;
	// 引用对象， 在浅克隆时与原始对象使用的是同一地址
	private Age age;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Age getAge() {
		return age;
	}

	public void setAge(Age age) {
		this.age = age;
	}

	// 可能会抛出不支持克隆异常，原因是没有实现Cloneable接口
	@Override
	protected Person clone() throws CloneNotSupportedException {
		Person person = (Person) super.clone();
		// 深度克隆，重新创建 age 对象，使其地址与原对象不同
		person.setAge(person.getAge().clone());
		return person;
	}

	@Override
	public String toString() {
		return "Person{" +
				"name='" + name + '\'' +
				", age=" + age +
				'}';
	}
}
