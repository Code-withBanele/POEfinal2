package org.example;

//importing project dependencies 
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

//creating the Registration class 
class RegistrationTest {
    private static Registration util;

    //initialising test  with test values provided 
    @org.junit.jupiter.api.BeforeAll
    public static void setUp() {
        util = new Registration("kyle_1", "Ch&&sec@ke99", "+27838968976");
    }
    //username test
    @Test
    void checkUserName() {
        Assertions.assertAll(
                //assert true method returns  true if the above provided data passes 
                () -> assertTrue(util.checkUserName()),

                //assertEquals contains the expected output first and the actual value second, test passes if values match
                () -> assertEquals("kyle_1", util.getUserName()),

                //assert true checks for the username length and returrns true if it meets the condition
                () -> assertTrue(util.getUserName().length() > 5)
        );
    }

    @Test
    void checkPasswordComplexity() {
        Assertions.assertAll(
                // declaring the method to fetch the registerd users password
                () -> assertTrue(util.checkPasswordComplexity()),
                //assertEquals contains the expected output first and the actual value second, test passes if values match
                () -> assertEquals("Ch&&sec@ke99", util.getPassword()),
                //assert true checks for the password length and returrns true if it meets the condition
                () -> assertTrue(util.getPassword().length() >= 8),
        
                () -> assertNotNull(util.getPassword())
        );
    }

    @Test
    void checkCellphoneNumber() {
        Assertions.assertAll(
                 // declaring the method to fetch the registerd users cellnumber
                () -> assertTrue(util.checkCellphoneNumber()),
                //assertEquals contains the expected output first and the actual value second, test passes if values match
                () -> assertEquals("+27838968976", util.getCellPhoneNumber()),
                //Assert true returns true if the cellphone number contais the specified  country code  
                () -> assertTrue(util.getCellPhoneNumber().startsWith("+27"))
        );
    }


}
