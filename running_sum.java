package leetcode;

public class running_sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]nums = {1,2,3,4};
		running_sum(nums);
	}
	public static int[] running_sum(int[]nums) {
		int[]arr=new int[nums.length];
		for(int i=0;i<nums.length;i++) {
			int sum=0;
			for(int j=0;j<=i;j++) {
				sum+=nums[j];
			}
			arr[i]+=sum;
		}
		return arr;
	}

}
