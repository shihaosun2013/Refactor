package Chapter8;

import java.util.Collection;
import java.util.Iterator;

/**
 * Created by shihasun on 7/4/16.
 */
public class Client {
    private static int numberOfOrdersFor(Collection orders, String customer) {
        int result = 0;
        Iterator iter = orders.iterator();
        while (iter.hasNext()) {
            Order each = (Order) iter.next();
            if (each.getCustomerName().equals(customer)) result++;
        }
        return result;
    }
}
