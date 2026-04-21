

package com.mycompany.poe_part1;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String firstName;
        while(true){
        System.out.println("Enter your first name: ");
        firstName = scanner.nextLine();
        
        if(firstName.matches("[a-zA-Z]+")){
            break;
        }else {
            System.out.println("Invalid first name. Please use letters only.");
        }
            }
        
        
        String lastName;
        while(true){
        System.out.println("Enter your last name: ");
        lastName = scanner.nextLine();
        
        if(lastName.matches("[a-zA-Z]+")){
            break; 
        }else {
            System.out.println("Invalid last name. Please use letters only.");
        }
        }
        
        
        
        System.out.println("Enter username: ");
        String username = scanner.nextLine();
        
        System.out.println("Enter password: ");
        String password = scanner.nextLine();
        
        System.out.println("Enter your cell phone Number: ");
        String cellPhoneNumber = scanner.nextLine();
        
        Login user = new Login(firstName,lastName,password,username,cellPhoneNumber);
        
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
