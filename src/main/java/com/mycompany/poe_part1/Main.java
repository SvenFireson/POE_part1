

package com.mycompany.poe_part1;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter your first name: ");
        String firstName = scanner.nextLine();
        
        System.out.println("Enter your last name: ");
        String lastName = scanner.nextLine();
        
        System.out.println("Enter username: ");
        String username = scanner.nextLine();
        
        System.out.println("Enter password: ");
        String password = scanner.nextLine();
        
        System.out.println("Enter your cell phone Number: ");
        String cellPhoneNumber = scanner.nextLine();
        
        Login user = new Login(firstName,lastName,username,password,cellPhoneNumber);
        
        //Purpose of the registration message Only allow login if registration was successful
       String registrationMessage = user.registerUser();
        System.out.println(registrationMessage);
        
        if(registrationMessage.equals("User successfully registered.")){
       
        
        System.out.println("Enter username to login: ");
        String inputUserName = scanner.nextLine();
        
        System.out.println("Enter password to login: ");
        String inputPassword = scanner.nextLine();
        
        boolean loginSuccess = user.loginUser(inputUserName, inputPassword);
        System.out.println(user.returnLoginStatus(loginSuccess));
        }
        
        scanner.close();
        
        
       
    }
}
