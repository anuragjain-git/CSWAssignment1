package anurag;

public class maxsum_Q6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {-1,2,3,-2,5,9,-1,2};
		int currsum = 0;
		int sum = 0;
		for (int i=0;i<arr.length;i++) {
			if(currsum + arr[i] >= 0) {
				currsum = currsum+arr[i];
				if(sum < currsum) {
					sum = currsum;
				}
			}
			else {
				currsum=0;
			}
		}
		System.out.println(sum);
	}
}