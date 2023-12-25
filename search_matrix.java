package leetcode;

public class search_matrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][]arr= {{1,3,5,7},{10,11,16,20},{23,30,34,60}};
		int target=13;
		System.out.println(searchMatrix(arr, target));
	}
	public static boolean searchMatrix(int[][]arr, int tgt) {
		boolean flag=false;
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[0].length;j++) {
				if(arr[i][j]==tgt) {
					flag=true;
				}
			}
		}
		return flag;
	}

}
