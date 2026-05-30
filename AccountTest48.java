/*Create class AccountTest to create and manipulate an Account object.*/
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

    double getBalance() {
        return balance;
    }
}

class AccountTest48 {
    public static void main(String args[]) {
        
        // object create
        Account acc = new Account(5000);

        // balance check
        System.out.println("Initial Balance: " + acc.getBalance());

        // manipulate (add money)
        acc.credit(1500);

        // updated balance
        System.out.println("Updated Balance: " + acc.getBalance());
    }
}