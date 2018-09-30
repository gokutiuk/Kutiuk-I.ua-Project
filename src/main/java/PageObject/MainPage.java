package PageObject;


import cucumber.api.java.cs.A;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

public class MainPage extends Page {

    @FindBy(name = "login")
    private WebElement loginField;
    @FindBy( name="pass")
    private WebElement passwordField;
    @FindBy ( xpath ="/html/body/div[3]/div[3]/div[3]/div[2]/div[1]/div[3]/form/p/input")
    private WebElement loginButton;
    @FindBy (xpath = "/html/body/div[1]/div[5]/div[1]/div[1]/p/a")
    private WebElement creatEmailButton;
    @FindBy (xpath = "//*[@id=\"to\"]")
    private WebElement addressField;
    @FindBy (xpath = "/html/body/div[4]/div[5]/div[1]/div[1]/div[1]/div/form/div[5]/div[2]/span/input[1]")
    private WebElement themeField;
    @FindBy (xpath = "//*[@id=\"text\"]")
    private WebElement textField;
    @FindBy (xpath = "/html/body/div[4]/div[5]/div[1]/div[1]/p[3]/input[1]")
    private WebElement sendButton;
    @FindBy (xpath = "//*[@id=\"header_overall\"]/div[1]/ul[1]/li[1]/a")
    private WebElement MainPageButton;
    @FindBy (xpath = "/html/body/div[2]/div[3]/ul[1]/li[8]/a")
    private WebElement LogOutButton;
    @FindBy (xpath = "//*[@id=\"lform_errCtrl\"]")
    private WebElement UncorrectPassword;
    @FindBy (xpath = "//*[@id=\"header_overall\"]/div[1]/ul[3]/li[1]/a/span")
    private WebElement Username;

    @FindBy (xpath = "/html/body/div[1]/div[5]/div[2]/div/div/div[1]/div/div[5]")
    private WebElement SuccessSent;
    @FindBy (xpath = "/html/body/div[1]/div[5]/div[2]/div[1]/div[2]/div[3]/ul/li[1]/a" )
    private WebElement InboxButton;
    @FindBy (xpath = "//*[@id=\"mesgList\"]/form/div[1]/a/span[3]/span")
    private WebElement ThemeOfEmail;
    @FindBy (xpath = "//*[@id=\"mesgList\"]/form/div/a/span[2]")
    private WebElement OpenLetter;
    @FindBy (xpath = "/html/body/div[1]/div[5]/div[2]/div[2]/ul/li/div[1]/div/div[2]/div[1]/div[2]/a")
    private WebElement NameOfSender;
    @FindBy (xpath = "/html/body/div[1]/div[5]/div[2]/div[2]/ul/li/div[1]/div/div[3]/pre")
    private WebElement TextOfEmail;
    @FindBy (xpath = "/html/body/div[1]/div[4]/ul/li[1]/span")
    private WebElement MyEmail;
    @FindBy (xpath = "/html/body/div[3]/div[3]/div[3]/div[1]/div[2]/div/div[2]/form/input")
    private WebElement SearchButton;
    @FindBy (xpath = " //*[@id=\"header_overall\"]/div[1]/ul[3]/li[3]/span")
    private WebElement SettingButton;






    public MainPage(){
        PageFactory.initElements(Page.driver,this);
    }

    public   String enterLoginField(){
       String login="testkutiuk";
        loginField.sendKeys(login);
        return login;
    }
    public String enterUncorrectLogin()
    {
        String login="testkutiuks";
        loginField.sendKeys(login);
        return login;
    }
    public String enterUncorrectPassword()
    {
        String password="test123124";
        passwordField.sendKeys(password);
        return password;
    }

    public String enterPasswordField(){
       String password="test1234";
        passwordField.sendKeys(password);
        return password;
    }
    public void clickLoginButton () { loginButton.click(); }
    public String checkLoginField(){loginField.getText();
      //  Assert.assertEquals(loginField.getText(),enterLoginField());
        return loginField.getText();
    }
    public String checkPasswordField(){passwordField.getText();
      //  Assert.assertEquals(passwordField.getText(),enterPasswordField());
        return passwordField.getText();
    }
    public void clickCreatEmailButton ()
    {
        creatEmailButton.click();
    }
    public void enterAdressOfEmail(String adress){ addressField.sendKeys(adress);
    }
    public void enterThemeOfEmail(String theme){
        themeField.sendKeys(theme);
    }


    public String enterTextOfEmail(String text){



            String TextOfMail="Text of mail";
        textField.sendKeys(TextOfMail);
            return TextOfMail;
    }


    public void clickSendEmailButton ()
    {
        sendButton.click();
    }
    public void clickMainPageButton()
    {
        MainPageButton.click();
    }
    public void clickLogOutButton()
    { //  SettingButton.click();

        LogOutButton.click();
    }
    public void UncorrectPassword(){UncorrectPassword.getText();
    Assert.assertEquals("Невірний логін або пароль",UncorrectPassword.getText());}

    public void checkLogIn(){MainPageButton.isDisplayed();}
    public void checkTextOfSuccessSent() {SuccessSent.getText();
       Assert.assertEquals("Лист успішно відправлено адресатам",SuccessSent.getText());

    }
    public void clickInboxButton(){InboxButton.click();}
    public void checkThemeOfSentEmail(){ThemeOfEmail.getText();
    Assert.assertEquals("test1",ThemeOfEmail.getText());
    }
    public void OpenLetter(){OpenLetter.click();}
    public void CheckNameOfSender(){NameOfSender.getText();
    Assert.assertEquals(MyEmail.getText(),NameOfSender.getText());
    }
    public void CheckTextOfEmail(){TextOfEmail.getText();
    Assert.assertEquals(TextOfEmail,TextOfEmail.getText());
    }
    public void SearchButtonIsDisplayed () {
        SearchButton.isEnabled();
        //Assert.assertEquals("Знайти", SearchButton.getText());
    }






}