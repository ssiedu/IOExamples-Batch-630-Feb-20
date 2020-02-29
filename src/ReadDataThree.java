import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReadDataThree {
 public static void main(String[] args) throws FileNotFoundException, IOException {
        FileInputStream fis=new FileInputStream("d:/data/info.txt");
        //step-2 (read the data from stream)
        System.out.println((char)fis.read());
        System.out.println((char)fis.read());
        System.out.println((char)fis.read());//->D
        fis.skip(3);//D,E,F
        System.out.println((char)fis.read());//G
        System.out.println((char)fis.read());//H
        fis.skip(5);//I,J,K,L,M
        System.out.println((char)fis.read());//N
        System.out.println((char)fis.read());//O
        
        //step-3 (close the connection)
        fis.close();
    }        
}
