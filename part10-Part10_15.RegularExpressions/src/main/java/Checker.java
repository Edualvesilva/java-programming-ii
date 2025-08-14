
public class Checker {

    private String daysWeek;
    private String allVowels;
    private String hours;
    
    
    public Checker() {
        this.daysWeek = "(mon|tue|wed|thu|fri|sat|sun)";
        this.allVowels = "[aeiou]+";
        this.hours = "(0[0-9]|1[0-9]|2[0-3]):[0-5][0-9]:[0-5][0-9]";
    }

    public boolean isDayOfWeek(String string) {
        if (string.matches(this.daysWeek)) {
            return true;

        } else {
            return false;
        }
    }

    public boolean allVowels(String string) {
        if (string.matches(this.allVowels)) {
            return true;
        }
        return false;
    }
    
    
    public boolean timeOfDay(String string){
    if(string.matches(hours)){
    return true;
    }
    return false;
    }
}
