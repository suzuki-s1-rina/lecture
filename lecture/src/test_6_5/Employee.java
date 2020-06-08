package test_6_5;

// ②「名前」「年齢」のフィールドを持ったクラス「Employee」を作成せよ。
public class Employee {
	private String name;
	private int age;

	public Employee() {

	}

	// ③「Employee」にそれぞれのフィールドのgetterとsetterを作成せよ。
	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}
}
