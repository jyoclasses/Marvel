package sample;

import java.awt.AWTException;
import java.awt.Button;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import page.Common;
import page.Login;
import page.Tasks;

public class Test1 {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException, AWTException, IOException {
		 driver=new ChromeDriver();
		 driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-2.html");
		 driver.manage().window().maximize();
		 List<WebElement> src=driver.findElements(By.xpath("//div[ contains(@id,'box') and @class='dragableBox']"));
		 WebElement dest=driver.findElement(By.id("dropBox"));
		 Actions act=new Actions(driver);
		 Thread.sleep(2000);
		 
		 for(int i=0;i<=src.size()-1;i++)
		 {
			 act.dragAndDrop(src.get(i), dest).perform();
			 
			 Thread.sleep(1000);
		 }
		
		
		 
		 
		 

	}

}
