package page;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class Tasks
{
WebDriver driver;
	
	public Tasks(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(this.driver,this);
	}
	
	@FindBys({@FindBy(xpath ="//input[@type='checkbox']")})
	private List<WebElement>chk;
	
	public List<WebElement> getall_checkbox()
	{
		return chk;
	}
	
	@FindBy(xpath = "//a[@class='content tasks']//img[@class='sizer']")
	private WebElement tasks;
	
	public WebElement get_tasks()
	{
		return tasks;
	}
}
