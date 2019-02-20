/**
 * Created by Yusra on 17/02/2019.
 */
import java.util.Scanner;
public class Hotel {
    private int days;

    public Hotel() {
        System.out.println("Welcome to Hotel Transylvania!");

    }


    	public String checkAmount(int val) {
			if((val<1)||(val>25000 && val<50000)) {
				return null;
			}
			else if(val<=10000) {
				return "Studio";
			}
			else if(val<=25000) {
				return "Executive Studio";
			}
			else {
				return "Cabana";
			}
		}
        public boolean DaysCheck( int days)
        {
         if (days>7 || days < 1)
         {
             System.out.println("Invalid number of days");
             return false;

         }
         this.days=days;
         return true;
        }
        public String Rate( int rate )
     {

         if ( (rate <1 || rate >5) && rate !=0)
         {
             System.out.println("Invalid rating.");
              return null;
         }
      else if (rate==0)
         {
             System.out.println("THANKYOU FOR CHOOSING US FOR YOUR STAY.");
             System.out.println("Have a nice day!");
             return "Skipped";

         }
         else System.out.println("Thanks for the rating.");
         System.out.println("Enjoy your stay.");
         return "Rated";
         }
     }

