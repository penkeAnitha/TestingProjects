package JavaDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
public class DateandTimeFormate{
 public static void main(String[]args){
     LocalDateTime myobj=LocalDateTime.now();
     System.out.println("before formatter:"+myobj);
     DateTimeFormatter myformat=DateTimeFormatter.ofPattern("dd:mm:yyyy hh:mm:ss");//to formate date time objects
     // ofpattern()use
     String formatteDate=myobj.format(myformat);
     System.out.println("after formatting:"+formatteDate);

 }
}
