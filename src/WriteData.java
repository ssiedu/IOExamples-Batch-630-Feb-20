
import java.io.FileOutputStream;


public class WriteData {
    public static void main(String[] args) throws Exception {
        //to write something to a file.
        
        //step-1 (open a stream)
        FileOutputStream fos=new FileOutputStream("d:/data/information.txt", false);
        //step-2 (write data on stream)
        fos.write(101);
        fos.write(102);
        fos.write(103);
        fos.write(104);
        fos.write(105);
        //step-3 (close the stream)
        fos.close();
        System.out.println("DATA STORED");
    }
}
/*
    OutputStream
    ---------------
    void write(int)
    void write(byte[])
    void write(byte[],int,int)
    void close()

*/
