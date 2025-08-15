
import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;

public class Employees {

    private ArrayList<Person> listPeople;

    public Employees() {
        this.listPeople = new ArrayList<>();
    }

    public void add(Person personToAdd) {
        this.listPeople.add(personToAdd);
    }

    public void add(List<Person> peopleToAdd) {
        peopleToAdd.stream().forEach(person -> this.listPeople.add(person));
    }

    public void print() {
        this.listPeople.stream().forEach(person -> System.out.println(person));

    }

    public void print(Education education) {
        Iterator<Person> iterator = this.listPeople.iterator();

        while (iterator.hasNext()) {
           Person person = iterator.next(); 
        if (person.getEducation() == education) {
            System.out.println(person); 
        }
        }

    }

    public void fire(Education education){
    
    Iterator<Person> iterator = this.listPeople.iterator();
    
    while(iterator.hasNext()){
    Person person = iterator.next();
    
    if(person.getEducation() == education){
    iterator.remove();
    }
    
    }
    
    }
    
    
}
