package banking;

import java.util.LinkedHashMap;

public class Bank implements BankInterface{

    LinkedHashMap<Long, Account> accounts;
    private static long number=0;

    public Bank(LinkedHashMap<Long, Account> accounts) {
        this.accounts = accounts;
    }

    private Account getAccount(Long accountNumber){
        return accounts.get(accountNumber);
    }

    @Override
    public Long openCommercialAccount(Company company, int pin, double startingDeposit) {
        number++;
        accounts.put(number,new CommercialAccount(company,number,pin,startingDeposit));
        return number;
    }

    @Override
    public Long openConsumerAccount(Person person, int pin, double startingDeposit) {
        number++;
        accounts.put(number,new ConsumerAccount(person,number,pin,startingDeposit));
        return number;
    }

    @Override
    public boolean authenticateUser(Long accountNumber, int pin) {
        return accounts.get(accountNumber).validatePin(pin);
    }

    @Override
    public double getBalance(Long accountNumber) {
        return accounts.get(accountNumber).balance;
    }

    @Override
    public void credit(Long accountNumber, double amount) {
        accounts.get(accountNumber).creditAccount(amount);
    }

    @Override
    public boolean debit(Long accountNumber, double amount) {
        return accounts.get(accountNumber).debitAccount(amount);
    }
}
