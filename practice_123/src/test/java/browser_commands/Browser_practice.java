package browser_commands;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Browser_practice {

	public static void main(String[] args) throws Exception {
		// System.setProperty("webdriver.chrome.driver","H://chromedriver.exe");
		WebDriverManager.firefoxdriver().setup();
		// WebDriverManager.chromedriver().setup();
		// WebDriver driver = new ChromeDriver();
		WebDriver driver = new FirefoxDriver();
		// WebDriver driver = new InternetExplorerDriver();
		// WebDriver driver = new EdgeDriver();
		// WebDriver driver = new HtmlUnitDriver();
		driver.get("http://www.gmail.com/");
		Thread.sleep(6000);
		driver.manage().window().maximize();
		driver.close();

	}

}
