import java.util.Scanner;
class products{
public static void main(String args[]){
 Scanner sc = new Scanner (System.in);
    int productNo, quantity;
    double price = 0.0;
    double totalRetailValue = 0.0;

    System.out.println("Enter Product Number (1-5) and Quantity Sold.\n");
    System.out.println ("Enter 0 as product number to stop.\n\n");

    while (true) {
     
        System.out.println("Product Number: ");
        productNo = sc.nextInt();

        if (productNo == 0)
            break;

     System.out.println ("Quantity Sold: ");
        quantity = sc.nextInt();

        switch (productNo) {
            case 1: price = 99.90; break;
            case 2: price = 20.20; break;
            case 3: price = 6.87;  break;
            case 4: price = 45.50; break;
            case 5: price = 40.49; break;
            default:
                System.out.println("Invalid product number!\n\n");
                continue;
        }

        totalRetailValue += price * quantity;
         System.out.println("Added to total.\n\n");
    }

     System.out.println("\nTotal Retail Value of all products sold = Rs. " + "totalRetailValue ");

   }
}



