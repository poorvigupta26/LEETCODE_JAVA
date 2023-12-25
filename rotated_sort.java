class Solution {
    public int search(int[] nums, int target) {
        return search_sorted(nums,target);
        
    }
    public static int index_of_arrays(int[] arr) {
		int primary_high=0;
		int i=0;
		while(i<arr.length-1 && arr[i]<arr[i+1]) {
			i++;
			primary_high=i;
		}
		return primary_high;
	}
	public static int search_sorted(int[] arr,int target) {
		int primary_lo=0;
		int primary_hi=index_of_arrays(arr);
		int secondary_lo=primary_hi+1;
		int secondary_hi=arr.length-1;
		if(arr[primary_lo]>target) {
			return binary_search(secondary_lo,secondary_hi,arr,target);
		}
		else {
			return binary_search(primary_lo,primary_hi,arr,target);
		}
				
	}
	public static int binary_search(int lo, int hi, int[] arr,int tag) {
		while(lo<=hi) {
			int mid=lo+((hi-lo)/2);
			if(arr[mid]==tag) {
				return mid;
			}
			else if(arr[mid]<tag) {
				lo=mid+1;
			}
			else {
				hi=mid-1;
			}
		}
		return -1;   
    }
    
}
