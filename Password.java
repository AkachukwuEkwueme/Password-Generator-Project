import java.util.Scanner;
import java.util.Random;

public class Password {
    


public static void main(String[] args){

    passwordRules();

}
static void passwordRules() { //Method for instructing rules for password
    Scanner myObj = new Scanner(System.in);

    System.out.println("\n Welcome to the MEDFetch App, for improving daily healthcare and making it more accessible");
    System.out.println("\n We will create you a password to keep your personal account secure");
    
    System.out.println("\n Do you want to use Letters (Uppercase and Lower)? Indicated with(Y/N)");
    String firstchoice = myObj.nextLine();
    System.out.println("Use of Letters: " + firstchoice);
    System.out.println("\n Do you want to use Numbers? Indicated with(Y/N)");
    String secondchoice = myObj.nextLine();
    System.out.println("Use of Numbers: " + secondchoice);
    System.out.println("\n Do you want to use Characters? Indicated with(Y/N)");
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
   return firstchoice, secondchoice, thirdchoice, passlength;
   // if(condition)
    // block of code to be executed if the condition is true
    

}
static void passwordGenerator() { //Method for Generating password

     

}


static void passwordCheck() {

    //Method for instructing rules for password

}
}