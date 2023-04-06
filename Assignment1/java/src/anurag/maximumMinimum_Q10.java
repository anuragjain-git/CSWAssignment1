package anurag;

import java.util.Arrays;

public class maximumMinimum_Q10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1,2,3,4,5,6,7,9,70};
		int arr1[]=new int[arr.length-1];
		int k = 0;
		for(int i = 0,j =arr.length-1;i<j;i++,j--) {
			arr1[k] = arr[j];
			k+=1;
			arr1[k] = arr[i];
			k++;
			}
		System.out.println(Arrays.toString(arr1));
		}
	}