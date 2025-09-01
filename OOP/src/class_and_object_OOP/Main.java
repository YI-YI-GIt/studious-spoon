package class_and_object_OOP;

public class Main{
	public static void main(String[] args) {
		// インスタンス生成
		Employee employee2 = new Employee();{
			employee2.employeeId = "E001";
			employee2.name = "佐藤太郎";
			employee2.showInfo();
		}
	}
}
