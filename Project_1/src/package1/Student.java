package package1;

public class Student {
	public int sub(int a, int b)
	{
		int sub=a-b;
		System.out.println("Subtract result is"+ sub);
		return sub;
	}
	public int mul (int a, int b)
	{
		int mul= a*b;
		System.out.println("multiply result is "+ mul);
		return mul;
	}
	public int div (int a, int b)
	{
		int div=a/b;
		System.out.println("divide result is"+ div);
		return div;
	}
	public float sum(int a, int b)
	{
		int sum = a+b;
		System.out.println("sum result is "+ sum);
		return sum;
	}
	public static void main(String[] args) {
		Student ref=new Student();
		int subref=ref.div(10, 2);
		int mulref=ref.mul(10, 8);
		int mulref1=ref.mul(subref, mulref);
		int divref=ref.div(19, 2);
		int mulref2=ref.mul(mulref1, divref);
		float sumref=ref.sum(mulref2, 15);
		System.out.println("The final result is --"+ sumref);
		
		
	}
	
	
}
