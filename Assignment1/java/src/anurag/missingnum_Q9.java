package anurag;

public class missingnum_Q9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1,4,2,9,6,0};
		boolean[] present = new boolean[arr.length];
		for(int i=0; i<arr.length;i++) {
			if(arr[i]<arr.length) {
				present[arr[i]]=true;
			}
		}
		for(int i=0; i<arr.length;i++) {
			if(present[i]==false){
				System.out.println(i);
				return;
			}
		}
	}
}
