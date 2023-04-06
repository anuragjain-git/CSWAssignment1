package anurag;

public class prime_Q1 {

	public static void main(String[] args) {
		boolean isPrime = false;
		int num = 23;
		
		for(int i=2;i<=Math.sqrt(num);i++) {
			if(num%i!=0) {
				isPrime = true;
			}
			else {
				isPrime = false;
			}
		}
		System.out.println(isPrime);

	}

}
