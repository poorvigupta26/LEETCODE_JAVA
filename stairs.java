package leetcode;

public class stairs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=4;
		System.out.println(stairs(n));
	}
	public static int stairs(int n) {
		int[]arr= {1,2,3};
		int ans=0;
		for(int i=0;i<arr.length;i++) {
			if(n==arr[i]) {
				return n;
			}
			else {
				ans=Fib(n);
			}
		}
		return ans;
	}
	public static int Fib(int n) {
		int n1 = 1, n2 = 1, n3;
        if (n == 0)
            return n1;
        for (int i = 2; i <= n; i++) {
            n3 = n1 + n2;
            n1 = n2;
            n2 = n3;
        }
        return n2;
	}

}
