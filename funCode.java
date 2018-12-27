/*

Name length
Age expectancy
Number Guess

author @Angphurba
*/



import java.util.Calendar;
import java.text.DecimalFormat;
import java.util.Random;
import java.util.Scanner;

public class funCode
{
  public static void main( String [] args )
  {
    
     Scanner scan = new Scanner(System.in);

     System.out.println("Enter your first name");
     String firstName = scan.nextLine();

     System.out.println("Hello " + firstName);
     System.out.println("Number of letters in your name: " + firstName.length());
     System.out.println("");  

     System.out.println("Enter the year you were born: ");
     int bornYear = Integer.parseInt(scan.nextLine());

     int currentYear = Calendar.getInstance().get(Calendar.YEAR);
     int yearApart = currentYear - bornYear;
     System.out.println("This year you will be " + yearApart + " years");

     double expectancy = 78.94;
     String pattern = "###.##";
     DecimalFormat decimalFormat = new DecimalFormat(pattern);
     System.out.println("The percentage of the expected life you've lived: " + decimalFormat.format((yearApart / expectancy) * 100));
        
   
     System.out.println("Enter a number between 1 and 20.");
     int num = Integer.parseInt(scan.nextLine());

     int max = 20, min = 1;
     Random no = new Random();
     int randomNum = no.nextInt((max - min) + 1) + min;
     System.out.println("The secret number is: " + randomNum);
     System.out.println("You'r guess was far by: " + Math.abs(randomNum - num)+"number.");
  }
}
