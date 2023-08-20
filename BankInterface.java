package banking;

public interface BankInterface {

    Long openCommercialAccount(Company company, int pin, double startingDepposit);

    Long openConsumerAccount(Person person, int pin, double startingDeposit);

    boolean authenticateUser(Long accountNumber, int pin);

    double getBalance(Long accountNumber);

    void credit(Long accountNumber, double amount);

    boolean debit(Long accountNumber, double amount);
}
