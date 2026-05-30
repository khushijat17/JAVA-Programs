/*Exception Handling program for NullPointerException--thrown if the JVM attempts to perform an operation on an Object that points to no data,
or null*/
import java.util.Scanner;
class Exception87{
public static void main(String args[]){
String data = null;
try{
System.out.println(data.length());

}catch(NullPointerException e){
System.out.println("NO data found");
}
}
}
