package ru.klimov;

import org.junit.jupiter.api.Test;
import pageObjects.TitleBankPageObject;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.*;

public class TitleBankTest extends BaseTest {


    @Test
    void openTitlePageBank() {
        TitleBankPageObject t = page(TitleBankPageObject.class);

        open(config.hostname());
        $(t.getTitle()).should(visible).shouldBe(exactTextCaseSensitive("XYZ Bank"));
        $(t.getManager()).should(visible).shouldBe(exactTextCaseSensitive("Bank Manager Login"));
        $(t.getCustomer()).should(visible).shouldBe(exactTextCaseSensitive("Customer Login"));
        $(t.getHome()).should(visible).shouldBe(exactTextCaseSensitive("Home"));
    }
}
