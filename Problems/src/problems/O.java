package problems;

import java.util.Scanner;

public class O {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		System.out.println(findEvenOdd(N));
		
	}
	public static String findEvenOdd(int n) {
		if(n % 2 != 0) {
			return "Either";
		}
		else if((n / 2) % 2 == 0) {
			return "Even";
		}else {
			return "Odd";
		}
	}

}
