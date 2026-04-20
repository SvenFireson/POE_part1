
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
    if(username.contains("_") && username.length() <=5){
        return true;}
    else {return false;}
 } 
 
 public boolean checkPasswordComplexity(){
 boolean hasCapital = false;
 boolean hasNumber = false;
 boolean hasSpecial = false;
 
 if(password.length()<8){
 return false;}
 
 for(int i = 0; i< password.length();i++){
    char ch = password.charAt(i);
 
 if(Character.isUpperCase(ch)){
     hasCapital = true;}
 else if(Character.isDigit(ch)){
         hasNumber = true;}
         else if (!Character.isLetterOrDigit(ch)){
         hasSpecial = true;}
         }
 return hasCapital && hasNumber && hasSpecial;
 }
 
 public boolean checkCellPhoneNumber(){
 return false;}
 
 public String registerUser(){
 return "";}
 
 public boolean loginUser(String inputUserName, String inputPassword){
 return false;}
 
 public String returnLoginStatus(boolean loginSuccess){
 return "";}
 
}
