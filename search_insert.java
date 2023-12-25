package leetcode;

public class search_insert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]arr= {1,3};
		int tgt=2;
		//searchinsert(arr, tgt);
		System.out.println(searchinsert(arr, tgt));
	}
	public static int searchinsert(int[]arr, int tgt) {
		if(tgt>arr[arr.length-1]) {
			return arr.length;
		}
		else if(tgt<=arr[0]) {
			return 0;
		}
		int n=arr.length;
		int lo=0; //1
		int hi=n-1; //2
		int ans=0;
		while(lo<=hi) {
			int mid=lo+((hi-lo)/2); //1
		    //System.out.println(mid);
			if(arr[mid]==tgt) { //5==2 no
				return mid;
			}
			else if(arr[mid]>tgt) {
				ans=mid;
				hi--;
			}
			else {
				//ans=mid;
				lo++;
			}
		}
		return ans;
	}
}
