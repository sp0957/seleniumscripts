package assignement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Question9 {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","D:\\sahil learn\\Automation testing\\Sahilselenium\\chromedriver_win32 (1)\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("http://demo.guru99.com/test/delete_customer.php");
	
	driver.findElement(By.name("cusid")).sendKeys("123");
	driver.findElement(By.name("submit")).click();
	
	driver.switchTo().alert().accept();
	driver.switchTo().alert().accept();
	
	driver.close();
	
}
}
