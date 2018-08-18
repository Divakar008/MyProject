package FundTransfer;

import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestNGfp {
	Arithmetics obj = new Arithmetics();

	@BeforeClass
	public void befclass()
	{
		
		PropertyConfigurator.configure("log4j.properties");
	}
	
	@Test
	public void add() {
		obj.addtion(5, 5);

	}

	@Test
	public void sub() {
		obj.subraction(6, 5);
	}
	
	@Test
	public void launchbrowser() throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "C:\\Selenium\\geckodriver.exe");
		WebDriver c=new FirefoxDriver();
		c.manage().window().maximize();
		c.get("https://conv.rakbankonline.ae/corp3corporate/AuthenticationController?FORMSGROUP_ID__=AuthenticationFG&__START_TRAN_FLAG__=Y&__FG_BUTTONS__=LOAD&ACTION.LOAD=Y&AuthenticationFG.LOGIN_FLAG=1&BANK_ID=RAK&USER_TYPE=1&CORP_USER_FLG=Y");
		c.findElement(By.cssSelector("input[id='AuthenticationFG.CUSTOM_CORP_ID']")).sendKeys("hunttech");
		c.findElement(By.cssSelector("input[id='AuthenticationFG.CUSTOM_USER_ID']")).sendKeys("neerav7761");
		c.findElement(By.cssSelector("input[id='AuthenticationFG.ACCESS_CODE']")).sendKeys("rakbank123");
		c.findElement(By.cssSelector("input[id='VALIDATE_CREDENTIALS']")).click();
		Thread.sleep(12000);
	}
}
