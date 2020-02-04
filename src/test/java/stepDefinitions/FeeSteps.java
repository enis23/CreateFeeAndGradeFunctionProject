package stepDefinitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import pages.AbstractClass;
import pages.FeesPage;
import pages.leftNav;
import pages.signInPage;
import utilities.Driver;

import java.util.concurrent.TimeUnit;

public class FeeSteps extends AbstractClass {

    leftNav leftNav = new leftNav();
    signInPage sip = new signInPage();
    FeesPage feesPage = new FeesPage();


    @Given("^Go to mersys website$")
    public void go_to_mersys_website() throws Throwable {

        driver = Driver.getDriver();
        driver.manage().window().fullscreen();
        driver.get("https://test-basqar.mersys.io");
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }

    @Given("^Type the username and password and click on login button$")
    public void type_the_username_and_password_and_click_on_login_button() throws Throwable {

        sip.typeInInputUsername();
        sip.typeInInputPassword();
        sip.clickButtonSignIn();

    }

    @Given("^click on Setup$")
    public void click_on_Setup() {
        ln.clickOnSetup();
    }

    @Given("^click on Parameters$")
    public void click_on_Parameters() throws Throwable {
        ln.clickOnParameters();
    }

    @And("^click on Fees$")
    public void clickOnFees() {
    }

    @Given("^Click on plus icon$")
    public void click_on_plus_icon() throws Throwable {
        ap.clickPlusButton();
    }
}
