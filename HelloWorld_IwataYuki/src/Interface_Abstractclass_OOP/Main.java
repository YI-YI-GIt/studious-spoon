package Interface_Abstractclass_OOP;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		// リストの作成
		List<Employee> employees = new ArrayList<>();
		
		employees.add(new FullTimeEmployee(001, "田中"));
		employees.add(new FullTimeEmployee(002, "鈴木"));
		employees.add(new ContractEmployee(003, "佐藤"));
		employees.add(new ContractEmployee(004, "高橋"));
		
		// 仮の時間
		int hoursWorked = 9;

		// for-eachループ
		for(Employee e : employees) {
			int result = e.costForDay(hoursWorked);
			System.out.println(e.name + "さんの給料:" + result + "円");
			
		}
	}

}
