
import java.io.FileReader;


public class ReaderExample {

    public static void main(String[] args) throws Exception {
        FileReader reader=new FileReader("d:/data/somedata.txt");
        char ch[]=new char[10];
        reader.read(ch);
        for(char tmp:ch){
            System.out.print(tmp);
        }
         reader.close();
    }  
}
