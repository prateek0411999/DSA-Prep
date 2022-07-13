
public class Pattern {
	public static void main(String args[])
	{
		pattern2(5);
	}
	static void pattern1(int n) {
//		****
//		***
//		**
//		*
		for(int row = 1; row <= n; row++)	
		{
			int noOfCols = n - row + 1;
			for (int col = 1; col <= noOfCols; col++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	static void pattern2(int n) {
//		*       1 - 1
//		**		2 - 2
//		***     3  - 3
//		****	4  - 4
//		***		5  - 3
//		**		6  - 2
//		*		7  - 1
		for(int row = 1; row <= 2*n -1 ; row++)	
		{
			int noOfCols = row > n ? 2*n - row : row;
			for (int col = 1; col <= noOfCols; col++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}
