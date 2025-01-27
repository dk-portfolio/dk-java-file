import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
public class bufferreading {
    public static void main(String[] args)throws IOException{
        FileReader f=new FileReader("C:\\Users\\DELL\\Desktop\\project\\java\\dk.txt");
        BufferedReader b=new BufferedReader(f);
        String s=null;
        while ((s=b.readLine())!=null) { 
            System.out.println(s);
        }
        b.close();
        f.close();
        System.out.println("success");
    }
}

