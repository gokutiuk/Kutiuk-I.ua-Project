package steps;

import PageObject.Page;
import cucumber.api.java.en.And;

public class BackSteps {
    @And("^I login to platform$")
    public void iLoginToPlatform() throws Throwable {
        Page.getWebDriver();

    }
}
