package magic8Ball;
import java.util.Random;
import java.util.Scanner;

public class Magic8 {

	public static void main(String[] args) {
		Scanner keybrd = new Scanner(System.in);
		String question = "Your question here";
		System.out.println(question);
		String response = keybrd.nextLine();
		
		// Fill the array with at least five potential answers
		String[] answers = new String[6];
		answers[0] = "Yes";
		answers[1] = "Most Likely";
		answers[2] = "Reply Hazy, try again later";
		answers[3] = "Cannot Predict Now";
		answers[4] = "No";
		answers[5] = "Probably Not";
		
		// Choose one of the answers at random, then print it
		int min = 0;
		int min2 = 4;
		int max = 5;
		Random Random = new Random();
		int RandomNumber = Random.nextInt(max - min + 1) + min;
		int RandomNumber2 = Random.nextInt(max - min + 1) + min;
		if(RandomNumber == RandomNumber2) {
			RandomNumber = Random.nextInt(max - min2 + 1) + min2;
		}
		String Output = answers[RandomNumber].toString();
		System.out.println(Output);
	}

}
