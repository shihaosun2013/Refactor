

/**
 * Created by shihasun on 7/4/16.
 */
public abstract class Customer2 {
    private String custRating;
    static final int PREMIER = 2;
    static final int VALUED = 1;
    static final int DEADBEAT = 0;

    public String getCustRating() {
        return custRating;
    }

    public void setCustRating(String custRating) {
        this.custRating = custRating;
    }

    public static void main(String[] args) {
        CustomerFactory customerFactory = new CustomerFactory();
        Customer2 premierCustomer = customerFactory.getCustomer("Premier");
        System.out.println(premierCustomer.getCustRating());
    }


}

class Premier extends Customer2 {

    Premier() {

        setCustRating("Premier Customer");

    }

}

class Deadbeat extends Customer2 {

    Deadbeat() {

        setCustRating("Deadbeat Customer");

    }

}

class CustomerFactory {
    public Customer2 getCustomer(String type) {
        Customer2 customer2 = null;
        try {
            customer2 = (Customer2) Class.forName(type).newInstance();
        } catch (Exception e) {
            System.out.println("Exception found" + e.getMessage());
        }
        return customer2;
    }
}