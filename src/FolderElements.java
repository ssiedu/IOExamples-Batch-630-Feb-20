
import java.io.File;

public class FolderElements {

    public static void main(String[] args) {

        File f = new File("d:/java4");

        if (f.isDirectory()) {
            String s[] = f.list();
            for (String item : s) {
                System.out.println(item);
            }
        }else{
            System.out.println("Not Found Or Not A Folder");
        }
                
    }
}
/*
    String[] list()
 */
