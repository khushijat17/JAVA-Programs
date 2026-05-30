import java.io.IOException;
class Exception92{
void m()throws IOException{
throw new IOException("device error");//checked exception
}
void p(){
try{
m();
}catch(Exception e){
System.out.println("EXception handle");
}
finally{System.out.println("finally always execute");}
}
public static void main(String args[]){
Exception92 e = new Exception92();
e.p();
}

}
