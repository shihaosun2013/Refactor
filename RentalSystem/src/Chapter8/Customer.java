package Chapter8;

import java.util.Dictionary;
import java.util.Hashtable;

/**
 * Created by shihasun on 7/4/16.
 */
public class Customer {

    private static Dictionary _instances = new Hashtable();

    //    public Customer(String name) {
    private Customer(String name) {
        _name = name;
    }

    public String getName() {
        return _name;
    }

    private final String _name;

    /*After*/
    public static Customer create(String name) {
        return new Customer(name);
    }

    static void loadCustomers() {
        new Customer("Lemon Car Hire").store();
        new Customer("Associated Coffee Machines").store();
        new Customer("Bilston Gasworks").store();
    }

    private void store() {
        _instances.put(this.getName(), this);
    }

    public static Customer getNamed(String name) {
        return (Customer) _instances.get(name);
    }

}
