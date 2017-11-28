package org.tungstenNetwork.test.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.tungstenNetwork.test.utils.Hooks;

/**
 * Created by Chirag Patel on 28/11/17.
 */

public class HomePage extends Hooks {

    public HomePage(){
        PageFactory.initElements(driver,this);
    }

    @FindBy(tagName = "body")
    public WebElement text;

    public WebElement aboutUs;

    public void clickAboutUsLink(String link){
        aboutUs.click();
    }

    public boolean isUserOnHomepage(){
        return text.getText().contains("Amazon.co.uk");
    }
    public boolean isUserOnAboutUsPage(){
        return text.getText().contains("Deals of the Day");
    }
}
