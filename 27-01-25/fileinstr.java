
import java.io.FileInputStream;
import java.io.IOException;

public class fileinstr {
    public static void main(String[] args)throws IOException {
        FileInputStream f=new FileInputStream("C:\\Users\\DELL\\Desktop\\project\\java\\dk.txt");
        int ch=-1;
        while ((ch=f.read())!=-1) {
            System.out.println((char)ch); 
        }
        f.close();
        System.out.println("success");
    }
}
