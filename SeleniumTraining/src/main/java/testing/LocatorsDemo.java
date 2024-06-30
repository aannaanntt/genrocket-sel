package testing;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByTagName;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.rauschig.jarchivelib.FileType;

import io.github.bonigarcia.wdm.WebDriverManager;

/*
 * //select[@name="CompanyCountry"]//child::option[3] // this will select third child
 * 
 * //select[@id="CompanyCountry-kcG8"]//descendant:option            //will select all the child of parent node
 * //div[@class="fields-container section"]//descendant-or-self::div
 * 
 * //select[@name="CompanyCountry"]//parent::div
 * **/
////select[@name="CompanyCountry"]//self::select -> this will select the same tag provided in name
public class LocatorsDemo {
	public static String browser = "EDGE";
	
	public static void main(String[] args) throws InterruptedException {

		// System.setProperty("webdriver.edge.driver",
		// "C:\\Users\\Dell\\Downloads\\edgedriver_win64\\msedgedriver.exe");
		WebDriver driver = null;
		if(browser.equals("EDGE")) {
		driver = new EdgeDriver();
		}
	  
	
		// FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.salesforce.com/form/signup/elf-v2-login/?d=70130000000Enus");

		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[contains(@id,\"UserFirstName\")]")).sendKeys("standard_user");
//		driver.findElement(By.xpath("//*[@id=\"login_button_container\"]/div/form/div[2]/*")).sendKeys("secret_sauce");
//		driver.findElement(By.xpath("  //*[@id=\"login-button\"]")).click();
		//File screenshotAs = driver.getScreenshotAs(OutputType.FILE);
//		WebElement findElement = driver.findElement(By.tagName("button"));
//	
//		System.out.println(findElement.);
		
//		driver.get("https://www.imdb.com/chart/top/");
//
//		driver.manage().window().maximize();
//	 List<WebElement> findElements = driver.findElements(By.tagName("a"));
//	 
////	 	findElements.stream().forEach(x->{
////	 		System.out.println(x.getAttribute("href").length());
////	 	});
////	 
		
//		Thread.sleep(4000L);
//		driver.quit();
	}
}