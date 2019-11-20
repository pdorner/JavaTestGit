package dayTwo;

import java.util.Scanner;

import javafx.application.Application;
import javafx.stage.Stage;

public class dayThree extends Application {

	@Override
	public void start(Stage primaryStage) {
		Scanner sc = new Scanner(System.in);
		String hannah = "Did Hannah see bees? Hannah did.";
		System.out.println(hannah.length());
		System.out.println(hannah.charAt(12));
		System.out.println(hannah.indexOf('b'));
		String what = "Was it a car or a cat I saw?";
		System.out.println(what.substring(9, 12));

		String exercise = " Hallo I would demonstrate now some Methods";
		String test = "Hallo I would demonstrate now some Method";

		System.out.println(exercise.indexOf(12));
		System.out.println(exercise.startsWith("de"));
		System.out.println(exercise.compareTo(test));
		System.out.println(exercise.trim());
		System.out.println(exercise.replace("now", "later"));
		System.out.println(exercise.replaceAll("o", "a"));
		String[] arrOfStr = exercise.split("n");
		for (String a : arrOfStr)
			System.out.println(a);

		System.out.print("Enter your Name: ");
		String name = sc.nextLine();
		name = name.trim();
		String initial = "";	
		System.out.print(name.charAt(0));

		for (int i = 0; i < name.length(); i++) {
			if (name.charAt(i) == ' ')
				System.out.print("." + Character.toUpperCase(name.charAt(i + 1)));

		}
		
		//	°F = °C × 1,8 + 3s
		System.out.print("\nFanheit: ");
		double fan = sc.nextDouble();
		System.out.println(fan * 1.8  + 32 + " Celcius");
		
		
		System.out.print("Celcius : ");
		double cel = sc.nextDouble();
		System.out.println(cel);
		System.out.println((cel - 32) * 5/9 + " Fanheit");

		int i = sc.nextInt();
		int j = sc.nextInt();
		int k = sc.nextInt();
		int aver = (i+j+k)/3;
		System.out.println(aver);
		

	}

	public static void main(String[] args) {
		launch(args);
	}
}
