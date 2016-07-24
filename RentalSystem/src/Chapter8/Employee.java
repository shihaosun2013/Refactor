package Chapter8;

/**
 * Created by shihasun on 7/24/16.
 */
abstract public class Employee {
    private int _type;

    abstract int get_type();

    public void set_type(int _type) {
        this._type = _type;
    }

    static final int ENGINEER = 0;
    static final int SALESMAN = 1;
    static final int MANAGER = 2;

    private Employee(int _type) {
        this._type = _type;
    }
    public Employee() {
    }

    static Employee create(int type) {
        switch (type) {
            case ENGINEER:
                return new Engineer();
            case SALESMAN:
                return new Salesman();
            case MANAGER:
                return new Manager();
            default:
                throw new IllegalArgumentException("Incorrect type codevalue");
        }
    }

    abstract int payAmount();
}
