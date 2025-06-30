
import java.util.HashMap;

public class Person {

    private HashMap<String, String> personInfo;

    public Person(String name, String adress) {
        this.personInfo = new HashMap<>();
        this.personInfo.put(name, adress);

    }

    
    public String toString(){
    
        for(String name : this.personInfo.keySet()){
        return name+"\n"+"  "+this.personInfo.get(name);
        
        }
    return null;
    }
}
