package Chapter8;

/**
 * Created by shihasun on 7/24/16.
 */
public class Employee {
    private int _type;
    static final int ENGINEER = 0;
    static final int SALESMAN = 1;
    static final int MANAGER = 2;

    public Employee(int _type) {
        this._type = _type;
    }
}
