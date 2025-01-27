
import java.io.FileOutputStream;
import java.io.IOException;

public class fileoutstr{
    public static void main(String[] args)throws IOException{
        FileOutputStream f=new FileOutputStream("C:\\Users\\DELL\\Desktop\\project\\java\\dk.txt",true);
        String s=" and i am devloper";
        for (int i = 0; i<s.length(); i++) {
            f.write(s.charAt(i));
        }
        f.close();
        System.out.println("success");
    }
}