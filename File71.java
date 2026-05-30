//Write Java Program to delete a file.
import java.nio.file.*;
import java.io.*;

public class File71 {
    public static void main(String[] args) {
        
       
        try {
            File f = new File("abc.txt");
            f.createNewFile();  // abc.txt create hogi
            System.out.println("File created successfully");
        } catch (Exception e) {
            System.out.println("Error creating file: " + e.getMessage());
        }

       
        try {
            Files.delete(Paths.get("abc.txt"));
            System.out.println("File deleted successfully");
        } catch (NoSuchFileException e) {
            System.out.println("File not found: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Error deleting file: " + e.getMessage());
        }
        
    }
}