package package1;

public class Math {
	public int div(int a,int b)
	{
		int div=a/b;
		System.out.println("Divide result-"+div);
		return div;
	}
	public int sub(int a, int b)
	{
		int sub=a-b;
		System.out.println("subtract result-"+ sub);
		return sub;
	}

	public int sum(int a, int b)
	{
		int sum =a+b;
		System.out.println("sum result is-"+ sum);
		return sum;
	}
	public int sub2( int a, int b)
	{
		int sub2=a-b;
		System.out.println("subtract2 result is-"+ sub2);
		return sub2;
	}
	
	public float mul(int a, int b)
	{
		int mul= a*b;
		System.out.println("Multiply result is-"+ mul);
		return mul;
	}
	
	public static void main(String[] args) {
		Math res=new Math();
int divres=res.div(10, 2);
int subres=res.sub(divres, 2);
int sumres=res.sum(subres, 2);
int sub2res=res.sub2(sumres, 2);
float mulres=res.mul(sub2res, 2);
System.out.println("The final result is -"+ mulres );

	}
	
	

}
