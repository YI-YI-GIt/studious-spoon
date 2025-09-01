package solid＿OOP;

public class SalaryCalculator{
	 public static void main(String[] args) {
		 Payable e1 = new FullTimeEmployee("田中", 20);
		 Payable e2 = new ContractEmployee("佐藤", 30);

	        SalaryReporter reporter = new SalaryReporter();
	        reporter.result(e1);
	        reporter.result(e2);
	    }
}

