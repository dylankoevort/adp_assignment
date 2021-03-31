package za.ac.cput.adp3_GitAssignment;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AdditionTest {

    private Addition intSum;
    private Addition intSum2;
    private Addition intSum3;

    @BeforeEach
    void setUp() {
        this.intSum = new Addition();
        this.intSum2 = new Addition();
        intSum3 = intSum;
    }

    @Test
    void testIdentity(){
        assertSame(intSum, intSum3);
    }

    @Test
    void testEquality(){
        assertEquals(intSum, intSum3);
    }

    @Test
    void main() {
        int sum = intSum.intSum(5,10);
        assertEquals(15, sum);
    }
}