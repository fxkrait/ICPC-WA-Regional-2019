package problems;

import java.util.Scanner;




public class S {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int n = Integer.parseInt(input.nextLine());
		int a1, b1, a2, b2, tempMax;
		int max = -1;
		if (n != 0) {
			String firstLine = input.nextLine();
			Scanner lineScan = new Scanner(firstLine);
			// get first values
			a1 = lineScan.nextInt();
			b1 = lineScan.nextInt();
			for(int i = 2; i <= n; i++) {
				String line = input.nextLine();
				String[] inputVals = line.split(" ");
				a2 = Integer.parseInt(inputVals[0]);
				b2 = Integer.parseInt(inputVals[1]);
				//Sys5tem.out.println(a1 + "" + b1 + "" + a2 + "" + b2 + "");
				tempMax = getSpeed(a1, b1, a2, b2);
				if (tempMax > max) {
					max = tempMax;
				}
				a1 = a2;
				b1 = b2;
			}
			System.out.println(max);

		}
		
	}
	public static int getSpeed(int a1, int b1, int a2, int b2) {
		return (b2 - b1)/(a2-a1);
	}
}
