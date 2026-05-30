// create a file
import java.io.*
class File104{
public static void main(String args[]){
file f = new file("a.txt");
if(f.createNewfile()){
System.out.println("create file");
}else
{
System.out.println("file already exit");
}
}
}

