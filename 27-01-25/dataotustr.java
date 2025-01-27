
import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class dataotustr {
    public static void main(String[] args)throws IOException {
        FileOutputStream f=new FileOutputStream("C:\\Users\\DELL\\Desktop\\project\\java\\dk.txt",true);
        DataOutputStream d=new DataOutputStream(f);
        d.writeInt(123);
        d.writeUTF("ram");
        d.writeDouble(8795.50);
        d.close();
        f.close();
        System.out.println("success");
    }
    
}
