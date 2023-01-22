package package1;

public class Algorithum {
	public int sum(int a, int b)
	{
		int res=a+b;
		System.out.println("sum result--"+ res);
		return res;
	}
	public int sub(int a, int b )
	{
		int res= a-b;
		System.out.println("sub result--"+ res);
		return res;
	}
	public float div (int a, int b)
	{
		int res= a/b;
		System.out.println("div result--"+ res);
		return res;
	}
	public int mul(int a, int b)
	{
		int res= a*b;
		System.out.println("mul result--"+res);
		return res;
	}
	public static void main(String[] args) {
		Algorithum ref= new Algorithum();
		int sumres1= ref.sum(10, 2);
		int sumres2=ref.sum(sumres1, 2);
		int subres1=ref.sub(sumres2, 2);
		int mulres1=ref.mul(subres1, 2);
		float divres=ref.div(mulres1, 2);
		
	System.out.println("Final result is - "+ divres);
		
				
	}
}
