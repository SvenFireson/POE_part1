
package com.mycompany.poe_part1;

//These are all my attributes to store user information for login
public class Login {
    private String firtName;
    private String lastName;
    private String password;
    private String username;
    private String cellPhoneNumber;
    
    
    // this ensures that I am allowing allocations for my attributtes
public Login(String firstName, String lastName, String password, String username, String cellPhoneNumber){
    this.firtName = firstName;
    this.lastName = lastName;
    this.password = password;
    this.username = username;
    this.cellPhoneNumber = cellPhoneNumber;

}

// creating methods for attribuites using booleans
 public boolean  checkUserName(){
 return false;} 
 
 public boolean checkPasswordComplexity(){
 return false;}
 
 public boolean checkCellPhoneNumber(){
 return false;}
 
 public String registerUser(){
 return "";}
 
 public boolean loginUser(String inputUserName, String inputPassword){
 return false;}
 
 public String returnLoginStatus(boolean loginSuccess){
 return "";}
 
}
