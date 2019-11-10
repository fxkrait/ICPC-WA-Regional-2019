package problems;
//Group 369
import java.util.Scanner;
public class Q {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String nums = scan.nextLine();
		String[] values = nums.split(" ");
		long A = Long.parseLong(values[0]);
		long B = Long.parseLong(values[1]);
		int sum = 0;
		if (A == 1) {
			System.out.println(B);
		} 
		else {
		while(A != B) {
			if(A < B) {
				sum++;
				A++;
			}
			else if(A % 2 == 0) {
				A /= 2;
				sum++;
			}else {
				sum++;
				A++;
			}
		}
			System.out.println(sum);
		}
		scan.close();
	}
	

}
