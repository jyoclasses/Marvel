package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EnterTimetrack 
{
	WebDriver driver;
	
	public EnterTimetrack(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(this.driver,this);
	}
	
	@FindBy(xpath ="//a[div[text()='Tasks']]")
	private WebElement tasks;
	
	@FindBy(xpath ="//a[div[text()='Reports']]")
	private WebElement Reports;
	
	@FindBy(xpath ="//a[div[text()='Users']]")
	private WebElement Users;

	@FindBy(xpath ="//a[div[text()='Work Schedule']]")
	private WebElement WorkSchedule;
	
	@FindBy(xpath ="//a[@class='logout']")
	private WebElement logout;
	
	public WebElement get_tasks()
	{
		return tasks;
	}
	public WebElement get_Reports()
	{
		return Reports;
	}
	public WebElement get_Users()
	{
		return Users;
	}
	public WebElement get_workschedule()
	{
		return WorkSchedule;
	}
	
	public WebElement get_logout()
	{
		return logout;
	}
	
}
