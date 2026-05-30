/*Write another method debit in the above program that withdraws money from an Account. Ensure that the debit amount does not exceed the
Account’s balance. In that case the balance should be left unchanged and the method should print a message indicating “Debit amount exceeded
account balance”. Modify class AccountTest to test method debit.*/
class Account {
    double balance;

    Account(double balance) {
        if (balance > 0.0) {
            this.balance = balance;
        } else {
            this.balance = 0.0;
            System.out.println("Initial balance must be greater than 0");
        }
    }

    void credit(double amount) {
        balance = balance + amount;
    }

    void debit(double amount) {
        if (amount <= balance) {
            balance = balance - amount;
        } else {
            System.out.println("Debit amount exceeded account balance");
        }
    }

    double getBalance() {
        return balance;
    }
}

class AccountTest49 {
    public static void main(String args[]) {
        Account acc = new Account(5000);

        System.out.println("Initial Balance: " + acc.getBalance());

        acc.credit(1000);
        System.out.println("After Credit: " + acc.getBalance());

        acc.debit(2000); // valid
        System.out.println("After Debit: " + acc.getBalance());

        acc.debit(10000); // invalid
        System.out.println("Final Balance: " + acc.getBalance());
    }
}