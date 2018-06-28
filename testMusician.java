import java.util.Scanner;
public class testMusician {
		
	static boolean inYG = false;

	public static void main(String[] args) {
		//Main method
		Scanner keyboard = new Scanner(System.in);
	    System.out.println("Please enter musician name: ");
	    String b = keyboard.nextLine();  // local variable that user inputs and is stored as the data members/fields
	    System.out.println("Please enter his/her skill level (from 1-10): " );
	    int c = keyboard.nextInt(); 
	    System.out.println("Is he/she in our youth group? (yes or no)");
	    String d = keyboard.nextLine();  // local variable
	    if(d.equals("yes")) {
	    		inYG = true;
	    }
	    
	    else {
	    		inYG = false;
	    }
	    
	    
		Musician a = new Musician(b, c, inYG);
	      //object
		
		System.out.println(a);
	}

}
