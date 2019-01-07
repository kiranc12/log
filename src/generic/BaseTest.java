package generic;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Listeners;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import io.github.bonigarcia.wdm.WebDriverManager;



@Listeners(Result.class)
public class BaseTest {
	public WebDriver driver;
	public Logger log = Logger.getLogger(getClass());
	public ExtentHtmlReporter repoter = new ExtentHtmlReporter("./report/extent.html");
	public ExtentReports exe= new ExtentReports();
	
    @BeforeSuite
    public void OpenBrowser() {
    	
//    	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
      WebDriverManager.chromedriver().setup();
    	 driver = new ChromeDriver();
    	
    }
    @AfterSuite
    public void close() {
    	driver.close();
    }
}