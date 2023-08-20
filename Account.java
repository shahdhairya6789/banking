package banking;

public class Account implements AccountInterface {

    AccountHolder accountHolder;
    Long accountNumber;
    int pin;
    double balance;

    public Account(AccountHolder accountHolder, Long accountNumber, int pin, double balance) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.pin = pin;
        this.balance = balance;
    }

    @Override
    public AccountHolder getAccountHolder() {
        return this.accountHolder;
    }

    @Override
    public boolean validatePin(int attemptedPin) {
        return pin==attemptedPin;
    }

    @Override
    public double getBalance() {
        return balance;
    }

    @Override
    public Long getAccountNumber() {
        return this.accountNumber;
    }

    @Override
    public void creditAccount(double amount) {
        if(amount>0){
            this.balance+=amount;
        }
    }

    @Override
    public boolean debitAccount(double amount) {
        if(amount<=balance){
            balance-=amount;
            return true;
        }
        return false;
    }
}
