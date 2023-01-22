package package1;

public class Assignment_1 {
	
public Assignment_1 () 
{
	this (12);
	System.out.println("Default constructor");
}

public Assignment_1(int a) {
	this (12,14,15,16);
	
	System.out.println("one parametrized constructor");
}

public Assignment_1(int a, int b) {
	this (12,13,14);
	
	System.out.println("two parametrized constructor");
}

public Assignment_1(int a, int b,int c) {
	this ();
	
	System.out.println("three parametrized constructor");
}
public Assignment_1(int a, int b,int c,int d) {
     
	System.out.println("four parametrized constructor");
}

public static void main(String[] args) {
	Assignment_1 obj1=new Assignment_1(32,33);
}
}
