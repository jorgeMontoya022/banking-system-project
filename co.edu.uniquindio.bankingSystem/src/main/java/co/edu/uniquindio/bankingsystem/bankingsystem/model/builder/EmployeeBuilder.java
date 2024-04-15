package co.edu.uniquindio.bankingsystem.bankingsystem.model.builder;

import co.edu.uniquindio.bankingsystem.bankingsystem.model.BankingSystem;
import co.edu.uniquindio.bankingsystem.bankingsystem.model.Employee;
import co.edu.uniquindio.bankingsystem.bankingsystem.model.enums.TypeEmployee;
import co.edu.uniquindio.bankingsystem.bankingsystem.services.IBuilder;

public class EmployeeBuilder implements IBuilder {

    private String name;
    private TypeEmployee typeEmployee;
    private BankingSystem ownByBankingSystem;

    public EmployeeBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public EmployeeBuilder setTypeEmployee(TypeEmployee typeEmployee) {
        this.typeEmployee = typeEmployee;
        return this;
    }

    public EmployeeBuilder setOwnByBankingSystem(BankingSystem ownByBankingSystem) {
        this.ownByBankingSystem = ownByBankingSystem;
        return this;
    }

    @Override
    public Employee build() {
        return new Employee(name, typeEmployee, ownByBankingSystem);
    }

}
