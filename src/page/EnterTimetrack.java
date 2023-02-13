package page;

import java.util.List;

import javax.xml.xpath.XPath;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class EnterTimetrack 
{
	WebDriver driver;
	
	public EnterTimetrack(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(this.driver,this);
	}

	@FindBys({@FindBy(xpath = "//a")})
	private List<WebElement>l1;
	
	
	
	
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
	
	
	public List<WebElement> getall_link()
	{
		return l1;
	}
	
	
	
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
