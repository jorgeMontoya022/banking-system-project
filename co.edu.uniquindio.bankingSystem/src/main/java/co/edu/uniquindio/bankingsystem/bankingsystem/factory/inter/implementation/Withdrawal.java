package co.edu.uniquindio.bankingsystem.bankingsystem.factory.inter.implementation;

import co.edu.uniquindio.bankingsystem.bankingsystem.factory.inter.Account;
import co.edu.uniquindio.bankingsystem.bankingsystem.factory.inter.Transaction;

import java.time.LocalDate;

public class Withdrawal extends Transaction {
    private double withdrawalLimit;
    private double commission;

    public Withdrawal() {
        super();
        this.withdrawalLimit = 8000000;
        this.commission = 2000;
    }

    public double getWithdrawalLimit() {
        return withdrawalLimit;
    }

    public double getCommission() {
        return commission;
    }
}
