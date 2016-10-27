package com.OodDemo2;

import lombok.Getter;
import lombok.Setter;

@Setter@Getter
public class Human {
	private String id;
	private String name;
	private Integer age;
	private String work;
	
	
	public Human() {
		//super();
		System.out.println("这是Human 类的无参构造方法，作用创建Human类的一个实例对象");
	}
	
	
	public Human(String id, String name, Integer age, String work) {
		//super();
		this();
		this.id = id;
		this.name = name;
		this.age = age;
		this.work = work;
		System.out.println("这是Human 类的4个参数构造方法，作用创建Human类的一个实例对象");
	}


	/*public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public String getWork() {
		return work;
	}
	public void setWork(String work) {
		this.work = work;
	}
*/

	@Override
	public String toString() {
		return "Human [id=" + id + ", name=" + name + ", age=" + age + ", work=" + work + "]";
	}

	
}
