
import java.io.IOException;

public class checked{
    public static void main(String[] args) {
        int i=Integer.parseInt("ab");
        try {
            int j=System.in.read();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}