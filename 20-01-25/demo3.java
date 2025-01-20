
import java.io.IOException;

public class demo3 {
    public static void main(String[] args) throws IOException{
        m1();
    }
    static void m1() throws IOException{
        m2();
    }
    static void m2() throws IOException{
        System.out.println("eneter char");
        int j=System.in.read();
        System.out.println("extered"+(char)j);
    } 
}
