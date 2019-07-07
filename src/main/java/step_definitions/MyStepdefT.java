package step_definitions;

import Helper.Contacter;
import Helper.Employee;
import Helper.Student;
import Pages.Page;
import Utils.BrowserUtils;
import Utils.Utilities;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.Map;

import java.util.List;

public class MyStepdefT extends Utilities {
    WebDriver driver= BrowserUtils.getDriver();
    Page page = new Page();

    @Given("I navigate to the URL {string}")
    public void i_navigate_to_the_URL(String string) {

        driver.get(string);
//        String expectedTitle = "Coding Boot-camp | Tech Lead Academy";
//        String actualTitle = driver.getTitle();
//        Assert.assertEquals(expectedTitle, actualTitle);
        waitSec(2);

    }

    @Then("I should see the {string} link")
    public void i_should_see_the_link(String linkName) {
        waitSec(3);
        String xpath = String.format(page.links, linkName);
        System.out.println("Xpath:::"+xpath);
         Assert.assertTrue(driver.findElement(By.xpath(xpath)).isDisplayed());
    }

    @Then("I validate all the following links:")
    public void iValidateAllTheFollowingLinks(List<String> linkList) {
        for (String each : linkList) {
            String xpath = String.format(page.links, each);
            Assert.assertTrue(driver.findElement(By.xpath(xpath)).isDisplayed());
        }
        driver.quit();
    }


    @And("I should able to enter {string} to {string} textbox")
    public void i_Should_Able_To_Enter_To_Textbox(String value, String textboxName) {
        String xpath = String.format(page.textBoxes, textboxName);
        if (textboxName.contains("Type your")) {
            xpath = String.format(page.textArea, textboxName);
        }
        driver.findElement(By.xpath(xpath)).sendKeys(value);



    }


    @And("I should able to see {string} button")
    public void iShouldAbleToSeeButton(String button) {
        String xpath = String.format(page.submitButtonLink, button);
        Assert.assertTrue(driver.findElement(By.xpath(xpath)).isDisplayed());
    }



    @Then("I should able to see information on the textBoxes:")
    public void iShouldAbleToSeeInformationOnTheTextBoxes(Map<String, String> info) {
        String xpath="";
        for(String each: info.keySet()){
            xpath=String.format(page.textBoxes,each);
            if (each.contains("Type your")) {
                xpath = String.format(page.textArea,each);
            }

            driver.findElement(By.xpath(xpath)).sendKeys(info.get(each));
        }

    }



    @Given("I open a page with URL ([^\"]*)")
    public void iOpenAPageWithURLUrl(String url) {
        driver.get(url);
    }

    @And("I choose {string} option")
    public void iChooseOption(String button) {
       // System.out.println("===="+button);
        //driver.findElement(By.xpath(page.FlightButton)).click();
       String xpath=String.format(page.FlightButton,button);
        driver.findElement(By.xpath(xpath)).click();

    }

    @And("I choose {string} {string}")
    public void iChoose(String xpath, String value) {
        if(xpath.equals("Flying from")) {
            driver.findElement(By.xpath(page.FlyingfromTextBox)).sendKeys(value);
            waitSec(1);
            highlight(driver,page.AutoDropDown);
            driver.findElement(By.xpath(page.AutoDropDown)).click();
        }
        else if(xpath.equals("Flying to")){
            driver.findElement(By.xpath(page.FlyingtoTextBox)).sendKeys(value);
            waitSec(2);
            highlight(driver,page.AutoDropDown);
            driver.findElement(By.xpath(page.AutoDropDown)).click();
           screenShot();
        }
    }


    @Then("I login as <user> with username <username> and password <password>")
    public void iLoginAsUserWithUsernameUsernameAndPasswordPassword() {

    }

    @Then("I should see the homepage")
    public void iShouldSeeTheHomepage() {

    }

//   And I choose "Departing" date of "02/03/2020"
//   And I choose "Returning" date of "03/04/2020"
    @And("I choose {string} date of {string}")
    public void iChooseDateOf(String departOrReturn, String date) {
        String[] months={"Jan","Feb","Mar","Apr","May","Jun","Jul","Aug","Sep","Oct","Nov","Dec"};
        String[] newDate=date.split("/"); //06/26/2019
        int monthInt=Integer.parseInt(newDate[0]); //6
        String month=months[monthInt-1];
        String monthYear=month+" "+newDate[2];
        String day=newDate[1];
        if(day.contains("0")){
            day=day.substring(1);
        }
    if(departOrReturn.equals("Departing")){
        driver.findElement(By.xpath(page.DepartingTextBox)).click();
        pickTheDate(driver,monthYear,day);
    }
    else if(departOrReturn.equals("Returning")){
        driver.findElement(By.xpath(page.ReturningTextBox)).click();
        pickTheDate(driver,monthYear,day);
       screenShot();
    }
    }
    public void pickTheDate(WebDriver driver,String YearMonth, String day){
        String actual = driver.findElement(By.xpath("//caption[@class='datepicker-cal-month-header']")).getText();
        while(!actual.equals(YearMonth)){

            driver.findElement(By.xpath(page.nextButton)).click();
            actual=driver.findElement(By.xpath("//caption[@class='datepicker-cal-month-header']")).getText();

        }
        String xpath=String.format(page.day,day);
        driver.findElement(By.xpath(xpath)).click();
    }
    @When("I click {string} button")
    public void iClickButton(String button) {
        highlight(driver,"//*[@id=\"gcw-flights-form-flp\"]/div[9]/label/button");
        driver.findElement(By.xpath("//*[@id=\"gcw-flights-form-flp\"]/div[9]/label/button")).click();
    }

    @Then("I should see the flight options")
    public void iShouldSeeTheFlightOptions() {
        String actualTitle=driver.getTitle();
        String expectedTitle="WAS to MKC Flights | Orbitz";
        Assert.assertEquals(expectedTitle,actualTitle);
        waitSec(10);
    }

    @Given("I validate all the student information is correct")
    public void iValidateAllTheStudentInformationIsCorrect(List<Student> studentList) {
        for(Student each: studentList){
            System.out.println(each.getAge());
        }
    }

    @Then("I print all the texts in navigation table")
    public void iPrintAllTheTextsInNavigationTable() {
        Boolean b=driver.getPageSource().contains("Tsolmon");
        System.out.println("Page contains:::"+b);
        //        List<WebElement> we=driver.findElements(By.xpath("//div[@class='mc1inlineContent']//ul[@aria-label='Site navigation']//p"));
//        for(WebElement each: we){
//            System.out.println("each texts::::"+each.getAttribute("id"));
//        }
    }

    @And("I send emails using folowing values:")
    public void iSendEmailsUsingFolowingValues(List<Contacter> list) {
        for(Contacter each: list) {
            List<WebElement> weList=driver.findElements(By.xpath("//div[@id='comp-jvo3sjvgform-gridContainer']//input"));
            weList.get(0).sendKeys(each.getFirstName());
            weList.get(1).sendKeys(each.getPhone());
            weList.get(2).sendKeys(each.getLastName());
            weList.get(3).sendKeys(each.getEmail());
            weList.get(4).sendKeys(each.getSubject());
            driver.findElement(By.xpath("//textarea[@placeholder='Type your message here...']")).sendKeys(each.getMessage());
            driver.navigate().refresh();
        waitSec(3);
        }
    }

    @Given("I validate all the employee information is correct")
    public void iValidateAllTheEmployeeInformationIsCorrect(List<Employee> EmployeeList) {
        for (Employee each: EmployeeList)
        System.out.println(each.toString());
    }


}
