package Interface_Abstractclass_OOP;

public class FullTimeEmployee extends Employee{
	private static final int HOURLY_RATE = 1250;
	
	public FullTimeEmployee(int id, String name) {
		super(id, name);
	}
	
	@Override
	public int costForDay(int hoursWorked) {
		int regularHours = Math.min(hoursWorked, 8);
		int overworkHours = Math.max(hoursWorked - 8, 0);
		double result = (regularHours * HOURLY_RATE) + (overworkHours * HOURLY_RATE * 1.25);
		
		return (int) result;
		}
}
