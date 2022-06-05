package StepDefinitions;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class TrackOrderSteps {
	public WebDriver driver;
	@When("user is on TrackOrder page")
	public void user_is_on_track_order_page() throws InterruptedException, IOException {
		 WebDriverManager.chromedriver().setup();
		    driver = new ChromeDriver();
		    driver.manage().window().maximize();
			driver.get("https://www.urbanladder.com/orders/auth");
			System.out.println("Successfully open TrackOrder page");
			Thread.sleep(1000); 
		    File screenshotFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(screenshotFile, new File("C:\\Users\\mindsdet158\\eclipse-workspace\\CucumberUrbanLadder\\Screenshots\\Screen.png"));
			System.out.println("Screenshot captured successfully");


	}


}
