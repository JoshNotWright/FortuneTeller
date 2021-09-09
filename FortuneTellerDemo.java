/*

Ask the user for the user’s first name.

Ask the user for the user’s last name.

Ask the user for the user’s age.

Ask the user for the user’s birth month (as an 'int').

Ask the user for the user’s favorite ROYGBIV color.

If the user does not know what ROYGBIV is, ask the user to enter “Help” to get a list of the ROYGBIV colors.

Ask the user for the user's number of siblings.


*/
import java.util.Scanner;

public class FortuneTellerDemo {
    public static void main(String args[]) {

      // Get User Information
      Scanner inputScanner = new Scanner(System.in);
      System.out.println("What is your first name?");
      String firstName = inputScanner.nextLine();
      
      System.out.println("What is your last name?");
      String lastName = inputScanner.nextLine();
      
      System.out.println("What is your favorite ROYGBIV color?");
      String favoriteColor = inputScanner.nextLine();
      
      System.out.println("What is your age?");
      int age = inputScanner.nextInt();
      
      System.out.println("What month were you born in?");
      int birthMonth = inputScanner.nextInt();
      
      System.out.println("How many siblings do you have?");
      int numOfSiblings = inputScanner.nextInt();
      
      // Calculate Retirement Age
      int yearsToRetire = 0;
      if(age%2 == 0){
          yearsToRetire = 12;
      }
      else{
          yearsToRetire = 14;
      }
      
      // Calculate Vacation Location
      String vacationLocation = "";
      if(numOfSiblings == 0){
          vacationLocation = "Boca Raton, FL";
      }else if(numOfSiblings == 1){
          vacationLocation = "Nassau, Bahamas";
      }else if(numOfSiblings == 2){
          vacationLocation = "Ponta Negra, Brazil";
      }else if(numOfSiblings == 3){
          vacationLocation = "Portland, Oregon";
      }else if(numOfSiblings > 3){
          vacationLocation = "Baton Rouge, LA";
      }else if(numOfSiblings < 0){
          vacationLocation = "Chernobyl, Ukraine";
      }
      
      // Calculate Mode of Transportation
      String modeOfTransport = "";
      switch(favoriteColor.toLowerCase()){
          case "red":
              modeOfTransport = "Maserati";
              break;
          case "orange":
              modeOfTransport = "stallion";
              break;
          case "yellow":
              modeOfTransport = "chariot";
              break;
          case "green":
              modeOfTransport = "taxi";
              break;
          case "blue":
              modeOfTransport = "rickshaw";
              break;
          case "indigo":
              modeOfTransport = "motor scooter";
              break;
          case "violet":
              modeOfTransport = "flying saucer";
              break;
      }
      
      // Calculate Bank Balance
      String bankBalance = "";
      if (birthMonth > 0 && birthMonth < 5) {
          bankBalance = "$256,000.76";
      }else if(birthMonth > 4 && birthMonth < 9) {
          bankBalance = "$3,687,105.42";
      }else if(birthMonth > 8 && birthMonth < 13) {
          bankBalance = "$86.23";
      }else {
          bankBalance = "$0.00";
      }
      
      // Display Fortune
      String fortune = firstName + " " + lastName
              + " will retire in " + yearsToRetire
              + " years with " + bankBalance
              + " in the bank, a vacation home in "
              + vacationLocation + ", and will travel by "
              + modeOfTransport + ".";
      System.out.println(fortune);      
    }      
}