
package com.mycompany.poe_part1;

//These are all my attributes to store user information for login
public class Login {
    private String firstName;
    private String lastName;
    private String username;
    private String password;
    private String cellPhoneNumber;
    
    
    // this ensures that I am allowing allocations for my attributtes
public Login(String firstName, String lastName, String password, String username, String cellPhoneNumber){
    this.firstName = firstName;
    this.lastName = lastName;
    this.username = username;
    this.password = password;
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
 
 
 //Regex pattern adapted from: https://docs.galileo-ft.com/pro/reference/api-reference-phone-validation 
 public boolean checkCellPhoneNumber(){
 return cellPhoneNumber.matches("^\\+27\\d{9}$");}
 
 // This method validates user input and returns appropriate messages
// based on whether the username, password, and cell phone number are correct
 public String registerUser(){
 if(!checkUserName()){
    return "Username is not correctly formatted; please ensure that your username contains an underscore and is no more than five characters in length.";
 }
 if (!checkPasswordComplexity()){
     return "Password is not correctly formatted; please ensure that the password contains at least eight characters, a capital letter, a number, and a special character";
 }
 if(!checkCellPhoneNumber()){
     return "Cell phone number incorrectly formatted or does not contain international code.";
 }
 return "User successfully registered.";
 }
 
  //chceks whether the entered login details match the registered details
 public boolean loginUser(String inputUserName, String inputPassword){
     if(inputUserName.equals(username) && inputPassword.equals(password)){
     return true;
     }else{
     return false;}
 }
 
 //chceks whether the correct login message based on whether login was successful
 public String returnLoginStatus(boolean loginSuccess){
 if(loginSuccess){
     return "Welcome "+ firstName + ", " +lastName + " it is great to see you again";
 }else {
 return "Username or password incorrect, please try again";}
 }
 
}  
