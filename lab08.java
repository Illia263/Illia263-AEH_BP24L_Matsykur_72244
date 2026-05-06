public class lab08 {
  public static void main(String[] args) {
        account myaccount = new account("1234567890", 1000.0, "Ivan", "ivan@email.com", "000-000-000");

        myaccount.withdraw(900.0);
        myaccount.deposit(250.0);
        myaccount.withdraw(50.0);
        myaccount.withdraw(500.0); 
    }
}
