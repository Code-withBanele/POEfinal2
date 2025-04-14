//importing package from org.example

package org.example;

//declaring our login class
class Login {

    //creating a registration object inside the class
    private Registration registration;

    //login class with the registration objectt passed as a parameter to fetch the user details
    public Login(Registration registration)
    {
        this.registration = registration;
    }

    //boolean method that checks if the enteterd credenttials match tthe credentials from the records.   
    public boolean authenticate(String userName, String password)

    {
        return registration.getUserName().equals(userName) && registration.getPassword().equals(password);
    }
}
