package za.ac.cput.dominicprzygonski.adp262s.assignment3;

/**
 *
 * @author Dominic Przygonski
 */

public class Main {
    
    public static void main(String[] args) {
        
       FormatingSerFile obj = new FormatingSerFile();
       obj.openFile();
       obj.readingObjects();
       obj.sortArrays();
       obj.createTxtFiles();
       obj.WriteToFile();
    }  
}
