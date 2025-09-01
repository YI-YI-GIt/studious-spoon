package solid＿OOP;

public class SalaryReporter {
	public void result(Payable employee) {
        System.out.println(employee.getName() + 
        		" さんの給料: " + employee.calculateSalary() + " 円");
    }

}
