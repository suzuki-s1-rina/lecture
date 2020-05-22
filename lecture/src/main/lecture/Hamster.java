package main.lecture;

public class Hamster {
	private String name;
	private int age;

	public Hamster() {

	}

	public Hamster(String name, int age) {
		this.name = name;
		this.age  = age;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getAge() {
		return age;
	}
}
