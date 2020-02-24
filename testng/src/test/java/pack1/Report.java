package pack1;

import static org.junit.Assert.*;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Report {

	@Test
	public void test() {
		ExtentReports report=new ExtentReports("C:\\Users\\admin\\workspace\\6.30\\testng\\target\\report1.html");
		ExtentTest test=report.startTest("testcase1");
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		test.log(LogStatus.PASS, "invoke browser");
		driver.manage().window().maximize();
		test.log(LogStatus.INFO, "browser maximized");
		driver.get("https://www.cleartrip.com/");
		test.log(LogStatus.PASS, "Launching URL");
		driver.findElement(By.id("RoundTrip")).click();
		test.log(LogStatus.PASS, "Selecting Roudtrip");
		driver.findElement(By.id("FromTag")).sendKeys("Hyderabad");
		test.log(LogStatus.PASS, "Entering From Loc");
		driver.quit();
		test.log(LogStatus.PASS, "browser closed");
		report.endTest(test);//testcaseend
		report.flush();//testcase close
		report.close();//report close
		
		
	}

}
