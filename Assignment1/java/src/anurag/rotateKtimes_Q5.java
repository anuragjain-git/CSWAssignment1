package anurag;

import java.util.Arrays;

public class rotateKtimes_Q5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {10,20,30,40,50,60};
		int k  = 3;
		rotateArray(arr, 0, k-1);
		rotateArray(arr, k, arr.length-1);
		rotateArray(arr, 0, arr.length-1);
		System.out.println(Arrays.toString(arr));
	}
	public static int[] rotateArray(int[] arr, int start, int last) {
		for(int i = start, j=last; i<j; i++ , j--) {
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
		}
		return arr;
	}
}