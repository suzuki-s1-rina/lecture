package test_6_6;

import java.util.ArrayList;
import java.util.List;

import test_6_5.Employee;

public class MainEmployee {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		//new Employee(String,int)にしたかったが..
		//④
		Employee employee1 = new Employee();
		Employee employee2 = new Employee();
		Employee employee3 = new Employee();
		Employee employee4 = new Employee();
		Employee employee5 = new Employee();

		employee1.setName("田中");
		employee2.setName("山本");
		employee3.setName("渡部");
		employee4.setName("片山");
		employee5.setName("藤井");

		employee1.setAge(20);
		employee2.setAge(22);
		employee3.setAge(24);
		employee4.setAge(26);
		employee5.setAge(28);

		//⑤
		List<Employee> employees = new ArrayList<>();

		employees.add(employee1);
		employees.add(employee2);
		employees.add(employee3);
		employees.add(employee4);
		employees.add(employee5);

		//⑥employeesに格納された要素分繰り返す
		for (Employee employee : employees) {
			if (employee.getAge() <= 23) {
				System.out.println(employee.getName() + " 新人");
			} else if (employee.getAge() >= 23 || employee.getAge() <27) {
				System.out.println(employee.getName() + " 中堅");

				//else {}やelse if()を行ったが処理が通らなかったためこの形で提出になります
			} else {
				System.out.println(employee.getName() + " ベテラン");
			}
			}
		}
	}