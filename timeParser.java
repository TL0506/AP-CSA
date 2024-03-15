public class timeParser{
   public static void main(String[]args){
      String str = "0539";
      System.out.println(parseTime(str));
   }
   public static int parseTime(String timeStr) {
    try {
        // Remove leading and trailing spaces and make the input arrayse-insensitive
        timeStr = timeStr.trim().toLowerCase();

        // Convert the input string to a character array
        char[] array = timeStr.toCharArray();
        
        int time = 0;
        int hour = 0;
        int minute = 0;
        boolean isAm = false;
        boolean militaryTime = true;
        
        int count = 0;
        
        for( char c: array){
         if(isDigit(c))
            count++;
        } 
        if(!(count == 3 || count == 4)){
         System.out.println("Invalid amount of digits!");
        }
        
        int indexOfColon = 0;
        int colonCount = 0;
        for (int i=0; i <array.length; i++) {
            if (array[i] == ':') {
                indexOfColon = i;
                colonCount++;
            }
        }
        
        // there arrayn only be one or less colon
        if (colonCount > 1) {
            System.out.println("There arrayn only be 0-1 colons.");
            
        }
        if (colonCount == 1) {
           
            if (indexOfColon == 3) {
            
                if (!(array[1] == ':')) {
                    System.out.println("There are 3 numbers, the colon's in the wrong spot.");
                    
                }
            } else {
               
                if (!(array[2] == ':')) {
                    System.out.println("There are 4 numbers, the colon's in the wrong spot.");
                    
                }
            }
        }
        if (indexOfColon == 3) {
            
            boolean wrong = false;
            if (!isDigit(array[0])) wrong = true;
            if (!isDigit(array[1 + colonCount])) wrong = true; // the minutes should be offset by the existance of a colon
            if (!isDigit(array[2 + colonCount])) wrong = true;
            
            if (wrong) {
                System.out.println("There are 3 numbers, the numbers are in the wrong spot.");
                
            }
        } else { // there are 4 digits
            boolean wrong = false;
            if (!isDigit(array[0])) wrong = true;
            if (!isDigit(array[1])) wrong = true;
            if (!isDigit(array[2 + colonCount])) wrong = true;
            if (!isDigit(array[3 + colonCount])) wrong = true;
            
            if (wrong) {
                System.out.println("There are 4 numbers, the numbers are in the wrong spot.");
                
            }
        }
       String sa = "";
        for (char c : array) {
            if (!isDigit(c)) {
                sa += c;
            }
        }
       sa = sa
            .substring(colonCount) // remove the colon
            .trim(); // remove any remaining whitespace
        
        // if there are any letters, it can only be none, am, or pm. Either 0, or 2.
        // if there are any spaces between am and pm, or any extra letters, it won't be just 0 or 2.
        if (!(sa.length() == 0 || sa.length() == 2)) {
             System.out.println("There can only be 0/2 letters.");
            
        }
         if (sa.length() == 2) {
            
            militaryTime = false;
            
            // it can only be "am" or "pm".
            if (sa.equals("am")) {
                isAm = true;
            } else if (sa.equals("pm")) {
                
            } else {
                // if there are letters, but it's not either am or pm, we can only assume it's an invalid date.
                System.out.println("Invalid after letter thingy, it can only be am/pm");
                
            }
        }
        
        // now that we know if it's military time or not, we need to parse the time into hours and minutes
        // first, let's parse hours
        if (indexOfColon == 3) {
            
            hour = Character.getNumericValue(array[0]);
        } else {
            hour = (Character.getNumericValue(array[0])*10) + Character.getNumericValue(array[1]);
        }
        
        // if it's am/pm, the limit is 1-12
        if (!militaryTime) {
            if (hour == 0 || hour > 12) {
                System.out.println("Hours are out of range! The limit is 1-12.");    
            }
        
            if (hour == 12){
                hour = 0;
            }
            // if it's pm, hour += 12
            if (!isAm){
               hour += 12;
            }
      
            hour %= 24;
        }    
        else{
            // verify hours are under 24 (24 is invalid)
            if (!(hour < 24)) {
                System.out.println("Hours are out of range. The limit is 24.");
                
            }
        }
        if (indexOfColon == 3) {
            
            minute= (Character.getNumericValue(array[1 + colonCount]) * 10) + Character.getNumericValue(array[2 + colonCount]);
        } else {
           
            minute = (Character.getNumericValue(array[2 + colonCount]) * 10) + Character.getNumericValue(array[3 + colonCount]);
        }
        
        //  minute validation
       
        if (!(minute < 60)) {
            System.out.println("Minutes are out of range. The limit is 59.");
           
        }
        
   
        return (hour * 60) + minute;
       
       
       
    } catch (NumberFormatException e) {
        // Handle exceptions for invalid input
    }

    // Invalid input or parsing error
    return -1;
  }
  public static boolean isDigit(char character) {
        return Character.isDigit(character);
  }

}