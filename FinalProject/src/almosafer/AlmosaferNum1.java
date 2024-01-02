package almosafer;

//1- go to the above website and print all the feed back for example ممتاز و جيد

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AlmosaferNum1 {


	WebDriver driver = new ChromeDriver();
	String Url ="https://global.almosafer.com/ar/hotel/details/atg/فندق-كراون-روز-1798809";
	
	
	@BeforeTest 
	public void MyBeforeTest() {
		driver.get(Url);
	}
	
	@Test 
	public void MyTest() {

	        WebElement feedbackContainer = driver.findElement(By.className("sc-eMgOci"));
	        List<WebElement> feedbackElements = feedbackContainer.findElements(By.className("sc-gwZsXD"));

	        for(int i=0 ; i < feedbackElements.size();i++) {
	        	
	        	 String resultOfFeedback = feedbackElements.get(i).getText();
	        	 System.out.println(resultOfFeedback);
	        }
	        
	}
	
	@AfterTest 
	public void MyAfterTest() {
		   driver.quit();
			
		
	}
	
	
	
	
}