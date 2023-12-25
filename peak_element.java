package leetcode;

import java.util.Arrays;

public class peak_element {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]n= {1,2,1,3,5,6,4};
		int x=peak(n);
		System.out.println(x);
	}
	public static int peak(int[]arr) {
	//	Arrays.sort(null);
		int n=arr.length;
		int lo=1;
		int hi=n-1;
		int ans=0;
		while(lo<=hi) {
			int mid=lo+((hi-lo)/2);
			if(arr[mid-1]<arr[mid] && arr[mid+1]<arr[mid]) {
				ans=mid;
				break;
			}
			else if(arr[mid]<arr[mid+1]) {
				lo=mid++;
			}
			else {
				hi=mid--;
			}
		}
		return ans;
		
	}
}
