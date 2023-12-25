package leetcode;

public class two_sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]nums= {7,2,11,15};
		int tgt=9;
		int[]ans=two_sum(nums, tgt);
		for(int i=0;i<2;i++){
			System.out.print(ans[i]+" ");
		}
	}
	public static int[]two_sum(int[]nums, int tgt) {
		int n=nums.length;
		int []arr=new int[2];
		for(int i=0;i<n;i++) {
			for(int j=i+1;j<n;j++) {
				if(nums[i]+nums[j]==tgt) {
					arr[0]=i;
					arr[1]=j;
				}
			}
		}
		return arr;
	}
}
