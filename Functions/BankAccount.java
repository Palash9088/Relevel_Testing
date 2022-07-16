public class BankAccount {

    String username;
    String password;
    int BankAccountNumber;
    void setDetails (String user, String pass, int accNum)
    {
        username = user;
        password = pass;
        BankAccountNumber = accNum;
    }
    void displayInfo ()
    {
        System.out.println("Username is " + username);
        System.out.println("Password is " + password);
        System.out.println("Bank Account number is " + BankAccountNumber);
    }
    void updatePassword(String pwd)
    {
        password = pwd;
    }
    void displayinfo1()
    {
        System.out.println("Username is " + username);
        System.out.println("Updated Password is " + password);
        System.out.println("Bank Account number is " + BankAccountNumber);

    }

    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount();

        bankAccount.setDetails("Palash9088","Palash@112233",34550055);
        bankAccount.displayInfo();
        bankAccount.updatePassword("Palash@123");
        bankAccount.displayinfo1();
    }
}
