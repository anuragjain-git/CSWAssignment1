package anurag;

import java.util.Arrays;

public class waveform_Q7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1,4,6,3,7,5};
		for(int i=1; i<arr.length; i=i+2) {
			if(arr[i-1]>arr[i]) {
				int temp = arr[i];
				arr[i] = arr[i-1];
				arr[i-1] = temp;
			}
			if ((i+1)<arr.length && arr[i+1]>arr[i]) {
				int temp = arr[i];
				arr[i] = arr[i+1];
				arr[i+1] = temp;
			}
			
		}
		System.out.println(Arrays.toString(arr));
	}

}
