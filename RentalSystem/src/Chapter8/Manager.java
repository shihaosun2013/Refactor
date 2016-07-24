package Chapter8;

/**
 * Created by shihasun on 7/24/16.
 */
public class Manager extends Employee{

    @Override
    int get_type() {
        return Employee.MANAGER;
    }
}
