package anurag;

public class reverse_Q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 12345;
		String reverse = "";
		while(num != 0) {
			reverse+=num%10;
			num = num/10;
		}
		System.out.println(reverse);
	}

}
