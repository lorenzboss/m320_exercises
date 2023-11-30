import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double amount;
        char input;
        System.out.println("Welcome to the account application.");

        Account normalAccount = new Account();
        Account anotherAccount = new Account(200);

        while (true) {
            System.out.println("Please enter the amount, 0 (zero) to terminate");
            amount = scanner.nextDouble();
            if (amount == 0) {
                break;
            }

            System.out.println("To deposit, press +, to withdraw, press -");
            input = scanner.next().charAt(0);

            if (input == '+') {
                normalAccount.deposit(amount);
            } else if (input == '-') {
                normalAccount.withdraw(amount);
            } else {
                System.out.println("Please enter a valid option!");
            }

        }
        System.out.println("Final balance: " + normalAccount.getBalance());

    }
}
