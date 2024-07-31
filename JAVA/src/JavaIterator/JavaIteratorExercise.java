package JavaIterator;
import java.util.ArrayList;
import java.util.Iterator;
public class JavaIteratorExercise {
    public static void main(String[] args) {
        ArrayList<Integer> number = new ArrayList<Integer>();
        number.add(2);
        number.add(8);
        number.add(10);
        number.add(3);
        number.add(7);
        number.add(11);
        number.remove(2);
        Iterator<Integer> it = number.iterator();
        System.out.println(number);
        while (it.hasNext()) {
            int i = it.next();
            if (i % 2 != 0) {
                it.remove();
            }
        }
        System.out.println(number);
    }
}