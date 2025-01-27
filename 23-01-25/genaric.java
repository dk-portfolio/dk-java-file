
import java.util.ArrayList;

public class genaric {
    public static void main(String[] args) {
        ArrayList a=new ArrayList();
        a.add(3);
        a.add("ab");
        a.add(2);
        a.add(3);
        System.out.println(sum(a));
    }
    static int sum(ArrayList a1){
        int s=0;
        for(Integer a:a1){
            Integer i=(Integer)a;
            s+=*i;
        }

    }
}
