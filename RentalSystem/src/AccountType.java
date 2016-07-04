/**
 * Created by shihasun on 7/4/16.
 */
public class AccountType {
    boolean isPremium() {
        return true;
    }

    double overdraftCharge(int daysOverdrawn) {
        if (isPremium()) {
            double result = 10;
            if (daysOverdrawn > 7) {
                result += (daysOverdrawn - 7) * 0.85;
            }
            return result;
        }
        return daysOverdrawn * 1.75;
    }

    // If the method called another method on the account, I wouldn't have been able to do that.
    // In those cases I need to pass in the source object

    double overdraftCharge(Account account) {
        if (isPremium()) {
            double result = 10;
            if (account.get_daysOverdrawn() > 7) {
                result += (account.get_daysOverdrawn() - 7) * 0.85;
            }
            return result;
        }
        return account.get_daysOverdrawn() * 1.75;
    }
}
