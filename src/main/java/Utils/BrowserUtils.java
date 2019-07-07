package Utils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import java.net.MalformedURLException;
import java.net.URL;

//singleton driver
public class BrowserUtils {


    private static WebDriver driver;


    public static WebDriver getDriver() {
        if (driver == null) {
            String browser = Utilities.configReader("browser");
            if (browser.equalsIgnoreCase("chrome")) {
                System.setProperty("webdriver.chrome.driver",
                        "/Users/Tsolmon/Documents/selenium dependencies/drivers/chromedriver");
                driver=new ChromeDriver();

                return driver;

            } else if (browser.equalsIgnoreCase("firefox")) {
                System.setProperty("webdriver.gecko.driver",
                        "/Users/Tsolmon/Documents/selenium dependencies/drivers/gecko");
                driver=new FirefoxDriver();;
                return driver;

            } else if (browser.equalsIgnoreCase("remote")) {
                try {
                    DesiredCapabilities capabilities = new DesiredCapabilities();
                    String username = Utilities.configReader("sauceUserName");
                    String accessKey = Utilities.configReader("sauceAccessKey");
                    capabilities.setCapability("browserName", "Chrome");
                    capabilities.setCapability("platform", "Windows 10");
                    capabilities.setCapability("version", "66.0");
                    String url = "http://" + username + ":" + accessKey + "@ondemand.saucelabs.com:80/wd/hub";
                    driver = new RemoteWebDriver(new URL(url), capabilities);
                    return driver;
                } catch (MalformedURLException e) {
                    e.printStackTrace();
                }
            }
        }
            return driver;

        }


    public static void main(String[] args) {
        getDriver().get("https://www.google.com");
        getDriver().get("https://www.amazon.com");
        getDriver().get("https://www.etsy.com");

        driver.quit();
    }
    }
