package co.edu.uniquindio.bankingsystem.bankingsystem.factory;

import co.edu.uniquindio.bankingsystem.bankingsystem.factory.inter.Account;
import co.edu.uniquindio.bankingsystem.bankingsystem.factory.inter.Transaction;
import co.edu.uniquindio.bankingsystem.bankingsystem.factory.inter.implementation.CheckingAccount;
import co.edu.uniquindio.bankingsystem.bankingsystem.factory.inter.implementation.Deposit;
import co.edu.uniquindio.bankingsystem.bankingsystem.factory.inter.implementation.SavingsAccount;
import co.edu.uniquindio.bankingsystem.bankingsystem.factory.inter.implementation.Withdrawal;
import co.edu.uniquindio.bankingsystem.bankingsystem.model.BankingSystem;
import co.edu.uniquindio.bankingsystem.bankingsystem.model.Customer;
import co.edu.uniquindio.bankingsystem.bankingsystem.model.builder.CustomerBuilder;

import java.util.List;

public class ModelFactory {
    private static ModelFactory modelFactory;
    private BankingSystem bankingSystem;

    private ModelFactory() {
        bankingSystem = new BankingSystem();
        initializeData();
    }

    public static ModelFactory getInstance() {
        if (modelFactory == null) {
            modelFactory = new ModelFactory();
        }
        return modelFactory;
    }

    private void initializeData() {
        AccountFactory accountFactory = new AccountFactory();
        TransactionFactory transactionFactory = new TransactionFactory();

        Account account1 = accountFactory.getAccount("SAVINGS");
        Account account2 = accountFactory.getAccount("CHECKING");

        Transaction transaction1 = transactionFactory.getTransaction("DEPOSIT");
        Transaction transaction2 = transactionFactory.getTransaction("WITHDRAWAL");

        account1.getTransactionList().add(transaction1);
        account2.getTransactionList().add(transaction2);

        Customer customer1 = new CustomerBuilder()
                .setName("John Doe")
                .setDNI("123456789")
                .setAdress("123 Main St")
                .setEmail("johndoe@example.com")
                .setPhoneNumber("123-456-7890")
                .setAssociatedAccount(account1)
                .setOwnByBankingSystem(bankingSystem)
                .build();

        Customer customer2 = new CustomerBuilder()
                .setName("Jane Doe")
                .setDNI("987654321")
                .setAdress("456 Elm St")
                .setEmail("janedoe@example.com")
                .setPhoneNumber("098-765-4321")
                .setAssociatedAccount(account2)
                .setOwnByBankingSystem(bankingSystem)
                .build();

        bankingSystem.addSavingsAccountList((SavingsAccount) account1);
        bankingSystem.addCheckingAccountList((CheckingAccount) account2);
        bankingSystem.addDepositList((Deposit) transaction1);
        bankingSystem.addWithdrawalList((Withdrawal) transaction2);
        bankingSystem.addCustomerList(customer1);
        bankingSystem.addCustomerList(customer2);
    }

    public List<Customer> getCustomerList() {
        return bankingSystem.getCustomerList();
    }

    public boolean removeCustomer(Customer selectedCustomer) {
        return bankingSystem.removeCustomer(selectedCustomer);
    }

    public boolean createCustomer(Customer customer) {
        return bankingSystem.createCustomer(customer);
    }

    public boolean upDateCustomer(Customer selectedCustomer, Customer customerUpdate) {
        return bankingSystem.updateCustomer(selectedCustomer, customerUpdate);
    }
}
