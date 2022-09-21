public class Loop {
	void m1(int m)
	{
		for (int i=0;i<=m;i++)
		{
			for (int j=m;j<=0;j--)
			{
				System.out.print("*");
			}
			System.out.println("");
		}
	}
	public static void main (String [] args){
	
	Loop loop = new Loop();
	loop.m1(5);
	}
}