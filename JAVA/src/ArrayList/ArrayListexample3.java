package ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListexample3 {
public static void main(String[]args){
 ArrayList <String> fruit=new ArrayList<String>();
 fruit.add("apple");
 fruit.add("orange");
 fruit.add("grapes");
 fruit.add("papaya");
 Collections.sort(fruit);
 System.out.println(fruit);
}

}
