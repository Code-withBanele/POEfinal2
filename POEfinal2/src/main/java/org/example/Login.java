package org.example;
class Login {
    private Registration registration;

    public Login(Registration registration)
    {
        this.registration = registration;
    }

    public boolean authenticate(String userName, String password)

    {
        return registration.getUserName().equals(userName) && registration.getPassword().equals(password);
    }
}
