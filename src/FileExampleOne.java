
import java.io.File;

public class FileExampleOne {

    public static void main(String[] args) {
        File f=new File("d:/data/info.txt");
        //File f=new File("d:/data/demo.txt");
        //File f = new File("d:/data/trial.txt");
        boolean b=f.exists();
        if(b==true){
            long v = f.length();
            System.out.println(v);
        }else{
            System.out.println("Not Available .. ");
        }
    }
}
/*
    File (non-static)

    long length()
    boolean exists()
    boolean isFile()
    boolean isDirectory()
    String[] list()
    boolean isHidden()
    boolean canWrite()
    long lastModified()

 */
