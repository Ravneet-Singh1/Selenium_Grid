import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class RSATest {

	@Test
	public void HomePageCheck() throws MalformedURLException, InterruptedException {
		DesiredCapabilities dcap = new DesiredCapabilities();
		dcap.setBrowserName("firefox");

		WebDriver driver = new RemoteWebDriver(new URL("http://192.168.1.3:4444"), dcap);
		driver.get("https://www.rahulshettyacademy.com/");
		System.out.println(driver.getTitle());
		Thread.sleep(2000);
		driver.close();
	}

}
