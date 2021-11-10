import java.util.Random;
import java.util.Scanner;

public class Driver {
    public static void main(String[] args){
        BankAccount ba = new BankAccount();
        ba.setBalance(100.00); // set start balance
        Random rd = new Random();
        Scanner kb = new Scanner(System.in);
        System.out.print("--------- SCHERZER BANK LLC ---------\n");
        String input = "";
        System.out.println("NEW USER -- FILL OUT FORM BELOW: ");
        System.out.print("Enter your Full Name: ");
        ba.setCustomerName(kb.nextLine());
        System.out.print("Enter your Phone Number: ");
        ba.setPhoneNumber(kb.next());
        System.out.print("Enter your Email: ");
        ba.setEmail(kb.next());
        ba.setAccountNumber(Math.abs(rd.nextLong()));
        System.out.println("Your account number is: " + ba.getAccountNumber() + "\n");

        while (!input.equalsIgnoreCase("E")){
            System.out.print("[A]ccount Info\n[W]ithdraw\n[D]eposit\n[E]xit\nENTER OPTION: ");
            input = kb.next();
            System.out.println();

            if (input.equalsIgnoreCase("A")){
                ba.getAccountInfo();
            } else if (input.equalsIgnoreCase("W")){
                System.out.println("ENTER WITHDRAW AMOUNT (ex. 1.00): ");
                double withdrawAmount = kb.nextInt();
                ba.withdraw((withdrawAmount));
            } else if (input.equalsIgnoreCase("D")){
                System.out.println("ENTER DEPOSIT AMOUNT (ex. 1.00): ");
                double depositAmount = kb.nextInt();
                ba.deposit((depositAmount));
            } else if (input.equalsIgnoreCase("E")) {
                System.out.println("\nThank you for visiting Scherz Bank " + ba.getCustomerName().toUpperCase() + "! Have a great day!\n\n*********** APPLICATION IS NOW CLOSING ***********");
            } else {
                System.out.println("\nERROR: Option not recognized...\n");
            }
        }

    }
}
