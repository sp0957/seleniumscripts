package assignement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Question5remaining {
public static void main(String[] args) {
	
	System.setProperty("webdriver.chrome.driver","D:\\sahil learn\\Automation testing\\Sahilselenium\\chromedriver_win32 (1)\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	WebElement logo= driver.findElement(By.xpath("//img[@alt='Facebook']"));
     
	
	  String logo_image_url = logo.getAttribute("src");
	  System.out.println("Faceboook logo URL is ::"+logo_image_url);


}
}
