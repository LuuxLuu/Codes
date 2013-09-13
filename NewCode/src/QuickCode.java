
import java.util.Scanner;

public class QuickCode {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		String name;
		int age;
		int number;
		double winner = Math.random()* 10;
		
		System.out.println("What is your name?");
		name = keyboard.nextLine();
		
		System.out.println("What is your age?");
		age = keyboard.nextInt();
		
		System.out.println("Pick a number from 1-10");
		number = keyboard.nextInt();
		if(number < 1 || number > 10)
		{
			System.out.println("Out of bounds, pick another number");
			number = keyboard.nextInt();
		}
		
		System.out.println("Your name is "+ name + " and you are "+ age + " years old.");
		
		if(number == (int)winner)
		{
			System.out.println("Congratulations! The winning number is "+ (int)winner+ ". You picked " + number + ".");
		}
		else
			System.out.println("So sorry. The winning number is "+ (int)winner+ ". You picked " + number + ".");

	}

}
