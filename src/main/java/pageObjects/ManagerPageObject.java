package pageObjects;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;

public class ManagerPageObject {


    @FindBy(xpath = ".//button[@ng-class='btnClass1']")
    private SelenideElement addCustomerMenu;

    @FindBy(xpath = ".//button[@ng-class='btnClass2']")
    private SelenideElement openAccountMenu;

    @FindBy(xpath = ".//button[@ng-class='btnClass3']")
    private SelenideElement customersMenu;

    @FindBy(xpath = ".//input[@ng-model='fName']")
    private SelenideElement firstName;

    @FindBy(xpath = ".//input[@ng-model='lName']")
    private SelenideElement lastName;

    @FindBy(xpath = ".//input[@ng-model='postCd']")
    private SelenideElement postCode;

    @FindBy(xpath = ".//button[@type='submit']")
    private SelenideElement addCustomerButton;

    @FindBy(xpath = ".//tr[@class='ng-scope']")
    private ElementsCollection customers;

    @FindBy(xpath = ".//td[@class='ng-binding'][1]")
    private SelenideElement fName;

    @FindBy(xpath = ".//td[@class='ng-binding'][2]")
    private SelenideElement lName;

    @FindBy(xpath = ".//td[@class='ng-binding'][3]")
    private SelenideElement pCode;

    @FindBy(xpath = "(.//div[@class='ng-scope'])[3]")
    private SelenideElement scope3;

    @FindBy(xpath = ".//input")
    private SelenideElement searchCustomer;

    public SelenideElement getSearchCustomer() {
        return searchCustomer;
    }

    public SelenideElement getScope3() {
        return scope3;
    }

    public SelenideElement getfName() {
        return fName;
    }

    public SelenideElement getlName() {
        return lName;
    }

    public SelenideElement getpCode() {
        return pCode;
    }

    public SelenideElement getCustomersMenu() {
        return customersMenu;
    }

    public ElementsCollection getCustomers() {
        return customers;
    }

    public SelenideElement getFirstName() {
        return firstName;
    }

    public SelenideElement getLastName() {
        return lastName;
    }

    public SelenideElement getPostCode() {
        return postCode;
    }

    public SelenideElement getAddCustomerButton() {
        return addCustomerButton;
    }

    public SelenideElement getAddCustomerMenu() {
        return addCustomerMenu;
    }

    public SelenideElement getOpenAccountMenu() {
        return openAccountMenu;
    }

}

