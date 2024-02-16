import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter; 

public class date_and_time {

    //display current date
  public static void main(String[] args) {
    LocalDate myObj = LocalDate.now(); 
    System.out.println(myObj); 

    //display current time
    LocalTime myObj1 = LocalTime.now();
    System.out.println(myObj1);

    //display current date and time
    LocalDateTime myObj2 = LocalDateTime.now();
    System.out.println(myObj2);


    //formatting date and time 
    LocalDateTime myDateObj = LocalDateTime.now();  
    System.out.println("Before formatting: " + myDateObj);  
    DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");  
    
    String formattedDate = myDateObj.format(myFormatObj);  
    System.out.println("After formatting: " + formattedDate);  
  }
}