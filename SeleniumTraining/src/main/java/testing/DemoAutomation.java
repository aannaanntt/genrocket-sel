package testing;

import java.io.File;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByTagName;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.rauschig.jarchivelib.FileType;

import com.genRocket.cli.LicenseChecker;
import com.genRocket.engine.EngineAPI;
import com.genRocket.engine.EngineManual;
import com.genRocket.shared.ProfileInfo;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DemoAutomation {
	public static String browser = "EDGE";
	
	public static void main(String[] args) {

		// System.setProperty("webdriver.edge.driver",
		// "C:\\Users\\Dell\\Downloads\\edgedriver_win64\\msedgedriver.exe");
//		WebDriver driver = null;
//		if(browser.equals("EDGE")) {
//		driver = new EdgeDriver();
//		}
//	
//	
//		// FirefoxDriver driver = new FirefoxDriver();
//		driver.get("https://www.saucedemo.com/");
//
//		driver.manage().window().maximize();
//		driver.findElement(By.xpath("//*[@id=\"login_button_container\"]/div/form/div[1]/*")).sendKeys("standard_user");
//		driver.findElement(By.xpath("//*[@id=\"login_button_container\"]/div/form/div[2]/*")).sendKeys("secret_sauce");
//		driver.findElement(By.xpath("  //*[@id=\"login-button\"]")).click();
		//File screenshotAs = driver.getScreenshotAs(OutputType.FILE);
//		WebElement findElement = driver.findElement(By.tagName("button"));
//	
//		System.out.println(findElement.);
		
		
		EngineAPI api= new EngineManual();
		String domainNamess="UserData";
		String genrocketScenarioss="C:\\Users\\Dell\\.genrocket\\UserScenario.grs";
		String genrocketTDCC="C:\\Users\\Dell\\.genrocket\\UserSeleniumDemo.gtdc";

       LicenseChecker licenseChecker = new LicenseChecker();
       ProfileInfo accessKey = licenseChecker.getAccessKey(genrocketScenarioss); // Correct usage
        System.out.println("Access Key: " + accessKey.getAccessKey());
        
		api.scenarioLoad(genrocketScenarioss,true);
		System.out.println("hi");
		api.testDataCaseAdd(genrocketTDCC, "Integration", "positive", true, true, null, null);
		List<Object> data = api.scenarioRunInMemory(domainNamess);
		
		data.stream().forEach(System.out::println);
	}
}
