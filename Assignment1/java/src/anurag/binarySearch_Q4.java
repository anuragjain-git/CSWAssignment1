package anurag;

public class binarySearch_Q4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1,2,3,4,5,6,7,8};
		int search = 8;
		System.out.println(binary(arr,search));
	}
	
	public static int binary(int arr[], int search) {
		int low = 0;
		int high = arr.length-1 ;
		while(low<=high) {
			int mid = (low + high)/2 ;
			if(search==arr[mid]) {
				return mid;
			}
			else if(search<arr[mid]) {
				high=mid-1;
			}
			else if(search>arr[mid]) {
				low=mid+1;
			}
		}
		return -1;
		
	}

}
