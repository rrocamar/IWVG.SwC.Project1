package es.upm.miw.iwvg.collaborativesw;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class UserTest {

    private User user;

    @BeforeEach
    void before() {
        user = new User(1, "Ramón", "Roca");
    }

    @Test
    void testFullName() {
        assertEquals("Ramón Roca", user.fullName());
    }

    @Test
    void testInitials() {
        assertEquals("R.", user.initials());

    }

    @Test
    void testGetNumber() {
        assertEquals(1, user.getNumber());
    }

    @Test
    void testGetName() {
        assertEquals("Ramón", user.getName());
    }

    @Test
    void testGetFamilyName() {
        assertEquals("Roca", user.getFamilyName());
    }
}
