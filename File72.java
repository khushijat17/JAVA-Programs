import java.nio.file.*;

public class File72 {
    public static void main(String[] args) {
        try {
            Path source = Paths.get("abc.txt");                    
            Path destination = Paths.get("folder/abc.txt");        

            Files.move(source, destination, StandardCopyOption.REPLACE_EXISTING);
            System.out.println("File moved successfully!");

        } catch (NoSuchFileException e) {
            System.out.println("File nahi mili: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}