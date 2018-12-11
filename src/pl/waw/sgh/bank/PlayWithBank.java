package pl.waw.sgh.bank;

public class PlayWithBank {

  public static void main(String[] args) {

    Bank bank = new Bank();
    Customer c1 = bank.newCustomer("John", "Brown", "john@brown.com");

    Customer c2 = bank.newCustomer("Anna", "Smith", "anna@smith.com");

    Account a1 = bank.newAccount(c1, "Debit");
    Account a2 = bank.newAccount(c1,"Savings");
    Account a3 = bank.newAccount(c1, "");
    Account a4 = bank.newAccount(c2,"Debit");
    a1.deposit(150.0);
    a2.deposit(100.0);
    a2.charge(125.0);

    // Transfer 50.00 from accID 100 to 102
    bank.transfer(100,102,10.00);

    Account a5 = bank.newAccount(c2,"Savings");
    Account a6 = bank.newAccount(c2, "");
    System.out.println(bank);
  }
}
