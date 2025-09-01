package encapsulation_OOP;

class Employee {
	
/******************
 * 問３
 ******************/
	// privateフィールド
	private String employeeId;
	private String name;
	
// メソッド
	
    // setter of ID
	public void setEmployeeId(String id){
		 this.employeeId = id;
	}
	// getter of ID
	public String getEmployeeId(){
		return this.employeeId;
	}
	
	// setter of name
	public void setName(String name){
		this.name = name;
	}
	// getter of name
	public String getName(){
		return this.name;
	}

} 