package za.ac.cput.adp3_GitAssignment;

/**
 *      @author Dylan Koevort 218088159
 *      Small program that runs tests on 3 objects
 */

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.time.Duration;

import static java.time.Duration.ofMillis;
import static org.junit.jupiter.api.Assertions.*;

class UserPasswordTest {

    private UserPassword usernamePassword; //Real details
    private UserPassword user1; //incorrect entered user details
    private UserPassword user2; //Copy of real details

    @BeforeEach
    void setUp() {
        usernamePassword = new UserPassword("Koevort", "Koe123");
        user1 = new UserPassword("Koevort", "Koe123");
        user2 = usernamePassword;
    }

    @Test
    void testEquality() {
        assertEquals(usernamePassword, user2);
    }

    @Test
    void testIdentity() {
        assertSame(usernamePassword, user2);
    }

    @Test
    void testFail() {
        assertNotEquals(usernamePassword, user2);
    }

    @Test
    void testTimeoutFail() {
        assertTimeoutPreemptively(ofMillis(10), () -> {
            Thread.sleep(20);
            if((usernamePassword.getUsername().equals(user1.getUsername())) && (usernamePassword.getPassword().equals(user1.getPassword()))) {
                System.out.println("Correct Details");
            } else {
                System.out.println("Incorrect Details");
            }
        });
    }

    @Test
    void testTimeoutPass() {
        assertTimeoutPreemptively(ofMillis(100), () -> {
            if((usernamePassword.getUsername().equals(user1.getUsername())) && (usernamePassword.getPassword().equals(user1.getPassword()))) {
                System.out.println("Correct Details");
            } else {
                System.out.println("Incorrect Details");
            }
        });
    }

    @Disabled ("Disabling test")
    @Test
    void testDisable() {
        usernamePassword.toString();
    }
}