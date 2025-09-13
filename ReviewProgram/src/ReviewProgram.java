/*
 * Nikolay Merenko
 * September 12th 2025
 * Period 6
 * A program that prints messages according to the user's input.
 */
import java.util.Scanner; 

public class ReviewProgram { // class begins

	public static void main(String[] args) { //method begins
	
	Scanner in = new Scanner(System.in); 
	System.out.print("Enter your name: "); //input for first name
	String name = in.nextLine();
    System.out.println("Welcome, " + name + "!"); //output for first name
	System.out.print("Enter your age: "); //input for age
	int age = in.nextInt(); //output for age
	
	if (age <= 0){ 
	System.out.print("Your age cannot be that number, silly!"); //error statement
	return;
	} 
	
	if (age >= 123){ 
	System.out.print("There's no way you're that old!"); //error statement
	return;
	} 
	
	if (age >= 18 && age <= 122){ 
	System.out.print("Congratulations! You can vote!"); //output for adult age
	} 
	
	if (age <= 18 && age >= 1  ) { 
	System.out.print("You are not of age yet. You have to wait " + (18 - age) + " years to vote.");  //output for child age  
	}
	
	System.out.println();
	System.out.print("Enter your weighted GPA: "); //input for weighted gpa
	double wGPA = in.nextDouble(); //output
	
	if (wGPA < 0){
	    System.out.print("That's not possible. Try again!"); //error message
	    return;
	}
	
	System.out.print("Enter your cumulative GPA: "); //input for cumulative GPA
	double cGPA = in.nextDouble(); //output for cumulative GPA
	
	
	if (cGPA > wGPA){
	    System.out.print("Wait, that's not possible. Try again!"); //error message
	    return;
	}
	
	if (cGPA < 0){
	    System.out.print("That's not possible. Try again!"); // error message
	    return;
	}
	
	// various congratulatory messages (outputs) based on the GPA entered

	if (cGPA >= 4.5){
	    System.out.print("Wow, Amazing!!!");
	}
	
	if (cGPA >= 4 && cGPA <= 4.49 ){
	    System.out.print("You're doing great!");
	}
	
	if (cGPA >= 3.5 && cGPA <= 3.99 ){
	    System.out.print("You're doing well! Keep it up!");
	}
	
	if (cGPA >= 3 && cGPA <= 3.49 ){
	    System.out.print("Not bad! Keep going!");
	}
	
	if (cGPA >= 0.01 && cGPA <= 2.99 ){
	    System.out.print("You have room for improvement, but I believe in you!");
	}
	
	System.out.println();
    System.out.print("Enter your favorite number that is 3 digits or greater: "); //input for favorite 3 digit number
    int favNum = in.nextInt(); //output for favorite 3 digit number
   
    if (favNum < 100){
    System.out.print("Read the instructions again!"); //error message
    return;
    }
	
	System.out.println();
    System.out.print("Multiples of the length of your name: "); 

    for (int i = name.length(); i <= favNum; i += name.length()) { //used for loop to determine the multiples, with it stopping at the number the user indicated to be the "favNum"
    
    if (i > name.length()) { 
    System.out.print(", "); //ensures that commas seperate the multiples
    }

    System.out.print(i); //prints current multiple

} // for loop ends

	System.out.println(); // next line is moved to
	
	} //method ends

// note: code was tested in codeHS sandbox before being copied into github