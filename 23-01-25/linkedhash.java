import java.util.LinkedHashSet;
import java.util.Set;
public class linkedhash {
    public static void main(String[] args) {
        Set a=new LinkedHashSet();
        a.add(123);
        a.add("DK");
        a.add("DK");
        a.add(12.323);
        System.out.println(a);
    }
}
