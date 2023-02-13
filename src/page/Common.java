package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Common 
{

	WebDriver driver;
	
	public Common(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(this.driver,this);
	}
	
	@FindBy(xpath = "//a[normalize-space()='Paytm for Consumer']")
	private WebElement paytm_for_consumer;
	
	public WebElement get_paytm_for_consumer()
	{
		return paytm_for_consumer;
	}

	
	
	
}
