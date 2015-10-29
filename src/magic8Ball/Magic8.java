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
		answers[1] = "No";
		answers[2] = "Reply Hazy, try again later";
		answers[3] = "Cannot Predict Now";
		answers[4] = "Most Likely";
		answers[5] = "Probably Not";
		
		// Choose one of the answers at random, then print it
		int min = 0;
		int max = 5;
		Random Random = new Random();
		int RandomNumber = Random.nextInt(max - min + 1) + min;
		String Output = answers[RandomNumber].toString();
		System.out.println(Output);
	}

}
