package inheritance_OOP;

abstract class Employee {
	
	private String employeeId;
	private String name;
	// コンストラクタ
	public Employee(String id, String name){
		this.employeeId = id;
		this.name = name;
	}
	// メソッド
	public String getEmployeeId() {
		return employeeId;
	}
	public String getName() {
		return name;
	}
	public abstract int calculateDailyWage(int hoursWorked) ;
}
