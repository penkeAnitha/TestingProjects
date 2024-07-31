package ArrayList;
import java.util.ArrayList;
public class ArrayListExample2 {
 public static void main(String[]args){
 ArrayList<Integer>numbers=new ArrayList<Integer>();
numbers.add(10);
numbers.add(34);
numbers.add(50);
numbers.add(100);
//for(int i=0;i<numbers.size();i++){//
   //System.out.println(numbers.get(i));//

for(int i:numbers){
 System.out.println(i);
}
}
 }


