package mymaven;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;

import java.util.Optional;

public class AccountServiceTest {

    private AccountRepository repository;
    private NotificationService notifier;
    private AccountService service;

    @BeforeEach
    public void setup() {
        repository = mock(AccountRepository.class);
        notifier = mock(NotificationService.class);
        service = new AccountService(repository, notifier);
    }

    @Test
    public void testSuccessfulTransfer() {
        Account from = new Account(1, 500.0);
        Account to = new Account(2, 300.0);

        when(repository.findById(1)).thenReturn(Optional.of(from));
        when(repository.findById(2)).thenReturn(Optional.of(to));

        boolean result = service.transfer(1, 2, 200.0);

        assertTrue(result);
        assertEquals(300.0, from.getBalance());
        assertEquals(500.0, to.getBalance());

        verify(repository, times(1)).update(from);
        verify(repository, times(1)).update(to);
        verify(notifier, times(1)).send("Transferred 200.0 from account 1 to 2");
    }

    @Test
    public void testFailedTransferDueToInsufficientBalance() {
        Account from = new Account(1, 100.0);
        Account to = new Account(2, 300.0);

        when(repository.findById(1)).thenReturn(Optional.of(from));
        when(repository.findById(2)).thenReturn(Optional.of(to));

        boolean result = service.transfer(1, 2, 200.0);

        assertFalse(result);
        assertEquals(100.0, from.getBalance());
        assertEquals(300.0, to.getBalance());

        verify(repository, never()).update(any());
        verify(notifier, never()).send(any());
    }

    @Test
    public void testFailedTransferIfFromAccountMissing() {
        when(repository.findById(1)).thenReturn(Optional.empty());
        when(repository.findById(2)).thenReturn(Optional.of(new Account(2, 300.0)));

        boolean result = service.transfer(1, 2, 100.0);

        assertFalse(result);
        verify(repository, never()).update(any());
        verify(notifier, never()).send(any());
    }

    @Test
    public void testFailedTransferIfToAccountMissing() {
        when(repository.findById(1)).thenReturn(Optional.of(new Account(1, 300.0)));
        when(repository.findById(2)).thenReturn(Optional.empty());

        boolean result = service.transfer(1, 2, 100.0);

        assertFalse(result);
        verify(repository, never()).update(any());
        verify(notifier, never()).send(any());
    }
}
