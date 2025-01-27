
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class bufferwriting{
    public static void main(String[] args)throws IOException{
        FileWriter f=new FileWriter("C:\\Users\\DELL\\Desktop\\project\\java\\dk.txt");
        BufferedWriter b=new BufferedWriter(f);
        String s="i have complete BE course";
        b.newLine();
        b.write(s);
        b.flush();
        b.close();
        f.close();
        System.out.println("success");
    }
}