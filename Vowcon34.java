// Write Java Program to count vowels and consonants in a string
import java.util.Scanner;
class Vowcon34{
public static void main(String args[]){
Scanner sc= new Scanner(System.in);
System.out.println("enter your string");
String s = sc.nextLine();
int v=0,c=0;
for(int i=0;i<s.length();i++){
char ch = s.charAt(i);
if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||
   ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'){
v++;
} else if(ch>='a' && ch<='z' || ch>='A' && ch<='Z'){
c++;
}
} 
System.out.println("Vowels = " + v);
System.out.println("Consonants = " + c);
}
}