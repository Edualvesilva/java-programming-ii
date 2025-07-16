
import java.util.ArrayList;

public class Herd implements Movable {

    private ArrayList<Movable> herds;
    
    public Herd() {
        this.herds = new ArrayList<>();
    }
    
    public String toString() {
       String result = ""; 
       for(Movable m : this.herds){
       result += m.toString()+"\n";
       }
        return result;
    }
    
    public void addToHerd(Movable movable) {
        this.herds.add(movable);
        
    }
    
    public void move(int dx, int dy) {
        
        for (Movable i : this.herds) {
            i.move(dx, dy);
            
        }
    }
}
