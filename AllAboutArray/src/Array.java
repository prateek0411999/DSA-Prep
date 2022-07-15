import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Array {
	public static void main(String args[])
	{
//		//	syntax
//		//	datatype[] variable_new = new datatype[size];
////		int[] rollnos = new int[5];
////		int[] rollnos = {23, 12, 23, 33, 11};
		Scanner sc = new Scanner(System.in);
//		int[] rollnos; //declaration
//		rollnos = new int[5]; //initialization happens in heap memory i.e. memory is getting allocated
//		//taking input 
//		for(int j=0; j<5; j++)
//		{
//			rollnos[j] = sc.nextInt(); 
//		}
//		for(int j=0; j<5; j++)
//		{
//			System.out.println(rollnos[j] + " ");
//		}
//		
//		//Arrays class to string method to print arrayy
//		System.out.println(Arrays.toString(rollnos));
//		
		
		
		
		
		
		
		
		
		
		
		
		// 2d arrays
		
//		 1 2 3
//		 4 5 6 1
//		 7 8 9 
		// syntax
//		int[][]  arr = new int[3][]; specifying col size is not mandatory
//		int[][]  arr = new int[3][3];
//		int[][] arr = {
//		{1,2,3},   // 0th index
//		{4,5,6},  //  1st index
//		{7,8,9}		// 2nd index  i.e arr[2] will return [7,8,9]
//		};
//		
		// arr.length will return the no. of rows if it's [3][4] the we'll get 3 
		//taking input 
		int[][]  arr = new int[3][3];
//		for(int i=0; i<5; i++)
//		{
//			for(int j=0; j<5; j++)
//			{
//				arr[i][j] = sc.nextInt(); 
//			}
//		}
		
		for(int row=0; row < arr.length; row++)
		{
			for(int col=0; col < arr[row].length; col++)
			{
				arr[row][col] = sc.nextInt(); 
			}
		}
		//printing
		for(int row=0; row < arr.length; row++)
		{
			for(int col=0; col < arr[row].length; col++)
			{
				System.out.print(arr[row][col] + " ");
			}
			System.out.println();
		}
		
		//printing
			for(int row=0; row < arr.length; row++)
			{
				System.out.println(Arrays.toString(arr[row]));
			}
		
			
			
			// ArrayList
			// NEED -> coz we used to predefine the array size
			
			
			//syntax
			//ArrayList<datatype> = new ArrayList<>();
			ArrayList<Integer> list = new ArrayList<>();
			list.add(67);
			list.add(23);
			System.out.println(list);
			System.out.println(list.contains(22));
		
			int[] num = {1,10,12,1333};
			int[] returned_arr = runningSum(num);
			
			System.out.println(Arrays.toString(returned_arr));
	}

	static int[] runningSum(int[] nums)
	{
		// leetcode EZ
		int sum = 0;
        for(int i = 0; i< nums.length; i++)
        {
                sum += nums[i];
                nums[i] = sum;
        }
        return nums;
		
	}
	 public int maximumWealth(int[][] accounts) {
		 //leetcode ez
	        int largest_wealth = 0;
	        for(int row=0; row < accounts.length; row++)
	        {
	            int wealth = 0;
	            for(int col=0; col < accounts[row].length;       col++)
	            {
	                    wealth += accounts[row][col];
	            }
	            if(largest_wealth <= wealth)
	            {
	                largest_wealth = wealth;
	            }
	        }
	        return largest_wealth;
	    }
}
//