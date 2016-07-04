/**
 * Created by shihasun on 7/4/16.
 */
public class Chapter7 {
    /*
    * Before*/
//    double getPrice() {
//        int basePrice = _quantity * _itemPrice;
//        double discountFactor;
//        if (basePrice > 1000) discountFactor = 0.95;
//        else discountFactor = 0.98;
//        return basePrice * discountFactor;
//    }
    /*
    After
     */
    double getPrice() {
        return getBasePrice() * getDiscountFactor();
    }
    double getBasePrice () {
        return _quantity * _itemPrice;
    }
    double getDiscountFactor() {
        return getBasePrice() > 1000 ? 0.95 : 0.98;
    }
}
