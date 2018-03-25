package cn.anyd.shop.dao;

public class Student {
	
	
	private int age;
	private static String name;
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public static String getName() {
		return name;
	}
	public static void setName(String name) {
		Student.name = name;
	}

	
}