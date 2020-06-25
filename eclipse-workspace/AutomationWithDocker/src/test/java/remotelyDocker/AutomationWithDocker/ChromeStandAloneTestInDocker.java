package remotelyDocker.AutomationWithDocker;

import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class ChromeStandAloneTestInDocker {

	public static void main(String[] args) throws Throwable {

		// Remote webdriver class implements webdriver interface
		// This clas is used when Selenium scripts are needed to run in Remotely.

		DesiredCapabilities cap = DesiredCapabilities.chrome();
		// Selenium code runs in Docker having default port 4444.
		// Below is the url to run code in the Container.
		// Also,before running code, container should be created in the machine.

		URL url = new URL("http://localhost:4444/wd/hub");
		RemoteWebDriver driver = new RemoteWebDriver(url, cap);

		driver.get("https://amazon.in");
		System.out.println("title of wesbite is " + driver.getTitle());
	}
}
