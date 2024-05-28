import java.util.Scanner;

public class AtmInterface {
    public static void main(String[] args) {
        System.out.println("Welcome to the ATM.");
        Scanner sc = new Scanner(System.in);
        int choice;
        int balance = 0;
        do{
            System.out.println("Enter your choice :- \n1. Deposit\n2. Withdraw\n3. Check Balance\n4. Exit");
            System.out.print("Press any of these :- ");
            choice = sc.nextInt();
            switch (choice) {
                case 1 -> {
                    System.out.print("Enter the amount you want to deposit :- ");
                    int depositAmount = sc.nextInt();
                    if(depositAmount > 10000){
                        System.out.println("You cannot deposit the amount greater than 10,000 rupees.");
                        System.out.print("Enter the amount you want to deposit :- ");
                        depositAmount = sc.nextInt();
                    }
                    balance += depositAmount;
                    System.out.println(depositAmount + " rupees deposited successfully!");
                }
                case 2 -> {
                    System.out.print("Enter the amount you want to withdraw :- ");
                    int withdrawAmount = sc.nextInt();
                    if(withdrawAmount > balance){
                        System.out.println("Sorry!! You can't withdraw the amount.\nYou don't have that much balance!");
                        System.out.print("Enter the amount you want to withdraw :- ");
                        withdrawAmount = sc.nextInt();
                    }
                    balance -= withdrawAmount;
                    System.out.println(withdrawAmount + " rupees withdraw successfully!!");
                }
                case 3 -> System.out.println("Your balance is " + balance + " rupees.");
            }
        }while(choice != 4);
        System.out.println("Thanks for visiting.\nPlease come again!");
    }
}
