package SeleniumWorkshop;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UrlAcess {

	public static void main(String[] args) {
		

		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\extrainfo\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		String url="https://www.amazon.fr/" ;
		
		
		WebDriver  driver = new ChromeDriver();    //Polymorphisme
		
		driver.get(url);
		driver.manage().window().maximize();
		driver.findElement(By.id("sp-cc-accept")).click();

 driver.findElement(By.xpath("//*[@id=\"nav-link-accountList-nav-line-1\"]")).click();
// driver.findElement(By.xpath("//div[@id='nav-flyout-ya-signin']//span[@class='nav-action-inner'][normalize-space()='Identifiez-vous']")).click();
 driver.findElement(By.xpath("//input[@id='ap_email']")).sendKeys("extrashop497@gmail.com");
 driver.findElement(By.xpath("//input[@id='continue']")).click();
 driver.findElement(By.xpath("//input[@id='ap_password']")).sendKeys("Extra08781892");
 driver.findElement(By.xpath("//input[@id='signInSubmit']")).click();
driver.findElement(By.id("twotabsearchtextbox")).sendKeys("sport" + Keys.ENTER );
//Thread.sleep(5000);
//driver.close();
	}

}
