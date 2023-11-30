import static org.junit.jupiter.api.Assertions.*;

class AutoTest {

    Auto auto = new Auto();

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        auto = new Auto();
    }

    @org.junit.jupiter.api.Test
    void tanken1() {
        auto.tanken(50);
        assertEquals(50, auto.getTankinhalt());

        auto.tanken(0.01);
        assertEquals(50, auto.getTankinhalt());
    }


    @org.junit.jupiter.api.Test
    void fahren() {
        auto.fahren(0.01);
        assertEquals(0, auto.getTankinhalt());

        auto.tanken(50);
        auto.fahren(1000);
        assertEquals(0, auto.getTankinhalt());

        auto.fahren(0.01);
        assertEquals(0, auto.getTankinhalt());
    }

    @org.junit.jupiter.api.Test
    void getTankinhalt() {
        assertEquals(0, auto.getTankinhalt());
    }
}