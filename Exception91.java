/*Write a program that shows that the order of the catch blocks is important. If you try to catch a superclass exception type before a subclass type,
the compiler should generate errors.*/
class Exception91{
public static void main(String args[]){
try{
int num = 10/0;
}catch(Exception  e){
System.out.println("Cannot divide by 0");//subclass first
}
catch(ArithmeticException e){
System.out.println("Error");//superclass later
}
}
}



