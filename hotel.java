import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Locale;

public class hotel {
		public boolean checkStay(int stay) {
			if (stay<1 || stay >7) {
				return false;
			}
			else {
				return true;
			}
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
		
		public boolean checkName(String name) {
			String tempTitle = convert(name);
			if(!(name.matches("^[ A-Za-z]+$")) || !(name.equals(tempTitle))){
				return false;
			}
			else {
				return true;
			}
		}
		
		public boolean checkDate(String date) {
			if(!(isValidFormat("dd-MM-yyyy", date, Locale.ENGLISH))) {
				return false;
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
