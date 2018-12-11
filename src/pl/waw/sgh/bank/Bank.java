package pl.waw.sgh.bank;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Bank {

  private List<Customer> custList = new ArrayList<>();

  private List<Account> accList = new ArrayList<>();

  private Integer lastCustID = 0;

  private Integer lastAccID = 100;

  // PUBLIC API
  public Customer newCustomer(String firstName,
                              String lastName,
                              String email) {
    Customer cust = new Customer(lastCustID++, firstName, lastName, email);
    custList.add(cust);
    return cust;
  }

  public Account newAccount(Customer cust, String accType) {

    Account acc;
    //switch - multiple if, multiple cases. We can use switch on any primitive tyoe - double ,float, int , string, ect
    switch (accType) {
      case "Savings":
        acc = new SavingsAccount(lastAccID++, 0.0, cust);
        break;
      case "Debit":
        acc = new DebitAccount(lastAccID++, 0.0, cust);
        break;
      default:
        acc = new CheckingAccount(lastAccID++, 0.0, cust);
    }
    accList.add(acc);
    return acc;
  }

  private Account findAccountByID(Integer accID) {
    for (Account acc : accList) { // : - this is in
      if (acc.getAccountID().equals(accID)) {
        return acc; }
    }

    return null;
  }

  //add also validation, you can use if,else, print messages if there is no account, id negative message, transfer 0, no existing account
  public void transfer(Integer fromAccID, Integer toAccID, Double amount) {
    Account fromA = findAccountByID(fromAccID);
    Account toA = findAccountByID(toAccID);
    if (fromA == null) {
      System.out.println("Unfortunately, an account that we want to transfer money from does not exist.");
    }
    if (toA == null) {
      System.out.println("Unfortunately, an account that we want to transfer money to does not exist.");
    }

    if (fromA != null && toA != null) {
      BigDecimal BalanceFrom = fromA.getBalance();
      if (BalanceFrom.compareTo(BigDecimal.valueOf(amount)) == -1) {
        System.out.println("There is not enough money on account " + fromA.getAccountID() +", which belongs to " + fromA.getCustomer().getFirstName() + " " + fromA.getCustomer().getLastName() );
        System.out.println(" ");
      } else {
        toA.deposit(amount);
        fromA.charge(amount);
        System.out.println("Transfer from account " + fromA.getAccountID() + " to " + toA.getAccountID() + " of amount " + amount +" was successful.");
      }
    }

  }
    @Override

    public String toString () {
      return "Bank{\n" +
              "custs=\n" + custList +
              ", \naccs\n=" + accList +
              '}';
    }
  }

