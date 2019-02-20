/**
 * Created by Yusra on 18/02/2019.
 */
import org.junit.*;
import static org.junit.Assert.*;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestUser {

    String name= "Yusra";
    user testUser= new user(name);
    /**
     TESTING INVALID VALES OF CNIC, BIRTHDAY AND NAME.
     */

    @Test
    public void CNIC()
    {

                /** This function should return FALSE for values < 13 or values > 13 */
        assertFalse("CNIC number less than 13.",testUser.checkCNIC("133028"));
        assertFalse("CNIC number greater than 13.",testUser.checkCNIC("1330287666666662466"));
        /** This function should return FALSE for CNIC THAT IS NOT IN DIGITS. */
        assertFalse("CNIC not in digits..",testUser.checkCNIC("One two three"));
    }

    @Test
    public void CNICPhotocopyTest()
    {

        /** This function should return FALSE for INVALID file paths and files NOT in .JPEG and .PNG*/
        assertFalse("File not in .jpeg or .png format.",testUser.CNIC_photo("C:/file.jpg"));
        assertFalse("Invalid Path!",testUser.CNIC_photo("C:/file$+-"));

    }


    @Test
    public void Birthday()
    {

        /** This function should return FALSE for invalid dates in format MM/DD/YYYY or YYYY/MM/DD */
        assertFalse("Invalid MM/DD/YYYY Format",testUser.BirthdayCheck("12/26/1996"));
        assertFalse("InvalidYYYY/MM/DD Format.",testUser.BirthdayCheck("1996/26/12"));
    }

    @Test
    public void NameCheck()
    {

        /** This function should return FALSE when the name is not in TITLE FORMAT */
        assertFalse("Name should be in title format.",testUser.checkName("YUSRA"));
        assertFalse("Name should be in title format.",testUser.checkName("yusra"));
    }

/**
 TESTING VALID VALES OF CNIC, BIRTHDAY AND NAME.
 */

@Test
public void CNIC_valid()
{

    /** This function should return TRUE for values of CNIC = 13 digit number */
    assertTrue("Valid CNIC.",testUser.checkCNIC("1330287666624"));
    assertTrue("Valid CNIC",testUser.checkCNIC( "1987625419286"));
}


    @Test
    public void Birthday_valid()
    {

        /** This function should return TRUE for valid dates in format DD/MM/YYYY */
        assertTrue("Invalid MM/DD/YYYY Format",testUser.BirthdayCheck("26-09-1996"));

    }

    @Test
    public void NameCheck_valid()
    {

        /** This function should return TRUE when the name is VALID in TITLE FORMAT */
        assertTrue("Name should be in title format.",testUser.checkName("Yusra"));

    }

    @Test
    public void CNICPhotocopyValid()
    {

        /** This function should return TRUE for VALID file paths and files in .JPEG and .PNG*/
        assertTrue("File accepted",testUser.CNIC_photo("C:/file.jpeg"));
        assertTrue("File accepted!",testUser.CNIC_photo("C:/randomfile.png"));

    }
}
