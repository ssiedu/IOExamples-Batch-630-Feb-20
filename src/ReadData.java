import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;


public class ReadData {
    public static void main(String[] args) throws FileNotFoundException, IOException {
       
        //step-1 (open a stream between file<->program
        FileInputStream fis=new FileInputStream("d:/data/info.txt");
        //FileInputStream fis=new FileInputStream("d:/java4/Demo.java");
        //step-2 (read the data from stream)
        while(true){
            int n=fis.read();
            if(n==-1)break;
            System.out.print((char)n);
        }
        System.out.println();
        //step-3 (close the connection)
        fis.close();
    }
}
/*
    InputStream
    -----------
    int read()
    int read(byte[])
    int available()
    long skip(long)
    void close()





*/