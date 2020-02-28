
import java.io.File;
import java.io.IOException;


public class FileExampleThree {
    public static void main(String[] args) throws IOException {
        File f=new File("d:/data/MyCode.java");
        boolean b=f.createNewFile();
        //File f=new File("d:/data/abc");
        //boolean b=f.mkdir();
        //boolean b=f.delete();
        /*
        File f1=new File("d:/data/demo.txt");
        File f2=new File("d:/abc/hello.txt");
        boolean b=f1.renameTo(f2);
        */
        if(b==true){
            System.out.println("operation success");
        }else{
            System.out.println("operation fail");
        }
    }
}
/*
    boolean mkdir()
    boolean delete()
    boolean renameTo(File)
    boolean createNewFile()

    File f1=new File("a.txt");
    File f2=new File("b.txt");

    boolean b=f1.renameTo(f2);







*/