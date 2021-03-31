package za.ac.cput.adp3_GitAssignment;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import static org.junit.jupiter.api.Assertions.*;
/**
 *ADP3 Term 1 Assignment
 * small subtraction program
 *Edit SubtractionTest by Shane
 *Student number: 218279124
 *  **/


class SubtractionTest {

    private Subtraction s1;
    private Subtraction s2;

    @BeforeEach
    void setUp() {

        s1 = new Subtraction(1,1);
        s2= new Subtraction(1, 2);

    }

 //This is to test Equality:
    @Test
    void testEquality()
    {
        assertEquals(s2,s2);

    }
    // This is to test Identity:
    @Test
    void testIdentity(){

        assertSame(s2,s2);
    }
// This is to test fail:
    @Test
    public void testFailing(){

        int sub = 55;
        Subtraction s3 = new Subtraction(30,22);

        s3.setMarkA(sub);
        fail("This test will fail");

    }
    // This is to test Timeout:
    @Test
    @Timeout(2)
    public void time() throws InterruptedException {

        Thread.sleep(7000);
        while(true);
    }




}