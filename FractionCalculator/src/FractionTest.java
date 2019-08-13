import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Test.*;
import static org.junit.jupiter.api.AfterEach.*;
import static org.junit.jupiter.api.BeforeEach.*;
class FractionTest {
   Fraction one;
   Fraction two;

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        one= new Fraction(6);
        two = new Fraction(2);
    }

    @org.junit.jupiter.api.AfterEach
    void tearDown() {
    }

    @org.junit.jupiter.api.Test
    void add() {
        Fraction result = new Fraction(8);
        assertEquals(result,one.add(two));
    }

    @org.junit.jupiter.api.Test
    void subtract() {
    }

    @org.junit.jupiter.api.Test
    void multiply() {
    }

    @org.junit.jupiter.api.Test
    void divide() {
    }
}