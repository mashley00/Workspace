import java.util.Scanner;

public class ChooseAdventureGame {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Welcome!!  What is your name? ");
		String answer = "yes";
		String playerName;
		String dragonName;
		int numberOfHeads =0;
		String slingShot, sword, bow_and_arrow;
		
		playerName = input.nextLine();

		System.out.println("Hi " + playerName + ", " + "would you like to play a game? (yes or no) "); // come
																										// back
																										// and
																										// finish
																										// yes
																										// or
																										// no
		answer = input.nextLine();
		while (answer.equalsIgnoreCase("yes")) {
			System.out.println("Excellent!  You are walking across a field and you encounter a fire-breathing dragon!  "
					+ "What would you do? (face the beast or run away?))"); // fix
																			// question

		System.out.println("You approach the dragon.  You see that he has____heads.  " + "enter one, two or three ");
			numberOfHeads = input.nextInt();
			if (numberOfHeads > 0 && numberOfHeads<= 3) {
		System.out.println("No one has ever faced a " + numberOfHeads + " headed dragon before! \n Choose your weapon. enter a weapon type");
			}
			else 
				System.out.println("Please enter a whole number between 1 and 3");
		System.out.println("Armed with your bow and arrow, you approach the dragon.  "
				+ "You can feel its fiery breath as you get close.  "
						+ "It stares at you with its____ eyes. Enter red or blue."); // fix
																						// this
																						// question

		System.out.println("Oh thank goodness!  Red-eyed dragons are friendly.  "
				+ "You pet it and become friends.  You name the dragon_______. Entername: Toothless:");
		dragonName = input.nextLine();

		System.out.println(playerName + "and" + dragonName + "live happily ever after.");

	}

}
}