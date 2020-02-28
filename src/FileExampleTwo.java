
import java.io.File;


public class FileExampleTwo {

    public static void main(String[] args) {
        //File f = new File("d:/data/info.txt");
        File f=new File("d:/java4/Test.java");
        long val=f.lastModified();
        System.out.println(val);
        java.util.Date dt=new java.util.Date(val);
        System.out.print(dt);
        //boolean b=f.isHidden();
        //boolean b=f.canWrite();
        //System.out.println(b);
    }
}
