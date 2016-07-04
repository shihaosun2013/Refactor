/**
 * Created by shihasun on 7/4/16.
 */
public class Person {
    /*Before*/
//    public String getName() {
//        return _name;
//    }
//
//    public String getTelephoneNumber() {
//        return ("(" + _officeAreaCode + ") " + _officeNumber);
//    }
//
//    String getOfficeAreaCode() {
//        return _officeAreaCode;
//    }
//
//    void setOfficeAreaCode(String arg) {
//        _officeAreaCode = arg;
//    }
//
//    String getOfficeNumber() {
//        return _officeNumber;
//    }
//
//    void setOfficeNumber(String arg) {
//        _officeNumber = arg;
//    }
//
//    private String _name;
//    private String _officeAreaCode;
//    private String _officeNumber;

    public String getName() {
        return _name;
    }

    public String getTelephoneNumber() {
        return _officeTelePhone.getTelephoneNumber();
    }

    private String _name;
    private TelephoneNumber _officeTelePhone = new TelephoneNumber();

    /*Before*/
    // Avoid chaining!
//    manager = john.getDepartment().getManager();
    Department _department;

    public Department getDepartment() {
        return _department;
    }

    public void setDepartment(Department arg) {
        _department = arg;
    }

    /*After*/
    public Person getManager() {
        return _department.getManager();
    }
//  manager = john.getManager();
}
