//importing dependencies
package org.example;

import java.util.Scanner;

        public class Main {
            public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);

                // Registration process
                System.out.println("Registration:");

                System.out.println("Please enter your firstname");
                String FirstName = sc.next();
                System.out.println("Please enter your Last name");
                String LastName = sc.next();
                System.out.println("Please enter a username: ");
                String userName = sc.next();
                System.out.println("Please enter a password: ");
                String password = sc.next();
                System.out.println("Please enter a cellphone number: ");
                String cellphoneNumber = sc.next();

                Registration registration = new Registration(userName, password, cellphoneNumber);

                boolean isUsernameValid = registration.checkUserName();
                boolean isPasswordValid = registration.checkPasswordComplexity();
                boolean isCellphoneValid = registration.checkCellphoneNumber();

                if (isUsernameValid && isPasswordValid && isCellphoneValid) {
                    System.out.println("Registration successful!");

                    // Login process
                    System.out.println("\nLogin:");
                    System.out.println("Please enter your username: ");
                    String loginUserName = sc.next();
                    System.out.println("Please enter your password: ");
                    String loginPassword = sc.next();

                    Login login = new Login(registration);
                    boolean isLoginSuccessful = login.authenticate(loginUserName, loginPassword);

                    if (isLoginSuccessful) {
                        System.out.println("Login successful!");
                        System.out.println("welcome" + FirstName + LastName);
                    } else {
                        System.out.println("Username or password incorrect please try again. ");
                    }
                }
            }
        }






