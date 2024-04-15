package co.edu.uniquindio.bankingsystem.bankingsystem.factory;

import co.edu.uniquindio.bankingsystem.bankingsystem.factory.inter.Transaction;
import co.edu.uniquindio.bankingsystem.bankingsystem.factory.inter.implementation.Deposit;
import co.edu.uniquindio.bankingsystem.bankingsystem.factory.inter.implementation.Transfer;
import co.edu.uniquindio.bankingsystem.bankingsystem.factory.inter.implementation.Withdrawal;

public class TransactionFactory {
    public Transaction getTransaction(String transactionType) {
        if (transactionType == null) {
            return null;
        }
        if (transactionType.equalsIgnoreCase("DEPOSIT")) {
            return new Deposit();
        } else if (transactionType.equalsIgnoreCase("WITHDRAWAL")) {
            return new Withdrawal();
        } else if (transactionType.equalsIgnoreCase("TRANSFER")) {
            return new Transfer();
        }

        return null;
    }
}