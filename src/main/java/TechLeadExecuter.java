import Pages.Page;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TechLeadExecuter {

    WebDriver driver;
    Page page = new Page();


    @Before
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.get(page.URL);
    }


    @Test
    public void isPageOpen(){
        Assert.assertTrue(driver.findElement(By.xpath(page.HomeLink)).isDisplayed());
    }
    @Test
    public void test1(){
        String expected="Our goal is to provide a chance to start a career in IT and to open new opportunities for people with no IT or coding background.";
        String actual=driver.findElement(By.xpath(page.textUnderLogo)).getText();
        Assert.assertEquals(expected,actual);
    }
    @Test
    public void test2(){
        Assert.assertTrue(driver.findElement(By.xpath(page.InfoSessionLink)).isDisplayed());
    }
    @Test
    public void test3(){
        String expected ="In 6 month you will master the following technologies and tools. Our curriculum is heavily based on practices and projects. 70% - coding (challenges and projects ), 20% - theory and 10% - reflection time.  You will gain a strong programming knowledge based on Java. All our instructors have professional experience who constantly improve and ensure that our curriculum is up to date and industry relevant. Students work with the most in-demand tools and technologies which give them opportunity to gain practical knowledge. Lastly, the main reason to learn programming - it opens new opportunities in your career life.";
        String actual = driver.findElement(By.xpath(page.textUnderCirculum)).getText();
        Assert.assertEquals(expected,actual);
    }
    @After
    public void tearDown(){
        driver.quit();
}















//    public static void main(String[] args) {
//        WebDriverManager.chromedriver().setup();
//        Page page=new Page();
//        Page email=new Page();
//       WebDriver driver= new ChromeDriver();
//       //driver.manage().window().maximize();
//
//    driver.get(page.URL);
//        waitSec(3);
//        driver.findElement(By.xpath(page.typeYourMessageTextBox)).getText();
//        driver.findElement(By.xpath(page.firstNameTextBox)).sendKeys("Tsolmon");
//        driver.findElement(By.xpath(page.lastNameTextBox)).sendKeys("Baasandorj");
//        driver.findElement(By.xpath(page.phoneTextBox)).sendKeys("99555352");
//        driver.findElement(By.xpath(page.emailTextBox)).sendKeys("Tsolmon_mm@yahoo.com");
//        driver.findElement(By.xpath(page.subjectTextBox)).sendKeys("Greeting");
//
//       WebElement wb= driver.findElement(By.xpath(page.typeYourMessageTextBox));
//       wb.clear();
//        waitSec(3);
//       wb.sendKeys("Sainuu Kuba!");
//
//        waitSec(2);
//        driver.quit();
//
//    driver.get(email.URL);
//       // WebElement timeLine = driver.findElement(By.xpath(email.SignInTextBox));
//
//
//
//
//
////    WebElement timeLine = driver.findElement(By.xpath(page.TimelineLink));
//
////    System.out.println("Text::::::::: " + driver.findElement(By.xpath(page.JavaText)).getText());
////    timeLine.click();
//
//
//    //waitSec(5);
//
//}


    public static void waitSec(long lenght){
        try {
            Thread.sleep(lenght*1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
