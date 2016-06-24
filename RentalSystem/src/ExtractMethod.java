import java.util.Enumeration;

/**
 * Created by shihasun on 6/23/16.
 */
public class ExtractMethod {

    void printOwingBefore(double previousAmount) {
        Enumeration e = _orders.elements();
        double outstanding = previousAmount * 1.2;
        // print banner
        System.out.println("**************************");
        System.out.println("***** Customer Owes ******");
        System.out.println("**************************");

        // calculate outstanding
        while (e.hasMoreElements()) {
            Order each = (Order) e.nextElement();
            outstanding += each.getAmount();
        }

        System.out.println("name:" + _name);
        System.out.println("amount" + outstanding);
    }


    void printOwingAfter(double previousAmount) {
        printBanner();

        printDetails(getOutstanding(previousAmount * 1.2));

    }

    private void printDetails(double outstanding) {
        //print details
        System.out.println("name:" + _name);
        System.out.println("amount" + outstanding);
    }

    private void printBanner() {
        // print banner
        System.out.println("**************************");
        System.out.println("***** Customer Owes ******");
        System.out.println("**************************");
    }

    private double getOutstanding(double initialValue) {
        Enumeration e = _orders.elements();
        double result = initialValue;

        // calculate outstanding
        while (e.hasMoreElements()) {
            Order each = (Order) e.nextElement();
            result += each.getAmount();
        }
        return result;
    }

}
