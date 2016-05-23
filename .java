import java.util.Scanner;

public class App {
	public static void main(String[] args) {

		// Introduction
		System.out.printf("\n\n");
		String welcoming = "//////////   Welcome to Stuck in a Nightmare!!!   \\\\\\\\\\";
		System.out.println(welcoming);
		System.out.printf("\n\n");

		// Start the story by asking level to choose
		int levelChosen = 0;
		Scanner levelInput = new Scanner(System.in);
		System.out.printf("Please pick your level of nightmare: \n\n");
		System.out.println("1 Beginner");
		System.out.println("2 Advanced");
		levelChosen = levelInput.nextInt();
		System.out.printf("\n\n");
		System.out.println("You chose: " + levelChosen);
		System.out.printf("\n\n");

		// If Beginner Level chosen by player
		if (levelChosen == 1) {
			System.out.println("You are straight out of college, you");
			System.out.println("have $80,000 USD in college loans, you");
			System.out.println("are looking for a job with a Bachelors");
			System.out.println("in Liberal Arts. You go to a job");
			System.out.println("interview and the receptionist drops");
			System.out.println("you off in a white room with 4 doors.");
			System.out.println("Please pick a door...");
			System.out.printf("\n\n");
			
			// Level 1 - Door chosen by player
			int doorChosen = 0;
			Scanner doorInput = new Scanner(System.in);
			doorChosen = doorInput.nextInt();
			System.out.printf("\n\n");
			
			// Door 1 result
			if (doorChosen == 1) {
				System.out.println("Door #1 = Axe to the face!");
				System.out.printf("\n\n");
				System.out.println("Game over, you're dead.");
			}
			
			// Door 2 result
			if (doorChosen == 2) {
				System.out.println("Door #2 = Your ex-girlfriend is pregnant!");
				System.out.printf("\n\n");
				System.out.println("Succeed thanks to government aid.");
			}
			
			// Door 3 result
			if (doorChosen == 3) {
				System.out.println("Door #3 = You win 1 million dollars!");
				System.out.printf("\n\n");
				System.out.println("Game over, fake money.");
			}
			
			// Door 4 result
			if (doorChosen == 4) {
				System.out.println("Door #4 = CAUGHT IN SLOW MOTION!");
				System.out.printf("\n\n");
				System.out.println("Game over, you will end up shutting down the game, it's not worth the wait.");
			}

		}

		// If Advanced Level chosen by player
		if (levelChosen == 2) {
			System.out.println("The world has been taken over by aliens.");
			System.out.println("Everyone you know has parished and you");
			System.out.println("are bleeding to death. You have chills,");
			System.out.println("you're weak, hungry, dehydrated. You");
			System.out.println("took refuge inside a building. The room");
			System.out.println("you are in has 4 compartments that will");
			System.out.println("trigger the alarm, so you have to stick");
			System.out.println("with what you'll get and make the most");
			System.out.println("of it. Please pick a compartment...");

			// Level 2 - Door chosen by player
			int doorChosen = 0;
			Scanner doorInput = new Scanner(System.in);
			doorChosen = doorInput.nextInt();
			System.out.printf("\n\n");

			// Door 1 result
			if (doorChosen == 1) {
				System.out.println("Door #1 = Knife");
				System.out.printf("\n\n");
				System.out.println("Game over, the alarm triggered an explosion!");
			}
			
			// Door 2 result
			if (doorChosen == 2) {
				System.out.println("Door #2 = Axe");
				System.out.printf("\n\n");
				System.out.println("Game over, the alarm triggered an explosion!");
			}
			
			// Door 3 result
			if (doorChosen == 3) {
				System.out.println("Door #3 = Shotgun");
				System.out.printf("\n\n");
				System.out.println("Game over, the alarm triggered an explosion!");
			}
			
			// Door 4 result
			if (doorChosen == 4) {
				System.out.println("Door #4 = Wooden Stick");
				System.out.printf("\n\n");
				System.out.println("Game over, the alarm triggered an explosion!");
			}

		
		}
		
		
		
	}
}
