
import java.io.FileInputStream;
import java.io.FileOutputStream;


public class BinaryReadWrite {

    public static void main(String[] args) throws Exception {
        String source="d:/images/preview.png";
        String dest="d:/data/sample.png";
        FileInputStream fis=new FileInputStream(source);
        FileOutputStream fos=new FileOutputStream(dest);
        //reading from inputstream
        //writing to outputsream
        while(true){
            int n=fis.read();
            if(n==-1)break;
            
            fos.write(n);
            
        }
        System.out.println("DATA COPIED.......");
        fis.close();
        fos.close();
        
        
        
        
    }
}
