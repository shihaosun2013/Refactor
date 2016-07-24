package Chapter8;

/**
 * Created by shihasun on 7/24/16.
 */
public class Salesman extends Employee {
    @Override
    int get_type() {
        return Employee.SALESMAN;
    }

    @Override
    int payAmount() {
        return _monthlySalary + _commission;
    }

    private int _monthlySalary;
    private int _commission;

    public int get_monthlySalary() {
        return _monthlySalary;
    }

    public void set_monthlySalary(int _monthlySalary) {
        this._monthlySalary = _monthlySalary;
    }

    public int get_commission() {
        return _commission;
    }

    public void set_commission(int _commission) {
        this._commission = _commission;
    }
}
