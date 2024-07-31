package Hashmap;
import java.util.HashMap;

public class HashMapExample3 {
public static void main(String[]args){
HashMap<Long,String> mynumbers=new HashMap<Long,String>();
mynumbers.put(8978777L,"eighty nine billion seventy eight lakhs seventy seven thousand seven hundred");
mynumbers.put(3456789l,"thirty four billion fivty six lakhs seventy eighty thousand nine hundred");
mynumbers.put(56781023l,"fivty six billion seventy eight lakhs ten thousand twenty three hundred");
mynumbers.put(13456789l,"thirteen billion fourty five lakhs sixty seven thousand eighty nine hundred");
//System.out.println(mynumbers);//
//System.out.println(mynumbers.get(3456789l));//
 // System.out.println(mynumbers.size());
    mynumbers.clear();
    System.out.println(mynumbers);
}
}
