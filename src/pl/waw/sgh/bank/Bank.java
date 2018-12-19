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

  private Account findAccountByID(Integer accID) throws NonExistingAccountException{
    for (Account acc : accList) {
      if (acc.getAccountID().equals(accID)) {
        return acc; }
    }
 // instead of returning null throw exceptions!!!
    throw new NonExistingAccountException(accID);
  }

  //add also validation, you can use if,else, print messages if there is no account, id negative message, transfer 0, no existing account
  public void transfer(Integer fromAccID, Integer toAccID, Double amount) throws NotEnoughMoneyException, NonExistingAccountException{
    Account fromA = findAccountByID(fromAccID);
    Account toA = findAccountByID(toAccID);

      fromA.charge(amount);
      toA.deposit(amount);

  }
    @Override

    public String toString () {
      return "Bank{\n" +
              "custs=\n" + custList +
              ", \naccs\n=" + accList +
              '}';
    }
  }

