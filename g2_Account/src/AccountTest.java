import static org.junit.jupiter.api.Assertions.*;

class AccountTest {
    Account account = null;


    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        account = new Account(1000);
    }

    @org.junit.jupiter.api.AfterEach
    void tearDown() {
        account = null;
    }

    @org.junit.jupiter.api.Test
    void getBalance() {
        assertEquals(1000, account.getBalance());
    }

    @org.junit.jupiter.api.Test
    void withdraw() {
        account.withdraw(100);
        assertEquals(900, account.getBalance());

        account.withdraw(1000);
        assertEquals(900, account.getBalance());
    }

    @org.junit.jupiter.api.Test
    void deposit() {
        account.deposit(100);
        assertEquals(1100, account.getBalance());

        account.deposit(-1200);
        assertEquals(-100, account.getBalance());
    }
}