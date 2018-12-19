package pl.waw.sgh.bank;

import java.math.BigDecimal;

public abstract class Account {
  // it will be an abstract class

  private Integer accountID;

  private BigDecimal balance;  //used for calculations

  private String currency = "USD";

  private Customer customer;

  //generate constructor
  public Account(Integer accountID, Double balance,
                 String currency, Customer customer) {
    this.accountID = accountID;
    this.balance = new BigDecimal(balance);
    this.balance.setScale(2);
    this.currency = currency;
    this.customer = customer;
  }

  public Account(Integer accountID, Double balance,
                 Customer customer) {
    this.accountID = accountID;
    this.balance = new BigDecimal(balance);
    this.balance.setScale(2);
    this.customer = customer;
  }


  public void deposit (Double amount) {
// this.balance is here optional
    this.balance = balance.add(BigDecimal.valueOf(amount));
  }

  public void charge(Double amount) throws NotEnoughMoneyException {
    BigDecimal newBal = balance.subtract(new BigDecimal(amount));
    if(newBal.compareTo(new BigDecimal(0))<0) {
      throw new NotEnoughMoneyException(balance); }
    balance = newBal;
  }

  //getter and setter

  public Integer getAccountID() {
    return accountID;
  }

  public void setAccountID(Integer accountID) {
    this.accountID = accountID;
  }

  public BigDecimal getBalance() {
    return balance;
  }

  public void setBalance(BigDecimal balance) {
    this.balance = balance;
  }

  public String getCurrency() {
    return currency;
  }

  public void setCurrency(String currency) {
    this.currency = currency;
  }

  public Customer getCustomer() {
    return customer;
  }

  public void setCustomer(Customer customer) {
    this.customer = customer;
  }

  //to String
  @Override
  public String toString() {
    return this.getClass().getSimpleName().replace("Account","") +"{" +
            "ID=" + accountID +
            ", " +currency +"=" + balance +
            ", cust=" + customer.getCustomerID() +
            '}';
  }
}