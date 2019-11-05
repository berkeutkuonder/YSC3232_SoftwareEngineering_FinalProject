package com.example.androidpayme;

/**
 *
 * @author Karolina
 */


import java.io.Serializable;

/**
 *
 * User of application
 */
@SuppressWarnings("serial") //With this annotation we are going to hide compiler warnings
public class User implements Serializable {

    String userName;
    String firstName;
    String lastName;
    String password;
    String email;
    String answer;
    int id;

    public User(String userName, String firstName, String lastName, String password, String email, String answer, int id )
    {
        this.email = email;
        this.firstName= firstName;
        this.lastName = lastName;
        this.userName = userName;
        this.password = password;
        this.id = id;
        this.answer = answer;

    }

    public User()
    {

    }

    public String getEmail() {return this.email;}
    public String getFirstName()
    {
        return this.firstName;
    }
    public String getAnswer() {return this.answer;}
    public String getLastName()
    {
        return this.lastName;
    }

    public String getUserName()
    {
        return this.userName;
    }
    public String getPassword()
    {
        return this.password;
    }

    public int getID()
    {
        return this.id;
    }

    public void setPassword(String password)
    {
        this.password = password;
    }

}





