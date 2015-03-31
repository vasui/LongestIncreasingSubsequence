# LongestIncreasingSubsequence

/*
 * Longest Increasing Subsequence
 * http://en.wikipedia.org/wiki/Longest_increasing_subsequence
 *
 *	not giving correct answer check again?
 * */

package intern;

public class LISS {

	public static void main(String[] args) {
		
		int[] input = {10, 4, 15, 12, 7, 12, 17, 14, 19, 5};
		System.out.println("Longest increasing subsequence is: "+LIS(input));
	}

	public static int LIS(int[] A)
	{
		int[] lis = new int[A.length+1];
//		lis[0] = 1;
		System.out.println("array length: "+A.length);
		
		for(int i=0; i< A.length; ++i){
	        lis[i] = 1;
	    }
		
		for(int i=0; i<A.length; i++)
		{
//			lis[i] =1;
			for(int j=0; j< i; j++)
			{
				if((A[i] > A[j]) && (lis[i] < lis[j]+1))
				{
					lis[i] = lis[j] +1;
				}
				else
				{
					lis[i] = 1;
				}
				
			}
		}
		
		int max = 0;
		for(int k=0; k<A.length; k++)
		{
			System.out.println("Array: "+lis[k]);
			if(max < lis[k])
				max=lis[k];
		}
		
		return max;
	}
}
