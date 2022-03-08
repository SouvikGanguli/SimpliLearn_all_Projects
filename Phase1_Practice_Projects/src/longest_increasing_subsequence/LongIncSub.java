package longest_increasing_subsequence;

public class LongIncSub {
	
	    public static int LIS(int[] arr, int j, int p, int str)
	    {
	        if (j == p) {
	            return 0;
	        }
	 
	        int st1 = LIS(arr, j + 1, p, str);
	        int st2 = 0;
	        if (arr[j] > str) {
	            st2 = 1 + LIS(arr, j + 1, p, arr[j]);
	        }
	        return Integer.max(st2, st1);
	    }
	 
	    public static void main(String[] args)
	    {
	        int[] arr = { 8,2,4,6,77,88,10,30,45,40,75,5,20,7,55,15,90,1 };
	 
	        System.out.print("The length of the LIS is "
	                        + LIS(arr, 0, arr.length, Integer.MIN_VALUE));
	    }

}
