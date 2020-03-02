
import java.io.FileWriter;

public class WriterExample {
    public static void main(String args[]) throws Exception {
        FileWriter writer=new FileWriter("d:/data/somedata.txt");
        //writer.write("some textual data.");
        String str="this text we are writing using java code";
        writer.write(str,10,15);
        writer.close();
        System.out.println("Data Stored");
    }
}
