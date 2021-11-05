package ru.klimov.bank;

import com.codeborne.selenide.Condition;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import pageObjects.TitleBankObject;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.*;

public class BankTest extends BaseTest {


    @Test
    void openTitlePageBank() {
        TitleBankObject t = page(TitleBankObject.class);

        open(config.hostname());
        $(t.getTitle()).should(visible).shouldBe(exactTextCaseSensitive("XYZ Bank"));
        $(t.getManager()).should(visible).shouldBe(exactTextCaseSensitive("Bank Manager Login"));
        $(t.getCustomer()).should(visible).shouldBe(exactTextCaseSensitive("Customer Login"));
        $(t.getHome()).should(visible).shouldBe(exactTextCaseSensitive("Home"));
    }
}
