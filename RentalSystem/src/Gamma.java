/**
 * Created by shihasun on 7/4/16.
 */
public class Gamma {
    private final Account _account;
    private int _inputVal;
    private int _quantity;
    private int _yearToDate;
    private int _importantValue1;
    private int _importantValue2;
    private int _importantValue3;

    Gamma(Account source, int inputValArg, int quantityArg, int yearToDateArg) {
        _account = source;
        _inputVal = inputValArg;
        _quantity = quantityArg;
        _yearToDate = yearToDateArg;
    }

    int compute() {
        _importantValue1 = (_inputVal * _quantity) + _account.delta();
        _importantValue2 = (_inputVal * _yearToDate) + 100;
        /*Before and after*/
        importThing();
        int importantValue3 = _importantValue2 * 7;
        // and so on.
        return importantValue3 - 2 * _importantValue1;
    }

    private void importThing() {
        if ((_yearToDate - _importantValue1) > 100)
            _importantValue2 -= 20;
    }

}
