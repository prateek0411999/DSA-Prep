
public class Pattern {
	public static void main(String args[])
	{
		pattern1(5);
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
}
