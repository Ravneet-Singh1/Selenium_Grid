import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class GoogleTest {

	@Test
	public void HomePageCheck() throws MalformedURLException, InterruptedException {
		DesiredCapabilities dcap = new DesiredCapabilities();
		dcap.setBrowserName("chrome");

		WebDriver driver = new RemoteWebDriver(new URL("http://192.168.1.3:4444"), dcap);
		driver.get("https://www.google.com");
		driver.findElement(By.name("q")).sendKeys("Ravneet Singh");
		Thread.sleep(2000);
		System.out.println(driver.getTitle());
		System.out.println("Adding a dummy line");
		driver.close();
	}

}
