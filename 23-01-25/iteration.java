
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class iteration {
    public static void main(String[] args) {
        List a=new ArrayList();
        a.add(123);
        a.add("DK");
        a.add(14.16);
        a.add(null);
        ListIterator lit=a.listIterator();
        while (lit.hasNext()) {
            System.out.println(lit.next());
            
        }
        System.out.println("____");
        while (lit.hasPrevious()) {
            System.out.println(lit.previous());
        }
    }
}
