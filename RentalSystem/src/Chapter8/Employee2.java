package Chapter8;

/**
 * Created by shihasun on 7/24/16.
 */
public class Employee2 {
    public int get_type() {
        return _type.getTypeCode();
    }

    public void set_type(int type) {
        _type = EmployeeType.newType(type);
    }

//    private int _type;
    private EmployeeType _type;

    public Employee2(int _type) {
        this._type = EmployeeType.newType(_type);
    }

    int payAmount() {
        switch (get_type()) {
            case EmployeeType.ENGINEER:
                return _monthlySalary;
            case EmployeeType.SALESMAN:
                return _monthlySalary + _commission;
            case EmployeeType.MANAGER:
                return _monthlySalary + _bonus;
            default:
                throw new RuntimeException("Incorrect Employee");
        }
    }
}
