/*Create two methods namely credit and getBalance. The first one adds the amount (passed as parameter) to balance and does not return any data.
The second method allows clients (i.e. the other classes that use this class) to obtain the value of a particular Account object’s balance.*/
class Account{
double balance;
Account(double balance){
if(balance>0.0){
this.balance=balance;
}else{
this.balance=0.0;
System.out.println("Initial balance must be greater than 0");
}
}
void credit(double amount){
balance=balance+amount;
}
double getbalance(){
return balance;
}
}



class Account47{
public static void main(String args[]){
Account at1 = new Account(30000.00);
System.out.println("Balance: " + at1.balance);
at1.credit(800);
System.out.println("Amount:" + at1.getbalance());
 
    }
}