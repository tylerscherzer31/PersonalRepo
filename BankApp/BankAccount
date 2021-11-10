public class BankAccount {

    private long accountNumber;
    private double balance;
    private String customerName;
    private String email;
    private String phoneNumber;

    public void setBalance(int funds){
        this.balance = funds;
    }

    public void getAccountInfo(){
        System.out.println("Account Number: " + getAccountNumber());
        System.out.println("Customer Name: " + getCustomerName());
        System.out.println("Customer Email: " + getEmail());
        System.out.println("Customer Phone Number: " + getPhoneNumber());
        System.out.println("Current Balance: $" + getBalance());
        System.out.println();
    }

    public void deposit(double funds){
        double newBalance = getBalance() + funds;
        System.out.println("****** DEPOSIT INITIATED ******");
        System.out.println("Original balance: $" + getBalance());
        System.out.println("Deposit Amount: $" + funds);
        this.balance = newBalance;
        System.out.println("** New Balance: $" + this.balance);
        System.out.println("****** DEPOSIT COMPLETED ******\n");
    }

    public void withdraw(double funds){
        double newBalance = getBalance() - funds;
        if (newBalance <= 0){
            System.out.println("Insufficient funds. Your balance is $" + this.balance);
        }else {
            System.out.println("****** WITHDRAW INITIATED ******");
            System.out.println("Original balance: $" + getBalance());
            System.out.println("Withdraw Amount: $" + funds);
            this.balance = newBalance;
            System.out.println("** New Balance: $" + this.balance);
            System.out.println("****** WITHDRAW COMPLETED ******\n");
        }
    }

    public long getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }


}
