package anurag;

import java.util.Arrays;

public class arrange_Q8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {5,2,4,3,1};
		for(int i=0;i<arr.length;i++) {
			while(arr[i]!=i && arr[i]<arr.length) {
				int temp = arr[i];
				arr[i] = arr[temp];
				arr[temp] = temp;
			}
			if(arr[i]>arr.length-1) {
				arr[i]=-1;
			}
		}
		System.out.println(Arrays.toString(arr));	}

}
