package inheritance_OOP;

class FullTimeEmployee extends Employee{
	 private static final int HOURLY_RATE = 1200;
	 
	 public FullTimeEmployee(String id, String name) {
		 super(id, name);
	 }
	 
	 @Override
	   public int calculateDailyWage(int hoursWorked) {
		 if (hoursWorked <= 8) {
			 return hoursWorked * HOURLY_RATE;
		 }else {
			 int regular = 8 * HOURLY_RATE;
			 int overworkHours = hoursWorked - 8;
			 int overworkFee = (int)(overworkHours * HOURLY_RATE * 1.25);
			 return regular + overworkFee;
		 }
	 }

}
