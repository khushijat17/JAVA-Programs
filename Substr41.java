//Write an application that finds the substring from any given string using substring method and startsWith & endsWith methods.
import java.util.Scanner;
class Substr41{
public static void main(String args[]){
Scanner sc =new Scanner(System.in);
System.out.println("Enter String :");
String str = sc.nextLine();
System.out.println("Enter Startstr :");
int s = sc.nextInt();
System.out.println("Enter Endstr :");
int e= sc.nextInt();
System.out.println("SubString :" + str.substring(s,e));
sc.nextLine(); // buffer clear (IMPORTANT)
//startwith
System.out.println("Enter prefix:");
String prefix = sc.nextLine();
if(str.startsWith(prefix)){
System.out.println("String starts with: " + prefix);
}else{
System.out.println("String does not starts with: " + prefix);
}
//endswith
System.out.println("Enter suffix:");
String suffix= sc.nextLine();
if(str.endsWith(suffix)){
System.out.println(" String Ends with:"+ suffix);
}else{
System.out.println(" String does not Ends with:"+ suffix);
}



}
}


