package polymorphism_OOP;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		// リストの作成
		List<Employee> employees = new ArrayList<>();
		
		employees.add(new FullTimeEmployee("001", "田中"));
		employees.add(new ContractEmployee("002","鈴木"));
		
		int hoursWorked = 9;
		
		for(Employee e : employees) {
			int result = e.calculateDailyWage(hoursWorked);
			System.out.println(e.name + "さんの給料:" + result + "円");
		}

	}

}
