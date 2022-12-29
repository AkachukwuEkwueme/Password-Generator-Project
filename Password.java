import java.util.Scanner;
import java.util.Random;

public class Password {
    


public static void main(String[] args){

   // passwordRules();
    String[] savedchoices = passwordRules();
    int passlength= Integer.parseInt(savedchoices[3]);
    String password = passwordGenerator(savedchoices[0],savedchoices[1],savedchoices[2],passlength);
    System.out.println(password);
    //System.out.println(passwordGenerator("ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890!@#$%^&*()_+", 15));

}
public static String[] passwordRules() { //Method for instructing rules for password
    Scanner myObj = new Scanner(System.in);

    System.out.println("\n Welcome to the MEDFetch App, for improving daily healthcare and making it more accessible");
    System.out.println("\n We will create you a password to keep your personal account secure");
    
    System.out.println("\n Do you want to use Letters (Uppercase and Lower)? Indicate with(Y/N)");
    String firstchoice = myObj.nextLine();
    System.out.println("Use of Letters: " + firstchoice);
    System.out.println("\n Do you want to use Numbers? Indicate with(Y/N)");
    String secondchoice = myObj.nextLine();
    System.out.println("Use of Numbers: " + secondchoice);
    System.out.println("\n Do you want to use Characters? Indicate with(Y/N)");
    String thirdchoice= myObj.nextLine();
    System.out.println("Use of Characters: " + thirdchoice);

    System.out.println("\n Enter the desired length of the Password (between 7 and 15)");
    int passlength = myObj.nextInt();
    System.out.println("Password length: " + passlength);
    while (passlength > 15 || passlength < 7) {
        System.out.println("\n Try again! The desired length of the Password must be between 7 and 15!");
        passlength = myObj.nextInt();
        // block of code to be executed if the condition is true
      }
    String stringpasslength = Integer.toString(passlength);
    String[] savedchoices= {firstchoice, secondchoice, thirdchoice, stringpasslength};
    return savedchoices;
   // if(condition)
    // block of code to be executed if the condition is true
    

}
public static String passwordGenerator(String firstchoice, String secondchoice, String thirdchoice, int passlength) { //Method for Generating password
    StringBuilder sb = new StringBuilder();
    Random random = new Random();
    String yes = "Y";
    String no = "N";
    String candidateChars = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890!@#$%^&*()_+";

    if(firstchoice.equals(yes) && secondchoice.equals(yes) && thirdchoice.equals(yes)){
        
        for (int i = 0; i < passlength; i++) {
            sb.append(candidateChars.charAt(random.nextInt(candidateChars.length())));
        }
//System.out.println("End");
}
    
   // else if (first choice == )
   // use else if loops for other conditions for user inputs
    return sb.toString();

}


static void passwordCheck() {

    //Method for instructing rules for password

}
}