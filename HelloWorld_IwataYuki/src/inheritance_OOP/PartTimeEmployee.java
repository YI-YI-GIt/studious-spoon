package inheritance_OOP;

class PartTimeEmployee extends Employee{
	private static final int HOURLY_RATE = 1000;
	
	public PartTimeEmployee(String id, String name) {
        super(id, name);
    }

    @Override
    public int calculateDailyWage(int hoursWorked) {
        return hoursWorked * HOURLY_RATE;
    }

}
