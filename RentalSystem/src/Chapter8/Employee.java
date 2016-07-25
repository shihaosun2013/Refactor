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

    public void sendAlert() {

    }

    /*String foundMiscreant(String[] people) {
        for (int i = 0; i < people.length; i++) {
            if (people[i].equals("Don")) {
                sendAlert();
                return "Don";
            }
            if (people[i].equals("John")) {
                sendAlert();
                return "John";
            }
        }
        return "";
    }

    void checkSecurity(String[] people) {
        String found = foundMiscreant(people);
//        someLaterCode(found);
    }
    */


    String foundPerson(String[] people) {
        for (int i = 0; i < people.length; i++) {
            if (people[i].equals("Don")) {
                return "Don";
            }
            if (people[i].equals("John")) {
                return "John";
            }
        }
        return "";
    }

    void sendAlert(String[] people) {
        if (!foundPerson(people).equals(""))
            sendAlert();
    }

    void checkSecurity(String[] people) {
        sendAlert();
        String found = foundPerson(people);
//        someLaterCode(found);
    }

}
