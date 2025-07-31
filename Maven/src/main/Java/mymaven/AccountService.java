package mymaven;

public class AccountService {
    private final AccountRepository repository;
    private final NotificationService notifier;

    public AccountService(AccountRepository repository, NotificationService notifier) {
        this.repository = repository;
        this.notifier = notifier;
    }

    public boolean transfer(int fromId, int toId, double amount) {
        Optional<Account> fromOpt = repository.findById(fromId);
        Optional<Account> toOpt = repository.findById(toId);

        if (fromOpt.isEmpty() || toOpt.isEmpty()) {
            return false;
        }

        Account from = fromOpt.get();
        Account to = toOpt.get();

        if (from.getBalance() < amount) {
            return false;
        }

        from.withdraw(amount);
        to.deposit(amount);

        repository.update(from);
        repository.update(to);
        notifier.send("Transferred " + amount + " from account " + fromId + " to " + toId);

        return true;
    }
}

