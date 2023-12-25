package leetcode;

public class sqrt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=3;
		System.out.println(mySqrt(x));
	}
	public static int mySqrt(int x) {
		if(x==0 || x==1) {
			return x;
		}
			long lo=1;
			long hi=x/2;
			long ans=0;
			while(lo<=hi) {
				long mid=lo+((hi-lo)/2);
			//	System.out.println(mid);
				if(mid*mid==x) {
					return(int) mid;
				}
				else if(mid*mid>x) {
					hi=mid-1;
				}
				else {
					ans=mid;
					lo=mid+1;
				}
			}
	return (int)ans;
	}

}
