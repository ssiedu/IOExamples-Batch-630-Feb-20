
import java.io.DataOutputStream;
import java.io.FileOutputStream;


public class DataOutputStreamExample {
    public static void main(String[] args) throws Exception {
        int ecode=1055;
        double sal=45000.55;
        boolean married=true;
        FileOutputStream fos=new FileOutputStream("d:/data/empinfo.txt");
        DataOutputStream dos=new DataOutputStream(fos);
        dos.writeInt(ecode);
        dos.writeDouble(sal);
        dos.writeBoolean(married);
        dos.close();
        fos.close();
        System.out.println("Data Stored");
    }
}
/*
    DataOutputStream    (writing the premitive values)
    void writeByte(byte)
    void writeShort(short)
    void writeInt(int)
    void writeLong(long)
    void writeFloat(float)
    void writeDouble(double)
    void writeBoolean(boolean)




*/
