package Pages;

public class Page {

    /*URL*/

   public String URL="https://www.techleadacademy.io";

    /* top list tabs xpath syntax: //tag[@attribute='value']   best attribute selections are: class, id  */

    public String links="//p[text()='%s']";
    public String HomeLink="//p[@id='comp-jwgxdklb0label']";
    public String TimelineLink="//p[@id='comp-jwgxdklb1label']";
    public String AboutUsLink="//p[@id='comp-jwgxdklb2label']";
    public String CurriculumLink="//p[@id='comp-jwgxdklb3label']";
    public String CertificationsLink="//p[@id='comp-jwgxdklb4label']";
    public String EventListLink="//p[@id='comp-jwgxdklb5label']";
    public String ContactLink="//p[@id='comp-jwgxdklb6label']";
    public String MoreLink="//p[@id='comp-jwgxdklb__more__label']";
    public String ApplyNowLink="//p[@id='comp-jwgxdklb7label']";
    public String LogoLink="//span[@style='text-decoration:none;']";
    public String PrevButtonLeftLink="//div[@id='comp-jvo3si292prevButton'] ";
    public String NextButtonRightLink="//div[@id='comp-jvo3si292nextButton'] ";
    public String TechLeadAcademyLogo="//div[@id='comp-jvo3si297']";
    public String textUnderLogo="//div[@id='comp-jvo3si298']";
    public String InfoSessionLink="//span[@id='comp-jvo3si299label']";
    public String ApplyLink="//span[@id='comp-jvykfmnflabel']";
    public String CirculumLogo="//div[@id='comp-jw8l3r5l2']";
    public String textUnderCirculum="//div[@id='comp-jw8l3r5l3' and @class='txtNew'] ";
    public String TIMELINELink="//a[@id='comp-jwpo38eclink']";
    public String JAVALInk="//div[@id='comp-jw8l3r5m2']";
    public String JavaText="//div[@id='comp-jw8l3r5m3']";
    public String SELENIUMLink="//div[@id='comp-jw8l3r5m6']";
    public String SELENIUMText="//div[@id='comp-jw8l3r5m7']";
    public String SQLLink="//div[@id='comp-jw8l3r5m10']";
    public String SQLText="//div[@id='comp-jw8l3r5m11']";
    public String TechnicalCommunicationSkillLink="//div[@id='comp-jw8l3r5m15']";
    public String TechnicalCommunicationSkillText="//div[@id='comp-jw8l3r5m16']";
    public String APITestingLink="//div[@id='comp-jw8l3r5m19']";
    public String APITestingText="//div[@id='comp-jw8l3r5m20']";
    public String LINUXUNIXLink="//div[@id='comp-jw8l3r5n']";
    public String LINUXUNIXText="//div[@id='comp-jw8l3r5n1']";
    public String CertificationLink="//div[@id='comp-jw7tg7f12']";
    public String CertificationText="//div[@id='comp-jw7tg7f13']";
    public String JAVASE8Link="//div[@id='comp-jw7tg7f17']";
    public String JAVASE8Text="//div[@id='comp-jw7tx1bc']";
    public String AWSLink="//div[@id='comp-jw7tg7f111']";
    public String AWSText="//div[@id='comp-jw7tx1bd']";
    public String ISTQBLink="//div[@id='comp-jw7tg7f115']";
    public String ISTQBText="//div[@id='comp-jw7tx1bd1']";
    public String RegisterButtonOnLeftLink="(//div[@class='bkncJ']//button)[1]";
    public String RegisterButtonOnRightLink="(//div[@class='_1U_1T _19IDl iyAY1']//div[@class='bkncJ']//button[contains(text(),'Register Now')])[2]";
    //(//div[@class='bkncJ']//button[contains(text(),'Register Now')])[2]

            //(//div[@class='_1U_1T _19IDl iyAY1']//button)[1]
    public String textBoxes="//input[@placeholder='%s']";
    public String textArea="//textarea[@placeholder='%s']";
    public String firstNameTextBox="(//div[@id='comp-jvo3sjvgform-gridWrapper']//input)[1]";
    public String phoneTextBox="(//div[@id='comp-jvo3sjvgform-gridWrapper']//input)[2]";
    public String lastNameTextBox="(//div[@id='comp-jvo3sjvgform-gridWrapper']//input)[3]";
    public String emailTextBox="(//div[@id='comp-jvo3sjvgform-gridWrapper']//input)[4]";
    public String subjectTextBox="(//div[@id='comp-jvo3sjvgform-gridWrapper']//input)[5]";
    public String typeYourMessageTextBox="//textarea[@class='has-custom-focus style-jvo3sncd1textarea']";
    public String submitButtonLink="//button[@id='comp-jvo3sne0link']";



    //========================================================
    public String FlightButton="//a[@id='primary-header-flight']";
    public String inputBoxes="//input[@placeholder='%s']";
    public String FlyingfromTextBox="(//input[@placeholder='City or airport'])[1]";
    public String AutoDropDown="//div[@class='multiLineDisplay']";
    public String FlyingtoTextBox="(//input[@placeholder='City or airport'])[2]";
     public String DepartingTextBox="//div[@id='flight-departing-wrapper-flp']//input";
     public String AutoDropDownCal="//div[@class='datepicker-dropdown exp28590-0']";
     public String prevButton="//button[@class='datepicker-paging datepicker-prev btn-paging btn-secondary prev']";
     public String nextButton="//button[@class='datepicker-paging datepicker-next btn-paging btn-secondary next']";
     public String yearandMonth="//table[@class='datepicker-cal-weeks']";
    public String ReturningTextBox="//div[@id='flight-returning-wrapper-flp']//input";
     public String dayDepart="//*[@id=\"package-departing-wrapper-hp-package\"]/div/div/div[2]/table/tbody/tr[2]/td[2]/button";
      public String day="//button[@data-day='%s']";
      public String searchButton="//*[@id=\"gcw-flights-form-hp-flight\"]/div[9]/label/button";
////*[@id="package-returning-wrapper-hp-package"]/div/div/div[2]/table/tbody/tr[2]/td[5]/button

}
