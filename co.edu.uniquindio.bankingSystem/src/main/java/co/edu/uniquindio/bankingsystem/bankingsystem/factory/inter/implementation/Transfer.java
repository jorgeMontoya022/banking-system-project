package co.edu.uniquindio.bankingsystem.bankingsystem.factory.inter.implementation;

import co.edu.uniquindio.bankingsystem.bankingsystem.factory.inter.Account;
import co.edu.uniquindio.bankingsystem.bankingsystem.factory.inter.Transaction;

import java.time.LocalDate;

public class Transfer extends Transaction {
    private final double comission;

    public Transfer(){
        super();
        this.comission = 500;
    }

    public double getComission() {
        return comission;
    }
}