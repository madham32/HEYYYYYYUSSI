/**
 * Created by Yusra on 17/02/2019.
 */
import java.util.Scanner;
public class Transylvania {
    public static void main( String args[])
    {
        Hotel Transylavnia = new Hotel();
        user user1;
        Scanner input = new Scanner(System.in);

     String CNIC_photo;
     String birthday;
     int days;
     int amount;
     String CNIC;

     System.out.println("Please enter the number of days you want to stay.");
        System.out.println("The number of days should be between 1 to 7.");
        days = input.nextInt();
        Transylavnia.DaysCheck(days);
     System.out.println("Please enter the amount you want to pay for a day.");
     amount= input.nextInt();
     Transylavnia.checkAmount(amount);
        System.out.println("Please enter your name.");
            String name = input.next();
        System.out.println("Hello " + name);
        user1 = new user(name);
        System.out.println("Please enter your CNIC number.");
       CNIC = input.next();
        user1.checkCNIC(CNIC);
        System.out.println("Please enter your birthday in DD/MM/YY Format.");
        birthday= input.next();
        user1.BirthdayCheck(birthday);
        System.out.println("Give the file path of your CNIC photocopy. [Accepted Formats are .jpeg and .png ONLY]");
        CNIC_photo= input.next();
        user1.CNIC_photo(CNIC_photo);
        System.out.println("Please rate your experience from 1 to 5");
        System.out.println("Or Enter 0 to skip rating.");
        int rate= input.nextInt();
        Transylavnia.Rate(rate);
    }
}
