import java.util.Scanner;

/**
 * 
 */

/**
 * @author michaelashley
 *
 */
public class MyClass {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//int x = 9;
		//int y = 7;

		Scanner scan1 = new Scanner(System.in);
		/*
		x=x+1;
		
		int y=0;
		
		System.out.println("the value of y = " +y);

		System.out.println("the value of x = " +x);
		*/
		
		scan1.close();
		
		int x = 5;
		String y = x>10 ? "Yes": "No";
		
		if(x > 10)
			y="yes";
			else
				y="no";
		
		System.out.println(y);
		
		
		
		
		//System.out.println(x++);
		//System.out.println(++x);
		//System.out.println(x++ + ++x);
		
		
		
	}

}
