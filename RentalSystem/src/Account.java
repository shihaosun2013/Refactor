/**
 * Created by shihasun on 7/4/16.
 */
public class Account {
    /*before*/
//    int gamma(int inputVal, int quantity, int yearToDate) {
//        int importantValue1 = (inputVal * quantity) + delta();
//        int importantValue2 = (inputVal * yearToDate) + 100;
//        if ((yearToDate - importantValue1) > 100)
//            importantValue2 -= 20;
//        int importantValue3 = importantValue2 * 7;
//        // and so on.
//        return importantValue3 - 2 * importantValue1;
//    }

    /*
    * After*/
    int gamma(int inputVal, int quantity, int yearToDate) {
        return new Gamma(this, inputVal, quantity, yearToDate).compute();
    }

    double bankCharge() {
        double result = 4.5;
        /*Before*/
//        if (_daysOverdrawn > 0) result += overdraftCharge();
        /*After*/
        if (_daysOverdrawn > 0) result += _type.overdraftCharge(_daysOverdrawn);
        return result;
    }


    double overdraftCharge() {
        /** Before */
//        if (_type.isPremium()) {
//            double result = 10;
//            if (_daysOverdrawn > 7) {
//                result += (_daysOverdrawn - 7) * 0.85;
//            } else {
//                return result;
//            }
//        }
//        return _daysOverdrawn * 1.75;

        /* After */
        return _type.overdraftCharge(_daysOverdrawn);
    }

    private AccountType _type;

    private int _daysOverdrawn;

    public int get_daysOverdrawn() {
        return _daysOverdrawn;
    }

    public void set_daysOverdrawn(int _daysOverdrawn) {
        this._daysOverdrawn = _daysOverdrawn;
    }

    /*Before*/
//    private double _interestRate;
//
//    public double get_interestRate() {
//        return _interestRate;
//    }
//
//    public void set_interestRate(double _interestRate) {
//        this._interestRate = _interestRate;
//    }
//    double interestForAmount_days(double amount, int days) {
//        return _interestRate * amount * days / 365;
//    }

    // Step 1
//    double interestForAmount_days(double amount, int days) {
//        return _type.get_interestRate() * amount * days / 365;
//    }

    // Step 2
    double interestForAmount_days(double amount, int days) {
        return _type.interestForAmount_days(amount, days);
    }

    public double get_interestRate() {
        return _type.get_interestRate();
    }

    public void set_interestRate(double _interestRate) {
        _type.set_interestRate(_interestRate);
    }


}
