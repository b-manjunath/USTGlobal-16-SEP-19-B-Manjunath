public class Recursion
{
	static int fact(int num)
	{
		if(num==1)
			return 1;
		int res = 1;
		res=num*fact(num-1);
		return res;
	}
	public static void main(String[] args) 
	{
		System.out.println(fact(5));
	}
}
