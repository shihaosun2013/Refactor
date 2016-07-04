/**
 * Created by shihasun on 7/4/16.
 */
public class TelephoneNumber {
    public String getTelephoneNumber() {
        return ("(" + _AreaCode + ") " + _Number);
    }
    public String get_AreaCode() {
        return _AreaCode;
    }

    public void set_AreaCode(String _AreaCode) {
        this._AreaCode = _AreaCode;
    }

    public String get_Number() {
        return _Number;
    }

    public void set_Number(String _Number) {
        this._Number = _Number;
    }

    private String _AreaCode;
    private String _Number;
}
