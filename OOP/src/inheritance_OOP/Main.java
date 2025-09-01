package inheritance_OOP;

public class Main {

	public static void main(String[] args) {
		Employee fullTime = new FullTimeEmployee(null, null);
		Employee partTime = new PartTimeEmployee(null, null);
		
		int hoursWorked = 9;
		
		System.out.println("正社員の給与: " + fullTime.calculateDailyWage(hoursWorked) + " 円");
		System.out.println("パート社員の給与: " + partTime.calculateDailyWage(hoursWorked) + " 円");

	}

}
