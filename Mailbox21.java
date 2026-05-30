//sell 
import java.util.Scanner;
class Mailbox21{
public static void main(String arg[]){
Scanner sc = new Scanner(System.in);
int product;
int quantity;
double totalprice =0.00;
double price;
while(true){
System.out.println("Product number: ");
product = sc.nextInt();
if(product==0){
break;
}
System.out.println("Quantity: ");
quantity = sc.nextInt();
switch(product){
case 1:
 price =99.90;
break;
case 2:
price =20.20;
break;
case 3:
price =6.87;
break;
case 4:
price=45.50;
break;
case 5:
price=40.49;
break;

default:
System.out.println("Inavlid case" );
continue;
}
totalprice = totalprice+price*quantity;
}
System.out.println("Totalretailvalue : " + totalprice);

}
}





