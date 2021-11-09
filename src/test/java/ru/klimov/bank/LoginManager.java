package ru.klimov.bank;

import org.junit.jupiter.api.Test;
import pageObjects.ManagerPageObject;
import pageObjects.TitleBankPageObject;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;

public class LoginManager extends BaseTest {

    @Test
    void addCustomer() {
        TitleBankPageObject t = page(TitleBankPageObject.class);
        ManagerPageObject m = page(ManagerPageObject.class);

        open(config.hostname());
        $(t.getManager()).click();
        $(m.getAddCustomerMenu()).click();
        $(m.getFirstName()).val("Michail");
        $(m.getLastName()).val("Somers");
        $(m.getPostCode()).val("E12347");
        $(m.getAddCustomerButton()).click();
        $(m.getCustomersMenu()).click();

        $(m.getSearchCustomer()).shouldBe(visible).val("Michail").pressEnter();
        $$(m.getCustomers()).get($$(m.getCustomers()).size()-1).should(text("Michail"));
    }
}
