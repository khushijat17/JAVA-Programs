//uses String method indexOf to determine the total number of occurrences of any given alphabet in a defined text.
import java.util.Scanner;
class Occurrence37 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a text:");
        String text = sc.nextLine();
        System.out.println("Enter alphabet to find:");
        char ch = sc.next().charAt(0);
        int index = text.indexOf(ch);
        int count = 0;
        while(index != -1){
            count++;
            index = text.indexOf(ch, index + 1);
        }
       System.out.println("Total occurrences of " + ch + " = " + count);
    }
}