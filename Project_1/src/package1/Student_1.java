package package1;

public class Student_1 {
	
	int age;
	int rollno;
	
	public void Welcome() 
	{
	System.out.println("Welcome to class");	
	}
	
	public void Automation() {
		System.out.println("Automation is too easy and cool !!!");
		
	}
	public void Space() {
		System.out.println("_______________________________");
		
	}
	public void name() {
		System.out.println("Student name is Sukant");
		
	}
	
	public static void main(String[] args) {
		Student_1 Sukant= new Student_1 ();
		Sukant.Welcome();
		Sukant.Automation();
		Sukant.Space();
		Sukant.name();
				Sukant.age=27;
				Sukant.rollno=11993;
				System.out.println("    Age :"+ Sukant.age);
				System.out.println(" Rollno :" +Sukant.rollno);
				
	}
}
