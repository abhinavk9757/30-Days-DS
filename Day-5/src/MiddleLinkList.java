import java.util.Iterator;
import java.util.LinkedList;

public class MiddleLinkList {
    public static void main(String[] args) {
        LinkedList<Integer> numbers = new LinkedList<>();
        for(int i =0; i<10;i++){
            numbers.add(i);
        }

        Iterator i1 = numbers.iterator();
        Iterator i2 = numbers.iterator();

        while(!i1.hasNext()){
            i1.next();
            if(i1.hasNext())i1.next();

            i2.next();
        }

        System.out.println(i2);


    }
}
