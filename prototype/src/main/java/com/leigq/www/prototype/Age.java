package com.leigq.www.prototype;

/**
 * 年龄
 * <br/>
 *
 * @author ：leigq
 * @date ：2019/7/31 17:15
 */
public class Age implements Cloneable{

	private Integer age;

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	@Override
	protected Age clone() throws CloneNotSupportedException {
		return (Age) super.clone();
	}

	@Override
	public String toString() {
		return "Age{" +
				"age=" + age +
				'}';
	}
}
