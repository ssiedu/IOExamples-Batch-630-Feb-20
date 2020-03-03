import java.io.Serializable;

public class Game implements Serializable {
    
    private int xPos;
    private transient int yPos;
    
    public void showPos(){
        System.out.println("Current Pos : "+xPos+","+yPos);
    }
    public void moveV(int pts){
        yPos=yPos+pts;
    }
    public void moveH(int pts){
        xPos=xPos+pts;
    }
    
    
}
