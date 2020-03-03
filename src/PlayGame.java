
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;


public class PlayGame {

    public static void main(String[] args) throws Exception {

        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter Choice : 1 (New Game), 2 (Resume Last)");
        int choice=sc.nextInt();
        System.out.println("Horizontal Move : ");
        int v1=sc.nextInt();
        System.out.println("Vertical Move : ");
        int v2=sc.nextInt();
        
        Game g=null;
                
        if(choice==1){
            g=new Game();
        }else if(choice==2){
            //deserializing object
            //user want to continue last game
            //g=read-the-object-from-file(which was stored in last play)
            FileInputStream fis=new FileInputStream("d:/data/lastgame.txt");
            ObjectInputStream ois=new ObjectInputStream(fis);
            g=(Game) ois.readObject();
        }
        
        g.moveH(v1); g.moveV(v2);
        g.showPos();
        System.out.println("Preserving Game State....");
        //serializing object
        FileOutputStream fos=new FileOutputStream("d:/data/lastgame.txt");
        ObjectOutputStream oos=new ObjectOutputStream(fos);
        oos.writeObject(g);
        oos.close();
        fos.close();
        System.out.println("Ending Game.........");
        
        
    }
}
