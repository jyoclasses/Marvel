package sample;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import page.EnterTimetrack;
import page.Login;
import page.Tasks;
import page.User;

public class Test {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException 
	{
	 driver=new ChromeDriver();
	 driver.get("http://127.0.0.1/login.do");
	 Thread.sleep(500);
	 Login lg=new Login(driver);
	 lg.getun().sendKeys("admin");
	 lg.getpwd().sendKeys("manager");
	 lg.getlgnbtn().click();
	 Thread.sleep(1000);
	
	 Tasks task=new Tasks(driver);
	 task.get_tasks().click();
	 
	 for(int i=0;i<=task.getall_checkbox().size()-1;i++)
	 {
		 task.getall_checkbox().get(i).click();
		 
		 Thread.sleep(1000);
		 
	 }
	 
	 
	/* EnterTimetrack timetrack=new EnterTimetrack(driver);
	 timetrack.get_Users().click();
	 Thread.sleep(1000);
	 User user=new User(driver);
	 user.get_createnewuser().click();
	 Thread.sleep(1000);
	 user.get_username().sendKeys("Ramu");
	 user.get_password().sendKeys("123123");
	 user.get_retypepassword().sendKeys("123123");
	 user.get_firstname().sendKeys("Ramu");
	 user.get_lastname().sendKeys("Kavin");
	 user.get_createuserbutton().click();
	 Thread.sleep(1000);
	 timetrack.get_logout().click();*/
	 
	 
	 
	 
	}

}
