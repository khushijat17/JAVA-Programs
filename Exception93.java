/*Create your own exception class using the extends keyword. Write a constructor for this class that takes a String argument and stores it inside
the object with a String reference. Write a method that prints out the stored String. Create a try-catch clause to exercise your new exception*/
class InvalidAgeException extends Exception{
String msg;
InvalidAgeException(String s){
msg=s;
}
void msg(){
System.out.println("Exception msg: " +msg);
}
}
class Exception93{
 static void validate(int age)  throws InvalidAgeException{
if(age<18){
throw new InvalidAgeException("not valid");
}else{
System.out.println("WElCOME TO VOTE");
}
}
public static void main(String args[]){
try{
validate(13);
}catch(InvalidAgeException m){
m.msg();
}
}
}


