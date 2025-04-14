
//adding dependencies
package org.example;

import java.util.regex.Pattern;
//Registration class
class Registration {
    private String userName;
    private String password;
    private String cellphoneNumber;


    public Registration(String userName, String password, String cellphoneNumber) {
        this.userName = userName;
        this.password = password;
        this.cellphoneNumber = cellphoneNumber;
    }
    //validatting username function
    public boolean checkUserName() {
        if (!userName.contains("_") && !(userName.length() <= 5)) {
            System.out.println("Invalid username.");
            return false;
        } else {
            System.out.println("Username is successfully captured.");
            return true;
        }
    }
        //validatting password function
    public boolean checkPasswordComplexity() {
        while (password.length() < 8) {

            System.out.println("Password is not correctly formatted, please ensure that the password contains at least eight characters, a capital letter, and a special character.");
        }

        //declarring boolean variables conditions for password validation
        boolean containsUppercase = false;
        boolean containsLowercase = false;
        boolean containsNumber = false;
        boolean containsSpecialCharacter = false;

        //for loop for looping through the password and checking if it meets  the specified conditions 
        for (int i = 0; i < password.length(); i++) {
            char ch = password.charAt(i);

            //checks if the a leter in password contains an uppercase character
            if (Character.isUpperCase(ch)) {
                containsUppercase = true;
            }
            //checks if the a leter in password contains an lowercase character
            if (Character.isLowerCase(ch)) {
                containsLowercase = true;
            }
            //checks if the a leter in password contains a digit character
            if (Character.isDigit(ch)) {
                containsNumber = true;
            }
            //checks if the a leter in password contains a special character
            if (!Character.isLetter(ch) && !Character.isDigit(ch) && !Character.isWhitespace(ch)) {
                containsSpecialCharacter = true;
            }
        }

        //declaration of isValid variable  whose value depens on the output from the above conditions"true or false ", if all conditions are met then value is stored as true   
        boolean isValid = containsUppercase && containsLowercase && containsNumber && containsSpecialCharacter;


        if (!isValid) {
            //echo output
            System.out.println("Password is not correctly formatted, please make sure that the password is at least eight characters, a capital letter, a number and a special a capital letter , a number and a special character.");

        } else {
            System.out.println("Password has been successfully captured.");
        }
        return isValid;
    }
//checks if the cellphone meets the required coditions
    public boolean checkCellphoneNumber() {
        String cellphoneNumber = getCellPhoneNumber();

        //regex pattern object
        Pattern pattern = Pattern.compile("^\\+27\\d{9}$");

        //condittion to check if country code contains (+27) using regex patttern 
        if (!pattern.matcher(cellphoneNumber).matches()) {
            System.out.println("Cellphone number has been incorrectly formatted or does not contain the country code.");
            return false;




        } else {
            System.out.println("Cellphone number has been correctly captured.");
            return true;

        }
    }
// declaring the method to fetch the registerd users userrname for login
    public String getUserName()
    {
        return userName;
    }
// declaring the method to fetch the registerd users password for login
    public String getPassword() {
        return password;
    }

    // declaring the method to fetch the registerd users cell number
    public String getCellPhoneNumber() {
        return cellphoneNumber;
    }
}



