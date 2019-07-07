package Utils;
import org.openqa.selenium.*;
import step_definitions.Hooks;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class Utilities {

    WebDriver driver=BrowserUtils.getDriver();

    public void waitSec(long length){
        try {
            Thread.sleep(length*1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void highlight(WebDriver driver, String xpath){
        WebElement element=driver.findElement(By.xpath(xpath));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].setAttribute('style', 'border: 2px solid yellow;');", element);
        //'background: yellow;
    }
    public void screenShot(){
        byte[] srcBytes = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
        Hooks.scenario.embed(srcBytes, "image/png");
    }

    public static String configReader(String key){
        Properties p = new Properties();
        try {
            FileReader file = new FileReader("src/main/java/configuration.properties");
            p.load(file);
        } catch (IOException e) {
            e.printStackTrace();
        }
       return p.getProperty(key);
    }






}
