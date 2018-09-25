package steps;

import PageObject.MainPage;
import PageObject.Page;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.java.it.Ma;
import net.bytebuddy.description.type.TypeList;
import net.bytebuddy.implementation.bind.annotation.Morph;
import net.bytebuddy.pool.TypePool;
import org.junit.Assert;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

public class MainPageSteps {

    @Given("^I open i.ua site$")
    public void iOpenIUaSite1() throws Throwable {
        Page.driver.get("http://i.ua");
        Thread.sleep(1000);

    }

    @When("^Enter login into login page$")
    public void enterLoginIntoLoginPage() throws Throwable {
        new MainPage().enterLoginField();
        Thread.sleep(1200);
      //  return enterLoginIntoLoginPage();

    }

    @And("^Enter password into login page$")
    public void enterPasswordIntoLoginPage() throws Throwable {
        new MainPage().enterPasswordField();
        Thread.sleep(1000);
      //  return  enterPasswordIntoLoginPage();
    }

    @Then("^Login page is opened$")
    public void loginPageIsOpened() throws Throwable {
        new MainPage().clickLoginButton();
    }

    @When("^Enter uncorrect login into login page$")
    public void enterUncorrectLoginIntoLoginPage() throws Throwable
    {
        new MainPage().enterUncorrectLogin();
        Thread.sleep(1000);
   //     return  enterUncorrectLoginIntoLoginPage();

    }

    @And("^Enter uncorret password into login page$")
    public void enterUncorretPasswordIntoLoginPage() throws Throwable  {
        new MainPage().enterUncorrectPassword();
        Thread.sleep(1100);
  //      return  enterUncorretPasswordIntoLoginPage();
    }

    @Then("^I see error page$")
    public void iSeeErrorPage() throws Throwable {
        new MainPage().UncorrectPassword();
        Thread.sleep(1200);
    }

    @Then("^I close browser window$")
    public void iCloseBrowserWindow() throws Throwable {
        Thread.sleep(800);
        Page.driver.quit();



    }


    @When("^Send GET request to whether ua$")
    public void sendGETRequestToWhetherUa() throws Throwable {
        URL url = new URL("https://weather.i.ua/graph/?city_name=Dnepr");
        HttpURLConnection connection = (HttpURLConnection)url.openConnection();
        connection.setRequestMethod("GET");
        int code = connection.getResponseCode();
        Assert.assertEquals(200, code);
    }

    @When("^I log in into iua$")
    public void iLogInIntoIua() throws Throwable {
        URL url = new URL("https://passport.i.ua/login/");
        HttpURLConnection connection = (HttpURLConnection)url.openConnection();
        connection.setRequestMethod("POST");
        Map<String, String> parameters = new HashMap<String, String>();
        parameters.put("login", "testkutiuk");
        parameters.put("pass", "test1234");
        int code = connection.getResponseCode();
        Assert.assertEquals(200, code);


    }

    @When("^i log in into iua with uncorrect password$")
    public void iLogInIntoIuaWithUncorrectPassword() throws Throwable {
        URL url = new URL("https://passport.i.ua/login/");
        HttpURLConnection connection = (HttpURLConnection)url.openConnection();
        connection.setRequestMethod("POST");
        Map<String, String> parameters = new HashMap<String, String>();
        parameters.put("login", "testkutuk");
        parameters.put("pass", "test124");
        int code = connection.getResponseCode();
        Assert.assertEquals(302, code);
    }

    @And("^Click on log in button$")
    public void clickOnLogInButton() throws Throwable {
            new MainPage().clickLoginButton();
        Thread.sleep(1100);
    }

    @Then("^I check entered login$")
    public void iCheckEnteredLogin() throws Throwable {
        new MainPage().checkLoginField();




    }

    @Then("^I check entered password$")
    public void iCheckEnteredPassword() throws Throwable {
       new MainPage().checkPasswordField();

    }

    @And("^Check that I see main page button.$")
    public void checkThatISeeMainPageButton() throws Throwable {
        new MainPage().checkLogIn();
        Thread.sleep(1100);

    }

    @When("^I make login$")
    public void iMakeLogin() throws Throwable {
        new MainPage().enterLoginField();
        new MainPage().enterPasswordField();
        new MainPage().clickLoginButton();
        Thread.sleep(1100);
    }

    @And("^I click on button creat email$")
    public void iClickOnButtonCreatEmail() throws Throwable {
        new MainPage().clickCreatEmailButton();
        Thread.sleep(1100);
    }

    @And("^Enter adress of email$")
    public void enterAdressOfEmail() throws Throwable {
        new MainPage().enterAdressOfEmail("testkutiuk@i.ua");




    }

    @And("^Enter theme of email$")
    public void enterThemeOfEmail() throws Throwable {
        new MainPage().enterThemeOfEmail("test1");
    }

    @And("^Enter text of email$")
    public void enterTextOfEmail() throws Throwable {
        new MainPage().enterTextOfEmail("Test text of email ");
    }

    @And("^Click send mail button$")
    public void clickSendMailButton() throws Throwable {
        new MainPage().clickSendEmailButton();
        MainPage.driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS );


    }

    @Then("^I see text of success send$")
    public void iSeeTextOfSuccessSend() {
        new MainPage().checkTextOfSuccessSent();
        MainPage.driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS );

    }

    @And("^Click on inbox button$")
    public void clickOnInboxButton() throws Throwable {
        new MainPage().clickInboxButton();
        Thread.sleep(20000);

    }

    @And("^Check name of sender$")
    public void checkNameOfSender() throws Throwable {

    }

    @And("^Check theme of email$")
    public void checkThemeOfEmail() throws Throwable {
        new MainPage().checkThemeOfSentEmail();
        Thread.sleep(1000);

    }

    @And("^Open letter$")
    public void openLetter() throws Throwable {
        new MainPage().OpenLetter();

    }

    @And("^Check text and name of Sender$")
    public void checkTextAndNameOfSender() throws Throwable {

        new MainPage().CheckNameOfSender();
       // new MainPage().CheckTextOfEmail();

    }

    @And("^Make logout$")
    public void makeLogout() throws Throwable {
        
        new MainPage().clickLogOutButton();
        Thread.sleep(1200);
    }

    @Then("^I see login page$")
    public void iSeeLoginPage() throws Throwable {
        new MainPage().SearchButtonIsDisplayed();
        Thread.sleep(1200);
        throw new PendingException();
    }

    @And("^I go to main page$")
    public void iGoToMainPage() throws Throwable {
        new MainPage().clickMainPageButton();
        Thread.sleep(1200);
    }

//    @Then("^Response status should be (\\d+)$")
//    public void responseStatusShouldBe(int arg0) throws Throwable {
//
//    }
}