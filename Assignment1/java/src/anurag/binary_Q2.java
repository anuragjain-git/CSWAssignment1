package anurag;

public class binary_Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int decimal = 10;
		String binary = "";
		while(decimal!=0) {
			int rem = decimal%2;
			decimal = decimal/2;
			binary+=rem;
		}
		System.out.println(binary);
	}
}