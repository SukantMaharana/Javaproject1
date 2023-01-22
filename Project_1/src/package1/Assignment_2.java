package package1;

public class Assignment_2 {
	
	public void M1() {
		this.M5();
		System.out.println("Default method");
		this.M2();
		this.M4();
		this.M3();
		
	}
	public void M2() {
		System.out.println("One Parametrized method");
		
	}
	public void M3() {
		System.out.println("Two Parameterized method");
		
	}
	public void M4() {
		System.out.println("Three Parameterized method");
		
	}
	public void M5() {
		System.out.println("Four Parameterized method");
		
	}
	
	public static void main(String[] args) {
		Assignment_2 obj1=new Assignment_2();
		obj1.M1();
		
	}
}
