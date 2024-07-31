package Hashmap;
import java.util.HashSet;
public class HashSetExample {
public static void main(String[]args){
HashSet<Integer> mynumbers=new HashSet<Integer>();
mynumbers.add(10);
mynumbers.add(20);
mynumbers.add(40);
for(int i=1;i<50;i++){
  if(mynumbers.contains(i)){
   System.out.println(i+"was found in the number");
  }else{
   System.out.println(i+"was not found in the number");
  }
}
}
}
