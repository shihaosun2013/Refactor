package Chapter8;

/**
 * Created by shihasun on 7/24/16.
 */
public class Manager extends Employee{

    @Override
    int get_type() {
        return Employee.MANAGER;
    }

    @Override
    int payAmount() {
        return _monthlySalary + _bonus;
    }
    private int _monthlySalary;
    private int _bonus;

    public int get_monthlySalary() {
        return _monthlySalary;
    }

    public void set_monthlySalary(int _monthlySalary) {
        this._monthlySalary = _monthlySalary;
    }

    public int get_bonus() {
        return _bonus;
    }

    public void set_bonus(int _bonus) {
        this._bonus = _bonus;
    }
}
