package sample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import page.Common;

public class Test1 {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		 driver=new ChromeDriver();
		 driver.get("https://paytm.com/");
		 Thread.sleep(5000);
		 Actions act=new Actions(driver);
		 Common cmn=new Common(driver);
		 act.moveToElement(cmn.get_paytm_for_consumer()).perform();

	}

}
