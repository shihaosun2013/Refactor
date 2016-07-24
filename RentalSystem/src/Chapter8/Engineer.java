package Chapter8;

/**
 * Created by shihasun on 7/24/16.
 */
public class Engineer extends Employee {

    @Override
    int get_type() {
        return Employee.ENGINEER;
    }

    @Override
    int payAmount() {
        return _monthlySalary;
    }
    private int _monthlySalary;

    public int get_monthlySalary() {
        return _monthlySalary;
    }

    public void set_monthlySalary(int _monthlySalary) {
        this._monthlySalary = _monthlySalary;
    }
}
