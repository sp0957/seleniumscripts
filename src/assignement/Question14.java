package assignement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Question14 {
	
	WebDriver driver;
	
	@DataProvider (name = "sahil")
	public Object[][] input() {
		return new Object [][] {{"test1","test123"}};
	}
	
	@Test(dataProvider = "sahil")
	
	public void login(String uname, String password) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\sahil learn\\Automation testing\\Sahilselenium\\chromedriver_win32 (1)\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.instagram.com/");
		Thread.sleep(2000);
		driver.findElement(By.name("username")).sendKeys(uname);
		driver.findElement(By.name("password")).sendKeys(password);
		
		
		
		driver.findElement(By.xpath("//*[@id=\"loginForm\"]/div/div[3]")).click();
		driver.close();
	}	
	
}
