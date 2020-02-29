import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReadDataTwo {
  public static void main(String[] args) throws FileNotFoundException, IOException {
       
        //step-1 (open a stream between file<->program
        //FileInputStream fis=new FileInputStream("d:/data/info.txt");
        FileInputStream fis=new FileInputStream("d:/java4/Demo.java");
        //step-2 (read the data from stream)
        int size=fis.available();
        byte b[]=new byte[size];
        fis.read(b);
        String str=new String(b);
        System.out.println(str);
        
        //step-3 (close the connection)
        fis.close();
    }    
}
