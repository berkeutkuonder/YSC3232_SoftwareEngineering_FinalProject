package g1.paymeback;

/**
 *
 * @author Karolina
 */


/**
 *
 * User of application
 */
public class User {
    
    String userName;
    String firstName;
    String lastName;
    String password;
    int id;

   public User(String firstName, String lastName, String email, String userName, String password)
  {
      this.firstName= firstName;
      this.lastName = lastName;
      this.userName = userName;
      this.password = password;
   
      
  }
  
  public User()
  {
      
  }

  public String getFirstName()
  {
    return this.firstName;
  }
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

  public void setFirstName(String firstName)
  {
    this.firstName = firstName;
  }
  public void setLastName(String lastName)
  {
    this.lastName = lastName;
  }
  public void setUserName(String userName)
  {
    this.userName = userName;
  }
  public void setPassword(String password)
  {
    this.password = password;
  }
  

}


