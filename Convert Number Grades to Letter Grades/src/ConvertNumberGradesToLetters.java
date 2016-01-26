import java.util.Scanner;
/*
 * Converting Number Grades to Letter Grades
 * by: Mike Ashley
 * 
 */
public class ConvertNumberGradesToLetters {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String choice = "y";
		while (choice.equalsIgnoreCase("y")) {

			int numGrade1 = 0;

			System.out.println("Enter your numerical grade: ");
			
			Scanner inputGrade = new Scanner(System.in);
			numGrade1 = inputGrade.nextInt();

			if (numGrade1 >= 88 && numGrade1 <= 100) {
				System.out.println("You got an A!");
			} else if (numGrade1 >= 80 && numGrade1 <= 87) {
				System.out.println("You got a B-not bad. ");
			} else if (numGrade1 >= 67 && numGrade1 <= 79) {
				System.out.println("You got a C-try harder!!");
			} else if (numGrade1 >= 60 && numGrade1 <= 66) {
				System.out.println("Dude you got a D!");
			} else if (numGrade1 < 60) {
				System.out.println("You FFFFAILED.");
			}
			
				System.out.println("Would you like to enter another grade?");
				choice = sc.nextLine();
		}
		sc.close();
		System.out.println("Goodbye!");
	}

}
