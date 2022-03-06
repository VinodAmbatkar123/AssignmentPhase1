package assistedpeoject;


public class LongestIncreasingSubsequent {
	public static int LIS(int[]arr,int i,int n,int prev) {
		if(i==n) {
			return 0;
		}
		int excl=LIS(arr,i+1,n,prev);
		int incl=0;
		if(arr[i]>prev) {
			incl=1+LIS(arr,i+1,n,arr[i]);
		}
		return Integer.max(incl,excl);
		
	}
	public static void main(String[] args) {
		int[]arr= {6,3,7,20,11,16,87,25,54,35,75,66,59};
System.out.println("the length of lis is"+LIS(arr,0,arr.length,Integer.MIN_VALUE));
}
}