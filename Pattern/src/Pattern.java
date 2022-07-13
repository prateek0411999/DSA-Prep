
public class Pattern {
	public static void main(String args[])
	{
		pattern5(5);
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
	
	static void pattern3(int n) {
//		*
//	   * *
//	  * * *
//	 * * * *
		for(int row = 1; row <= n; row++)	
		{
			int noOfSpaces = n - row;
			for (int col = 1; col <= noOfSpaces; col++)
			{
				System.out.print(" ");
			}
			
			int noOfCols = row;
			for (int col = 1; col <= noOfCols; col++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	
	static void pattern4(int n) {
//		  	 *            1 - 1
//		    * *     	  2 - 2
//		   * * *          3 - 3
//		  * * * *   	  4 - 4
//		 * * * * *        5 - 5
//		* * * * * *       6 - 6
//		 * * * * *        7 - 5
//		  * * * *         8 - 4
//		   * * *          9 - 3
//		    * *           10 - 2
//		     * 			  11 - 1
		
		for(int row = 1; row <= 2*n - 1; row++)	
		{
			int noOfSpaces = row < n ?  n - row : row - n;
			for (int col = 1; col <= noOfSpaces; col++)
			{
				System.out.print(" ");
			}
			
			int noOfCols = row > n ?  2*n - row : row;
			for (int col = 1; col <= noOfCols; col++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	
	
	    
		static void pattern5(int n) {

//			*       *       
//			 *     *  
//			  *   *   
//			   * *    
//			    *
//		
		for(int row = 1; row <= n; row++)	
		{
			int noOfSpaces = row;
			for (int col = 1; col <= noOfSpaces; col++)
			{
				System.out.print(" ");
			}
			
			int noOfCols = row == n ?  1 : 2;
			for (int col = 1; col <= noOfCols; col++)
			{
				System.out.print("*");
				int insideSpaces = 2*n - 2*row - 1; // 2*5 - 2*1 - 1
				for (int col1 = 1; col1 <= insideSpaces; col1++)
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

}
