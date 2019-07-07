package step_definitions;

import Utils.BrowserUtils;
import cucumber.api.Scenario;
import cucumber.api.java.Before;
import cucumber.api.java.After;


public class Hooks {
   public static Scenario scenario;


    @Before
    public void setup( Scenario scenario){
        this.scenario=scenario;
        System.out.println("Setting up");
    }

     @After
    public void teardown(Scenario s){
//        if(s.isFailed()){
//            Utilities util=new Utilities();
//            util.screenShot();
//        }
        System.out.println("Tearing down");
         BrowserUtils.getDriver().quit();

    }



}
