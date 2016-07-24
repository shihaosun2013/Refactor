package Chapter8;

/**
 * Created by shihasun on 7/24/16.
 */
public class Employee2 {
    private int _type;
    static final int ENGINEER = 0;
    static final int SALESMAN = 1;
    static final int MANAGER = 2;

    public Employee2(int _type) {
        this._type = _type;
    }

    int payAmount() {
        switch (_type) {
            case ENGINEER:
                return _monthlySalary;
            case SALESMAN:
                return _monthlySalary + _commission;
            case MANAGER:
                return _monthlySalary + _bonus;
            default:
                throw new RuntimeException("Incorrect Employee");
        }
    }
}
