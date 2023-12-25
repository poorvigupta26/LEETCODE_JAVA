package leetcode;

public class missing_num {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]arr= {1,0,3};
		System.out.println(missing(arr));
	}
	public static int missing(int[]arr) {
		int n=arr.length;
		/*int lo=0;
		int hi=n;
		int ans=0;*/
		int sum=0;
		int sum2=0;
		for(int i=0;i<n;i++) {
			sum+=arr[i];
		}
		for(int i=0;i<=n;i++) {
			sum2+=i;
		}
		return (sum2-sum);
	}

}
