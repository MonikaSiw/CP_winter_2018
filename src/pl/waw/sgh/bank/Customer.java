package pl.waw.sgh.bank;

public class Customer {

  private Integer customerID;

  private String firstName;

  private String lastName;

  private String email;

  // here we click generate -> constructor

  public Customer(Integer customerID, String firstName, String lastName, String email) {
    this.customerID = customerID;
    this.firstName = firstName;
    this.lastName = lastName;
    this.email = email;
  }


  // generate getter and setter

  public Integer getCustomerID() {
    return customerID;
  }

  public void setCustomerID(Integer customerID) {
    this.customerID = customerID;
  }

  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

// generate toString()
  @Override
  public String toString() {
    return "Cust{" +
            "ID=" + customerID +
            ", fName='" + firstName + '\'' +
            ", lName='" + lastName + '\'' +
            ", @='" + email + '\'' +
            '}';
  }
}
