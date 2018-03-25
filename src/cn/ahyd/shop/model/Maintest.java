package cn.ahyd.shop.model;

public class Maintest {
	public static void main(String[] args){
		Student student = new Student();
		student.setAge(18);
		student.setName("admin");
		
		Student student2 = new Student();
		student2.setAge(20);
		student2.setName("admin1");
		
		System.out.println(student.getAge()+"," + student.getName());
		System.out.println(student2.getAge()+"," + student2.getName());
	}
}
