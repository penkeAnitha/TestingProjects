package Hashmap;
import java.util.HashMap;

public class Hashmapexample1 {
 public static void main(String[]args){
HashMap<String,String>Capitalcities=new HashMap<String,String>();
Capitalcities.put(" Norway","Washington");
Capitalcities.put("England"," oslo");
Capitalcities.put("Germany"," Berlin");//key values.
Capitalcities.put("USA","London");
 System.out.println(Capitalcities.remove("Germany"));
 System.out.println(Capitalcities.size());
 Capitalcities.clear();
 System.out.println(Capitalcities);



         }
     }


