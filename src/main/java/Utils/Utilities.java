package Utils;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.*;
import step_definitions.Hooks;


import java.io.*;
import java.util.ArrayList;
import java.util.List;
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

    public static ArrayList<String> excelReader(String fullPath, String rowName){


        ArrayList<String> list = new ArrayList<String>();

        try {

            FileInputStream stream = new FileInputStream(fullPath);
            XSSFWorkbook workbook = new XSSFWorkbook(stream);
            XSSFSheet sheet = workbook.getSheet("Sheet1");



            Row row=null;

            for(int i=0; i<sheet.getLastRowNum(); i++){
                row=sheet.getRow(i);
                if(row.getCell(0).toString().equalsIgnoreCase(rowName)){
                    for(int k=0; k<row.getLastCellNum(); k++){
                        list.add(row.getCell(k).toString());
                    }
                }
            }


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        catch (IOException e){
            e.printStackTrace();
        }



           return list;
    }

    public static void main(String[] args) {
        System.out.println(excelReader("/Users/Tsolmon/Desktop/GetData.xlsx","Talgat"));
    }


    public static void getData(){
        WebDriver driver=BrowserUtils.getDriver();

        ArrayList<String> lastname= new ArrayList<>();
        lastname.add("BOUTHILLER");
        lastname.add("SIMS");
        lastname.add("NICK");
        lastname.add("RUDNISKY");
        lastname.add("RICCIO");
        lastname.add("CROSS");
        ArrayList<String> ssn= new ArrayList<>();
        ssn.add("666017001");
        ssn.add("666189411");
        ssn.add("666193191");
        ssn.add("666566504");
        ssn.add("666345680");
        ssn.add("666967842");
     for(int i=0; i<lastname.size(); i++){
         driver.findElement(By.xpath("xpath of your lastName")).sendKeys(lastname.get(i));
         driver.findElement(By.xpath("xpath of your SSN")).sendKeys(ssn.get(i));
         driver.findElement(By.xpath("delete button xpath")).click();
     }


    }



}
