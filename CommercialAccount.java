package banking;

import java.util.List;

public class CommercialAccount extends Account {
    List<Person> authorizedUsers;

    CommercialAccount(Company company, Long accountNumber, int pin, double startingDeposit){
        super(new AccountHolder(company.getTaxId()),accountNumber,pin,startingDeposit);
    }

    void addAuthorizedUser(Person person){
        authorizedUsers.add(person);
    }

    boolean isAuthorizedUser(Person person){
        return authorizedUsers.contains(person);
    }
}
