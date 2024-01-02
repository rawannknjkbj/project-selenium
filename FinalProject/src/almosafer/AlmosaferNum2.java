package almosafer;


//2-go to hotel tab section and enter in the search area
//one of those cities (amman,dubai,jeddah,muscat)

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AlmosaferNum2 {

	Random random = new Random();
	WebDriver driver = new ChromeDriver();
	String Url = "https://global.almosafer.com/ar/hotel/details/atg/%D9%81%D9%86%D8%AF%D9%82-%D9%83%D8%B1%D8%A7%D9%88%D9%86-%D8%B1%D9%88%D8%B2-1798809";

	@BeforeTest
	public void MyBeforeTest() {
		driver.get(Url);
		driver.findElement(By.className("cta__saudi")).click();
	}

	@Test
	public void MyTest() {
		driver.findElement(By.cssSelector("#uncontrolled-tab-example-tab-hotels")).click();
		
		List<String> arrayDestinationEnglish = Arrays.asList("Dubai", "Jeddah", "Muscat", "Amman");
		int randomIndexTwo = random.nextInt(arrayDestinationEnglish.size());
		driver.findElement(By.cssSelector("[data-testid='AutoCompleteInput']"))
				.sendKeys(arrayDestinationEnglish.get(randomIndexTwo));
	}

	@AfterTest
	public void MyAfterTest() {
//		   driver.quit();

	}
}