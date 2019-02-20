/**
 * Created by Yusra on 17/02/2019.
 */
import java.util.Date;
import java.util.Locale;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.io.*;
import java.nio.file.InvalidPathException;
import java.util.Scanner;
import java.util.regex.Pattern;

public class user {
    Scanner input = new Scanner(System.in);
    private String CNIC;
    private String name;
    private String birthday;
    private String CNIC_photo;

    public user(String name)
    {
        if (!checkName(name))
        {
            System.out.print("Invalid Name Format.");
        }

        else
            this.name= name;


    }
    public boolean checkName(String name) {
		String tempTitle = convert(name);
		if(!(name.matches("^[ A-Za-z]+$")) || !(name.equals(tempTitle))){
			return false;
		}
		else {
			return true;
		}
	}

    public boolean checkCNIC(String a)
    {

       if ( !(a.matches("\\d{13}")))
       {
           return false;
       }
       this.CNIC=a;
       return true;
       }



    public String getBirthday() {
        return birthday;
    }

    public String getname() {
        return name;
    }

    public boolean BirthdayCheck(String bday) {
        String format = "dd-MM-yyyy";
        if (isValidFormat(format, bday, Locale.ENGLISH)) {
        	return true;
        }
        return false;
    }
    public boolean CNIC_photo(String path) {

            try {
                if ((path.matches("(.*).jpeg(.*)") || path.matches("(.*).png(.*)")))
                {
                    if ((!(path.matches("(.*)#@!+-^(.*)"))))

                        Paths.get(path);
                }
                else {
                    System.out.println("Invalid path!");
                    return false;
                }

        } catch (InvalidPathException | NullPointerException ex)
        {
            {
                this.CNIC_photo = null;
                System.out.println("Invalid path!");
                return false;
            }
        }
        if (this.CNIC_photo!=null)
        {
            this.CNIC_photo= path;

        }
        return true;
        }
    
    public static boolean isValidFormat(String format, String value, Locale locale) {
	    LocalDateTime ldt = null;
	    DateTimeFormatter fomatter = DateTimeFormatter.ofPattern(format, locale);

	    try {
	        ldt = LocalDateTime.parse(value, fomatter);
	        String result = ldt.format(fomatter);
	        return result.equals(value);
	    } catch (DateTimeParseException e) {
	        try {
	            LocalDate ld = LocalDate.parse(value, fomatter);
	            String result = ld.format(fomatter);
	            return result.equals(value);
	        } catch (DateTimeParseException exp) {
	            try {
	                LocalTime lt = LocalTime.parse(value, fomatter);
	                String result = lt.format(fomatter);
	                return result.equals(value);
	            } catch (DateTimeParseException e2) {
	                // Debugging purposes
	                //e2.printStackTrace();
	            }
	        }
	    }

	    return false;
	}
	
	public static String convert(String text) {
	    if (text == null || text.isEmpty()) {
	        return text;
	    }
	 
	    StringBuilder converted = new StringBuilder();
	 
	    boolean convertNext = true;
	    for (char ch : text.toCharArray()) {
	        if (Character.isSpaceChar(ch)) {
	            convertNext = true;
	        } else if (convertNext) {
	            ch = Character.toTitleCase(ch);
	            convertNext = false;
	        } else {
	            ch = Character.toLowerCase(ch);
	        }
	        converted.append(ch);
	    }
	 
	    return converted.toString();
	}

    }


