import java.io.FileReader;
import java.io.IOException;
public class filereading {
  public static void main(String[] args)throws IOException {
        FileReader f=new FileReader("C:\\Users\\DELL\\Desktop\\project\\java\\dk.txt");
        int ch=-1;
        while ((ch=f.read())!=-1) {
            System.out.println((char)ch); 
        }
        f.close();
        System.out.println("success");
    }
}

