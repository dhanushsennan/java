/*op
1 1 1 1 1 1
2 2 2 2 2 2
3 3 3 3 3 3
4 4 4 4 4 4
5 5 5 5 5 5
6 6 6 6 6 6
*/
class Pattern15
{
	public static void main(String[] args) 
	{
		
		int n=5;
		int a=1;
		for (int i=0;i<=n ;i++ )
		{
			for (int j=0;j<=n ;j++ )
			{
				System.out.print(a +" ");;
			}
			a++;
			System.out.println();
		}
	}
	
}
