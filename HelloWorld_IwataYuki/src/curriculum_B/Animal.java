package curriculum_B;

public class Animal {
	
	// フィールド
	private String name;
	private double length;
	private int speed;
	
	// setter メソッド
	public void setName(String name) {
		this.name = name;
	}
	public void setLength(double length) {
		this.length = length;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
	// Getter メソッド
    public String getName() {
        return this.name;
    }
    public double getLength() {
        return this.length;
    }
    public int getSpeed() {
        return this.speed;
    }
    
 // 表示メソッド
    public void display() {
        System.out.println("動物名：" + this.getName());
        System.out.println("体長：" + this.getLength() + "m");
        System.out.println("速度：" + this.getSpeed() + "km/h");
    }
        	
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

	}

}
