package Hashmap;
import java.util.HashSet;

public class HashSetExercise {
 public static void main(String[]args){
    /*HashSet<String>  Car=new HashSet<String>();
     Car.add("bmw");
     Car.add("toyota");
     Car.add("suzuki");
     Car.add("volvo");
     Car.add("bmw");
     System.out.println(Car.contains("bmw"));*/

     HashSet<Integer>  numbers=new HashSet<Integer>();
     numbers.add(20);
     numbers.add(30);//duplicate number si 20;
     numbers.add(20);
     numbers.add(50);
     numbers.add(60);
     System.out.println(numbers);


 }
}


