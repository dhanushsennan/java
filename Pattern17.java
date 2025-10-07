/*
5 4 3 2 1
5 4 3 2 1
5 4 3 2 1
5 4 3 2 1
5 4 3 2 1
*/
class Pattern17
{
	public static void main(String []args)
	{
		int n=5;
			for (int i=0;i<n ;i++ )
			{
			for (int j=0;j<n ;j++ )
			{
				System.out.print(n-j +" ");
			}
			System.out.println();
			}
	}
	
}