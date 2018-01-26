package pack3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Class1 {
	
	public static void main(String[] args) throws Throwable {
		
		System.setProperty("webdriver.chrome.driver", "D:\\2.Vikram\\5.BrowserDrivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
				
		driver.findElement(By.name("email")).sendKeys("antony");
		Thread.sleep(5000);
		
		String emailAddress=driver.findElement(By.name("email")).getAttribute("value");
		System.out.println("****"+emailAddress+"*********");
			
		driver.quit();
		

	}

}
