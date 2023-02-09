package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class User
{
   WebDriver driver;
   public User(WebDriver driver) 
   {
	this.driver=driver;
	PageFactory.initElements(this.driver, this);
   }
   
   @FindBy(xpath = "//input[@value='Create New User']")
   private WebElement create_new_user;
   
   @FindBy(xpath = "//input[@name='username']")
   private WebElement username;
   
   @FindBy(xpath = "//input[@name='passwordText']")
   private WebElement password;
   
   @FindBy(xpath = "//input[@name='passwordTextRetype']")
   private WebElement retypepassword;
   
   @FindBy(xpath = "//input[@name='firstName']")
   private WebElement firstname;
   
   @FindBy(xpath = "//input[@name='lastName']")
   private WebElement Lastname;
   
   @FindBy(xpath = "//input[@type='submit']")
   private WebElement createuser_btn;
   
   public WebElement get_createnewuser()
   {
	   return create_new_user;
   }
   
   public WebElement get_username()
   {
	   return username;
   }
   
   public WebElement get_password()
   {
	   return password;
   }
   
   public WebElement get_retypepassword()
   {
	   return retypepassword;
   }
   
   public WebElement get_firstname()
   {
	   return firstname;
   }
   
   public WebElement get_lastname()
   {
	   return Lastname;
   }
   
   public WebElement get_createuserbutton()
   {
	   return createuser_btn;
   }
   
   
   
   
   
}
