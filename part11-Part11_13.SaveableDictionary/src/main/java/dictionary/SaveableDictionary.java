package dictionary;

import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;


public class SaveableDictionary {

    private HashMap<String, String> translation;
    private String file;
   
    
    public SaveableDictionary(){
    this.translation = new HashMap<>();
    }
    
    public SaveableDictionary(String file) {
        this.translation = new HashMap<>();
        this.file = file;
        
    }

    public void add(String words, String translation) {

        if (!this.translation.containsKey(words)) {
            this.translation.put(words, translation);
        }

    }

    public String translate(String word) {

        if (this.translation.containsKey(word)) {
            return this.translation.get(word);
        }

        for (String key : this.translation.keySet()) {
            if (this.translation.get(key).equals(word)) {
                return key;
            }
        }
        return null;
    }

    public void delete(String word) {

        this.translation.remove(word);
        List<String> keysToRemove = new ArrayList<>();
        for (String key : this.translation.keySet()) {
            if (this.translation.get(key).equals(word)) {
                keysToRemove.add(key);
            }
        }

        // Remove them safely
        for (String key : keysToRemove) {
            this.translation.remove(key);
        }

    }

    public boolean load() {

        try {
            Scanner fileScanner = new Scanner(new File(this.file));
            while (fileScanner.hasNextLine()) {
                String line = fileScanner.nextLine();
                String[] parts = line.split(":");
                if (parts.length == 2) {
                    this.translation.put(parts[0], parts[1]);
                }

            }
            fileScanner.close();
            return true;

        } catch (FileNotFoundException e) {
            return false;
        }

    }
    
    
    public boolean save(){
    
        try {
            PrintWriter writer = new PrintWriter(this.file);
            for(String s: this.translation.keySet()){
            writer.println(s+":"+this.translation.get(s));
            }
            writer.close();
            return true;
        } catch (Exception e) {
        return false;
        }
    
    }
    
}
