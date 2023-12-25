package leetcode;

public class perfect_square {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=223729;
		System.out.println(perfectsqr(n));
	}
	public static boolean perfectsqr(int n){
		if(n==1 || n==0) {
			return true;
		}
		long lo=2;
		long hi=n/2;
		while(lo<=hi){
			long mid=lo+((hi-lo)/2);
			if(mid*mid==n){
				return true;
			}
			else if(mid*mid>n){
				hi=mid-1;
			}
			else {
				lo=mid+1;
			}
		}
		return false;
	}
}
