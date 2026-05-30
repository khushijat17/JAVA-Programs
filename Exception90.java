import java.io.*;

class Exception90 {
    public static void main(String args[]) {

        try {
            FileReader fr = new FileReader("abc.txt"); // file may not exist
            BufferedReader br = new BufferedReader(fr);

            System.out.println(br.readLine());

            br.close();
        } 
        catch (IOException e) {
            System.out.println("Error: Input/Output problem");
        }
    }
}