
public class Program {

    public static void main(String[] args) {
        DictionaryOfManyTranslations d = new DictionaryOfManyTranslations();
        d.add("monkey", "apina");
        d.translate("monkey");
        System.out.println(d.translate("monkey"));
    }
}
