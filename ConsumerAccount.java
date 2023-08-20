package banking;

public class ConsumerAccount extends Account {
    ConsumerAccount(Person person, Long accountNumber, int pin, double currentBalance){
        super(new AccountHolder(person.getIdNumber()),accountNumber,pin,currentBalance);
    }
}
