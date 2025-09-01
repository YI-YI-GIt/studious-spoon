package encapsulation_OOP;

public class Main {

	public static void main(String[] args) {
		// Employeeオブジェクトの作成
		Employee employee = new Employee();
		
		employee.setEmployeeId("E002");
		employee.setName("田中花子");
		
		
		System.out.println("社員ID: " + employee.getEmployeeId() +
				", 名前: " + employee.getName());
		
	}

}
