package problems;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class U {
	public static void main(String[] args) throws FileNotFoundException {
		List<String> badWords = new ArrayList<String>();
		//Set<String> badWords = new HashSet<String>();
		List<String> plates = new ArrayList<String>();
		Map<Character,Character> leet = new HashMap<Character, Character>();
		leet.put('0', 'O');
		leet.put('1', 'L');
		leet.put('2', 'Z');
		leet.put('3', 'E');
		leet.put('5', 'S');
		leet.put('6', 'B');
		leet.put('7', 'T');
		leet.put('8', 'B');
		//System.out.println("badWords are: " + processedPlates);

		String word = "";
		boolean badWord = false;
		File f = new File("test3.txt");
		//Scanner input = new Scanner(System.in);
		Scanner input = new Scanner(f);
		String inputNums = input.nextLine();
		String[] inputVals = inputNums.split(" ");
		int n = Integer.parseInt(inputVals[0]);
		int m = Integer.parseInt(inputVals[1]);
		// add the badwords to a list
		for (int i = 1; i <= n; i++) {
			badWords.add(input.nextLine());
		}
		for (int j = 1; j <= m; j++) {
			word = input.nextLine();
			badWord = false;
			plates.add(word);
		}
		List<String> processedPlates = new ArrayList<String>();

		for (int i = 0; i <= plates.size() - 1; i++) {
			String curPlate = plates.get(i);
			StringBuilder sb = new StringBuilder();
			for (int j = 0; j <= curPlate.length() - 1; j++) {
				if (leet.containsKey(curPlate.charAt(j))) {
					sb.append(leet.get(curPlate.charAt(j)));
				} else {
					sb.append(curPlate.charAt(j));
				}
			}
			String procPlate = sb.toString();
			processedPlates.add(procPlate);
		}
		//System.out.println("processedPlates are: " + processedPlates);
		//System.out.println("processedPlates size are: " + processedPlates.size());

		for (int w = 0; w < processedPlates.size(); w++) {
			//System.out.println("w is: " + w);
			badWord = false;
			String plate = processedPlates.get(w);
			//System.out.println("plate is  " + plate);
			for (int i = 0; i < badWords.size(); i++) {
				if (plate.contains(badWords.get(i))) {
					System.out.println("INVALID");
					badWord = true;
				}
			}
			if (!badWord) {
				System.out.println("VALID");
			}

		}
		input.close();

	}
}