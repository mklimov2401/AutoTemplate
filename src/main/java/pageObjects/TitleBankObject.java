package pageObjects;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;

public class TitleBankObject {

    @FindBy(css = ".mainHeading")
    private SelenideElement title;

    @FindBy(xpath = ".//button[@ng-click='manager()']")
    private SelenideElement manager;

    @FindBy(xpath = ".//button[@ng-click='customer()']")
    private SelenideElement customer;

    @FindBy(xpath = ".//button[@ng-click='home()']")
    private SelenideElement home;

    public SelenideElement getTitle() {
        return title;
    }

    public SelenideElement getManager() {
        return manager;
    }

    public SelenideElement getCustomer() {
        return customer;
    }

    public SelenideElement getHome() {
        return home;
    }
}
