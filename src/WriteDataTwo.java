
import java.io.FileOutputStream;

public class WriteDataTwo {
 public static void main(String[] args) throws Exception {
        //to write something to a file.
        
        //step-1 (open a stream)
        FileOutputStream fos=new FileOutputStream("d:/data/information.txt", false);
        //step-2 (write data on stream)
        String str="hello user, this data is written using java code";
        byte b[]=str.getBytes();
        fos.write(b,0,10);
        //step-3 (close the stream)
        fos.close();
        System.out.println("DATA STORED");
    }    
}
