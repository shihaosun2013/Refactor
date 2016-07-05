package Chapter8;

/**
 * Created by shihasun on 7/4/16.
 */
public class Order {
    public Order(String customerName) {
//        _customer = new Customer(customerName);
        _customer = Customer.create(customerName);
    }

//    public void setCustomer(String customerName) {
//        _customer = new Customer(customerName);
//    }

    public String getCustomerName() {
        return _customer.getName();
    }

    private Customer _customer;

}
