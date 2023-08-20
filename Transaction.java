package banking;

public class Transaction implements TransactionInterface{

    Long accountNumber;
    Bank bank;

    public Transaction(Long accountNumber, Bank bank, int attemptedPin) throws IllegalAccessException {
        if(bank.authenticateUser(accountNumber,attemptedPin)==false){
            throw new IllegalAccessException();
        }
        this.accountNumber = accountNumber;
        this.bank = bank;
    }

    @Override
    public double getBalance() {
        return bank.getBalance(accountNumber);
    }

    @Override
    public void credit(double amount) {
        bank.credit(accountNumber,amount);
    }

    @Override
    public boolean debit(double ammount) {
        return bank.debit(accountNumber,ammount);
    }
}
