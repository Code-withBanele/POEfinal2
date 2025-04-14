package org.example;

import java.util.regex.Pattern;

class Registration {
    private String userName;
    private String password;
    private String cellphoneNumber;


    public Registration(String userName, String password, String cellphoneNumber) {
        this.userName = userName;
        this.password = password;
        this.cellphoneNumber = cellphoneNumber;
    }

    public boolean checkUserName() {
        if (!userName.contains("_") && !(userName.length() <= 5)) {
            System.out.println("Invalid username.");
            return false;
        } else {
            System.out.println("Username is successfully captured.");
            return true;
        }
    }

    public boolean checkPasswordComplexity() {
        while (password.length() < 8) {

            System.out.println("Password is not correctly formatted, please ensure that the password contains at least eight characters, a capital letter, and a special character.");
        }

        boolean containsUppercase = false;
        boolean containsLowercase = false;
        boolean containsNumber = false;
        boolean containsSpecialCharacter = false;

        for (int i = 0; i < password.length(); i++) {
            char ch = password.charAt(i);
            if (Character.isUpperCase(ch)) {
                containsUppercase = true;
            }
            if (Character.isLowerCase(ch)) {
                containsLowercase = true;
            }
            if (Character.isDigit(ch)) {
                containsNumber = true;
            }
            if (!Character.isLetter(ch) && !Character.isDigit(ch) && !Character.isWhitespace(ch)) {
                containsSpecialCharacter = true;
            }
        }

        boolean isValid = containsUppercase && containsLowercase && containsNumber && containsSpecialCharacter;


        if (!isValid) {

            System.out.println("Password is not correctly formatted, please make sure that the password is at least eight characters, a capital letter, a number and a special a capital letter , a number and a special character.");

        } else {
            System.out.println("Password has been successfully captured.");
        }
        return isValid;
    }

    public boolean checkCellphoneNumber() {
        String cellphoneNumber = getCellPhoneNumber();
        Pattern pattern = Pattern.compile("^\\+27\\d{9}$");
        if (!pattern.matcher(cellphoneNumber).matches()) {
            System.out.println("Cellphone number has been incorrectly formatted or does not contain the country code.");
            return false;




        } else {
            System.out.println("Cellphone number has been correctly captured.");
            return true;

        }
    }

    public String getUserName()
    {
        return userName;
    }

    public String getPassword() {
        return password;
    }
    public String getCellPhoneNumber() {
        return cellphoneNumber;
    }
}



