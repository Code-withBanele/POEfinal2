package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class RegistrationTest {
    private static Registration util;

    @org.junit.jupiter.api.BeforeAll
    public static void setUp() {
        util = new Registration("kyle_1", "Ch&&sec@ke99", "+27838968976");
    }

    @Test
    void checkUserName() {
        Assertions.assertAll(
                // Each assertion needs to be a lambda expression
                () -> assertTrue(util.checkUserName()),
                () -> assertEquals("kyle_1", util.getUserName()),
                () -> assertTrue(util.getUserName().length() > 5)
        );
    }

    @Test
    void checkPasswordComplexity() {
        Assertions.assertAll(
                () -> assertTrue(util.checkPasswordComplexity()),
                () -> assertEquals("Ch&&sec@ke99", util.getPassword()),
                () -> assertTrue(util.getPassword().length() >= 8),
                () -> assertNotNull(util.getPassword())
        );
    }

    @Test
    void checkCellphoneNumber() {
        Assertions.assertAll(
                () -> assertTrue(util.checkCellphoneNumber()),
                () -> assertEquals("+27838968976", util.getCellPhoneNumber()),
                () -> assertTrue(util.getCellPhoneNumber().startsWith("+27"))
        );
    }


}