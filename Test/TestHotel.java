import static org.junit.Assert.*;

import org.junit.*;

public class TestHotel {

    /**
     TESTING INVALID VALES OF AMOUNT, RATE, DAYS OF STAY.
     */
    Hotel test= new Hotel();

    @Test
    public void DaysTest()
    {

        /** This function should return FALSE for values < 0 or values > 7*/
        assertFalse("INVALID NUMBER OF DAYS",test.DaysCheck(8));
        assertFalse("INVALID NUMBER OF DAYS",test.DaysCheck(10));
        assertFalse("INVALID NUMBER OF DAYS",test.DaysCheck(-9));
        assertFalse("INVALID NUMBER OF DAYS",test.DaysCheck(-2));



    }
    @Test
    public void AmountTest()
    {

        /** This function should return FALSE for value between 25000 and 50000*/
        assertEquals("Studio",test.checkAmount(10000));
        assertEquals("Studio",test.checkAmount(1));
        assertEquals("Executive Studio",test.checkAmount(10001));
        assertEquals("Executive Studio",test.checkAmount(25000));
        assertEquals("Cabana",test.checkAmount(50000));
        assertEquals(null,test.checkAmount(25001));
        assertEquals(null,test.checkAmount(49999));
        assertEquals(null,test.checkAmount(0));
    }
    @Test
    public void RatingTest()
    {

        /** This function should return FALSE for values less than 1 or greater than 5*/
        assertEquals("Skipped",test.Rate(0));
        assertEquals("Rated",test.Rate(1));
        assertEquals("Rated",test.Rate(5));
        assertEquals(null,test.Rate(-1));
        assertEquals(null,test.Rate(6));


    }
    /**
     TESTING THE VALID VALES OF AMOUNT, RATE, DAYS OF STAY.
     */

    @Test
    public void DaysValid()
    {

        /** This function should return TRUE for values between 1 to 7*/
        assertTrue("VALID NUMBER OF DAYS",test.DaysCheck(7));
        assertTrue("VALID NUMBER OF DAYS",test.DaysCheck(1));
        assertFalse("INVALID NUMBER OF DAYS",test.DaysCheck(8));
        assertFalse("INVALID NUMBER OF DAYS",test.DaysCheck(0));




    }

    @Test
    public void RatingValid()
    {

        /** This function should return TRUE for values between 1 to 5*/
        assertEquals("Rated",test.Rate(1));
        assertEquals("Rated",test.Rate(5));
        assertEquals("Skipped",test.Rate(0));
        assertEquals(null,test.Rate(-1));
        assertEquals(null,test.Rate(6));
        


    }
}
