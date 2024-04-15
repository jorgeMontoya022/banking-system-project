package co.edu.uniquindio.bankingsystem.bankingsystem.model;

import co.edu.uniquindio.bankingsystem.bankingsystem.model.enums.TypeEmployee;

public class Employee {
    private String name;
    private TypeEmployee typeEmployee;
    private BankingSystem ownByBankingSystem;

    public Employee(String name, TypeEmployee typeEmployee, BankingSystem ownByBankingSystem) {
        this.name = name;
        this.typeEmployee = typeEmployee;
        this.ownByBankingSystem = ownByBankingSystem;
    }

    public String getName() {
        return name;
    }

    public TypeEmployee getTypeEmployee() {
        return typeEmployee;
    }

    public BankingSystem getBankingSystem() {
        return ownByBankingSystem;
    }
}