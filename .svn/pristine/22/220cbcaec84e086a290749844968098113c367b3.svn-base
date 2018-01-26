package pack2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Class3 {
	public static void main(String[] args) throws Throwable {
		
		
		System.setProperty("webdriver.ie.driver", "D:\\2.Vikram\\5.BrowserDrivers\\iedriverserver.exe");
		WebDriver driver=new InternetExplorerDriver();
		
		driver.get("http://apps.qaplanet.in/qahrm/login.php");
		
		Thread.sleep(5000);
			
		//driver.quit();
		
		
		Runtime.getRuntime().exec("taskkill /f /fi \"pid gt 0\" /im IEDriverServer.exe");
		Runtime.getRuntime().exec("taskkill /f /fi \"pid gt 0\" /im iexplore.exe");
	}

}
