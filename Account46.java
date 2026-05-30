/*Create a class Account with an instance variable balance (double). It should contain a constructor that initializes the balance, ensure that the
initial balance is greater than 0.0.*/
class Account{
double balance;
Account(double balance){
if(balance>0.0){
this.balance=balance;
}else{
this.balance=0.0;
System.out.println("Initial balance is greater than 0.0");
}
}
}
class Account46{
public static void main(String args[]){
Account at1 = new Account(30000.00);
System.out.println("Balance: " + at1.balance);
 Account at2 = new Account(-500); // invalid
System.out.println("Balance: " + at2.balance);
    }
}