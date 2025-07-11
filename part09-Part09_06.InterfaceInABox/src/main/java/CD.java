
public class CD implements Packable {

    private String artist;
    private String cdName;
    private int publicationYear;
    private double weight = 0.1;

    public CD(String artist, String cdName, int publicationYear) {
        this.artist = artist;
        this.cdName = cdName;
        this.publicationYear = publicationYear;

    }

    public double weight() {
       
        return this.weight;
    }

    public String toString() {

        return this.artist + ": " + this.cdName + " (" + this.publicationYear + ")";
    }

}
