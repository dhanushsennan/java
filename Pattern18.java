/*
a b c d e
a b c d e
a b c d e
a b c d e
a b c d e
*/
class Pattern18
{
	public static void main(String []args)
	{
		int n=5;
			for (int i=0;i<n ;i++ )
			{
			for (int j=0;j<n ;j++ )
			{
				char a=(char) ((char)96+n-j);

				System.out.print(a+" ");
			}
			System.out.println();
			}
	}
	
}