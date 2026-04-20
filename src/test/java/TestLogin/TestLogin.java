/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package TestLogin;

import com.mycompany.poe_part1.Login;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author svenf
 */
public class TestLogin {
    
    public TestLogin() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }


@Test
//this test is to use if correct user name is entered and shows welcome message
public void testUsernameCorrectlyFormatted(){
    Login login = new Login("Kyle", "Smith", "Ch&&sec@ke99!", "kyl_1", "+27838968976");
    String expected = "Welcome Kyle, Smith it is great to see you again.";
    boolean success = login.loginUser("kyl_1", "Ch&&sec@ke99!");
    String actual = login.returnLoginStatus(success);
    assertEquals(expected, actual, "Expected welcome message for valid username");
}
@Test
//Test to see when username entered incorrectly that username will get rejected so test will pass 
public void testUsernameinCorrectlyFormatted(){
    Login login = new Login("Kyle", "Smith", "Ch&&sec@ke99!", "kyle!!!!!!!", "+27838968976");
    String expected = "Username is not correctly formatted; please ensure that your username contains an underscore and is no more than five characters in length.";
    String actual = login.registerUser();
    assertEquals(expected, actual, "Expected error message for invalid username");
}

@Test
//checking if valid password allows registration
public void testPasswordCorrectlyFormatted(){
        Login login = new Login("Kyle", "Smith", "Ch&&sec@ke99!", "kyl_1", "+27838968976");
        String expected = "User successfully registered.";
        String actual = login.registerUser();
        assertEquals(expected,actual,"Should allow registration for valid password");
}
 
@Test
 // checking if weak password is rejected so test will pass
public void testPasswordIncorrectlyFormatted(){
    Login login = new Login("Kyle", "Smith", "password", "kyl_1", "+27838968976");
    String expected = "Password is not correctly formatted; please ensure that the password contains at least eight characters, a capital letter, a number, and a special character.";
    String actual = login.registerUser();
    assertEquals(expected, actual, "Should reject weak password");
}

 @Test
 //Test is to see that the cell phone number has been entered properly
 public void testCellPhoneNumberCorrect(){
    Login login = new Login("Kyle", "Smith", "Ch&&sec@ke99!", "kyl_1", "+27838968976");
    String expected = "User successfully registered.";
    String actual = login.registerUser();
    assertEquals(expected, actual, "Should accept valid SA phone number with +27");
}
 @Test
 //Test is to see that cell phone number is entered incorrectly so test will pass
 public void testCellPhoneNumberIncorrect(){
    Login login = new Login("Kyle", "Smith", "Ch&&sec@ke99!", "kyl_1", "08966553");
    String expected = "Cell number is incorrectly formatted or does not contain an international code; please correct the number and try again.";
    String actual = login.registerUser();
    assertEquals(expected, actual, "Should reject phone number without international code");}
 
 @Test
 // checking login works with correct username and password
public void testLoginSuccessful() {
    Login login = new Login("Kyle", "Smith", "Ch&&sec@ke99!", "kyl_1", "+27838968976");
    boolean success = login.loginUser("kyl_1", "Ch&&sec@ke99!");
    String expected = "Welcome Kyle, Smith it is great to see you again.";
    String actual = login.returnLoginStatus(success);
    assertEquals(expected, actual, "Should return welcome message for valid login");
}
 @Test
  // checking login fails with incorrect details
    public void testLoginFailure(){
    Login login = new Login("Kyle", "Smith", "Ch&&sec@ke99!", "kyl_1", "+27838968976");
    boolean success = login.loginUser("wrongUser", "wrongPass");
    String expected = "Username or password incorrect, please try again";
    String actual = login.returnLoginStatus(success); 
    assertEquals(expected, actual, "should reject invalid login details");
 }
}
