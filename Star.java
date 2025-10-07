class  Star
{
	public static void test()
	{
		int n=5;
		for (int i=0;i<n;i++)
		{
			for (int j=0;j<n;j++)
			{
				if (i==0||j==0||j==n-1||i==3)
				{
					System.out.print("* ");
				}
				else
				{
					System.out.print("  ");
				}
			}
			System.out.println();
		
	}
	public static void main(String[] args) 
	{
		System.out.print(test);
		
		int n=5;
		for (int i=0;i<n;i++)
		{
			for (int j=0;j<n;j++)
			{
				if (i==0||j==0||j==n-1||i==3)
				{
					System.out.print("* ");
				}
				else
				{
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}
}