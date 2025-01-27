import java.util.ArrayList;

public class collection2 {
     public static void main(String[] args) {
        ArrayList a=new ArrayList();
        a.add(123);
        a.add("DK");
        a.add(7.55);
        ArrayList a1=new ArrayList();
        a.add(123);
        a.add("DK");
        a.add(7.55);
        System.out.println(a);
        System.out.println(a1);
        a.retainAll(a1);
        System.out.println(a);
        System.out.println(a1);
    }
}
