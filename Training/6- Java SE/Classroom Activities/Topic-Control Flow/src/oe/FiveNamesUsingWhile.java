package oe;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class FiveNamesUsingWhile {

	/**
	* Creates a new instance of FiveNamesUsingwhile
	*/
	public FiveNamesUsingWhile() {
	}
	
	/**
	* @param args the command line arguments
	*/
	
	public static void main(String[] args) {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String name = "";
		int counter = 0;
		
		//gets the users' name
		try{
			System.out.println("Enter name: ");
			name = reader.readLine();
		}catch(Exception e){
			System.out.println("Invalid input");
			System.exit(0);
		}

		// while loop that prints the name five times
		while (counter < 5){
			System.out.println(name);
			counter++;
		}
	}
}