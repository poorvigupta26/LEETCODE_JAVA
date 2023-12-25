package leetcode;

public class median_2_sorted {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]arr1= {1,3};
		int[]arr2= {2};
		median(arr1, arr2);
	}
	public static void median(int[]arr1, int[]arr2) {
		int m=arr1.length;
		int n=arr2.length;
		int[]newarr=new int[m+n];
		for(int i=0;i<m;i++) {
			newarr[i]=arr1[i];
		}
		for(int i=m+1;i<m+n;i++) {
			newarr[i]=arr2[0];
		}
		for(int i=0;i<m+n;i++) {
			System.out.println(newarr[i]);
		}
	}
}
