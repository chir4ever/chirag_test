package org.tungstenNetwork.test.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.tungstenNetwork.test.utils.Hooks;

/**
 * Created by Chirag Patel on 28/11/17.
 */

public class LogIn extends Hooks {

    public LogIn() {
        PageFactory.initElements(driver, this);
    }


    @FindBy(xpath = "//span[text()='Hello. Sign in']")
    private WebElement loginButton;

    @FindBy (id = "ap_email")
    private WebElement setuserName;

    @FindBy (id = "ap_password")
    private WebElement setuserPassW;

    @FindBy (id = "signInSubmit")
    private WebElement accountSignIn;

    @FindBy (id="continue")
    private WebElement clickContinue;

    public void clickOnLogInButton(String link){
        loginButton.click();
    }
    public void clickOnContinueButton() {
        clickContinue.click();
    }

    public void typeUserName(String userName){
        setuserName.sendKeys(userName);
    }
    public void typeUserPassword (String userPassword){
        setuserPassW.sendKeys(userPassword);
    }
    public void clickToSignInAccount(){
        accountSignIn.click();
    }
}
