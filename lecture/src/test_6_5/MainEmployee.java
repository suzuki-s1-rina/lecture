package test_6_5;

import java.util.ArrayList;
import java.util.List;

// ①実行するクラス「MainEmployee」を作成せよ。
public class MainEmployee {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		/*
		 * ④実行するクラス内で、以下の表の従業員をインスタンス生成せよ。
		 * （③のsetterを使用せよ。）
		 */
		Employee employees[] = {new Employee(), new Employee(), new Employee(), new Employee(), new Employee()};

		employees[0].setName("田中");
		employees[0].setAge(20);
		employees[1].setName("山本");
		employees[1].setAge(22);
		employees[2].setName("渡辺");
		employees[2].setAge(24);
		employees[3].setName("片山");
		employees[3].setAge(26);
		employees[4].setName("藤井");
		employees[4].setAge(28);

		// ⑤実行するクラスでEmployeeのListを作成し、④で作成した従業員のインスタンスを追加せよ。
		List<Employee> employeeList = new ArrayList<>();

		for (int i = 0; i < employees.length; i++) {
			employeeList.add(employees[i]);
		}

		/*
		 * ⑥実行するクラスで⑤のListを使用し、
		 * 全従業員の名前と肩書を表示せよ。ただし、拡張for文を使用すること。
		 * 肩書については、
		 * 年齢が22歳以下の場合は、「新人」
		 *       23歳～26歳の場合は、「中堅」
		 *       27歳以上の場合は、「ベテラン」を出力せよ。
		 */
		for(Employee employee : employeeList) {
			if(employee.getAge() <= 22) {
				System.out.println(employee.getName() + " " + "新人");
			} else if (employee.getAge() <= 26) {
				System.out.println(employee.getName() + " " + "中堅");
			} else {
				System.out.println(employee.getName() + " " + "ベテラン");
			}
		}
	}
}
