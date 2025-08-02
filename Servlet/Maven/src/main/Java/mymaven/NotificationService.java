package mymaven;

import java.util.Optional;

public interface AccountRepository {
    Optional<Account> findById(int id);
    void update(Account account);
}
