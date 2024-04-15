package co.edu.uniquindio.bankingsystem.bankingsystem.factory;

import co.edu.uniquindio.bankingsystem.bankingsystem.factory.inter.Account;
import co.edu.uniquindio.bankingsystem.bankingsystem.factory.inter.implementation.CheckingAccount;
import co.edu.uniquindio.bankingsystem.bankingsystem.factory.inter.implementation.SavingsAccount;

public class AccountFactory {

    public Account getAccount(String accountType) {
        if (accountType == null) {
            return null;
        }
        if (accountType.equalsIgnoreCase("SAVINGS")) {
            return new SavingsAccount();
        } else if (accountType.equalsIgnoreCase("CHECKING")) {
            return new CheckingAccount();
        }
        return null;
    }
}
