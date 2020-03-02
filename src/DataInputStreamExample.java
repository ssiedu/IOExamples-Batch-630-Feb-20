
import java.io.DataInputStream;
import java.io.FileInputStream;


public class DataInputStreamExample {
    public static void main(String[] args) throws Exception {
        //we will read the premitive data stored in empinfo.txt
        FileInputStream fis=new FileInputStream("d:/data/empinfo.txt");
        DataInputStream dis=new DataInputStream(fis);
        int v1=dis.readInt();
        double v2=dis.readDouble();
        boolean v3=dis.readBoolean();
        dis.close();
        fis.close();
        System.out.println("Ecode   : "+v1);
        System.out.println("Salary  : "+v2);
        System.out.println("Married : "+v3);
                
        
    }
}
/*
    DataInputStream (reading the premitive data)
    byte readByte()
    short readShort()
    int readInt()
    long readLong()
    float readFloat()
    double readDouble()
    boolean readBoolean()
*/