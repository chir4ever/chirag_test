package org.tungstenNetwork.test.pages;

import org.tungstenNetwork.test.utils.Hooks;

/**
 * Created by Chirag Patel on 28/11/17.
 */

public class UserHomePage extends Hooks {
    public boolean isUserLoginsuccessfully (String Result) {

        return driver.getPageSource().contains(Result);
    }

}
