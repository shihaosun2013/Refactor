package Chapter8;

/**
 * Created by shihasun on 7/24/16.
 */
abstract public class EmployeeType {
    abstract int getTypeCode();
    static EmployeeType newType(int code) {
        switch (code) {
            case ENGINEER:
                return new Engineer2();
            case SALESMAN:
                return new Salesman2();
            case MANAGER:
                return new Manager2();
            default:
                throw new IllegalArgumentException("Incorrect type codevalue");
        }
    }
    static final int ENGINEER = 0;
    static final int SALESMAN = 1;
    static final int MANAGER = 2;
}
