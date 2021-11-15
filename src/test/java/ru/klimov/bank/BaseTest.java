package ru.klimov.bank;

import com.codeborne.selenide.logevents.SelenideLogger;
import configurations.GeneralConfig;
import io.qameta.allure.selenide.AllureSelenide;
import org.aeonbits.owner.ConfigFactory;
import org.apache.log4j.Logger;
import org.junit.jupiter.api.BeforeEach;

public class BaseTest {

    protected static final Logger logger = Logger.getLogger(BaseTest.class);

    static GeneralConfig config = ConfigFactory.create(GeneralConfig.class);

    @BeforeEach
    void setUp() {
        SelenideLogger.addListener("AllureSelenide", new AllureSelenide().screenshots(true).savePageSource(true));
    }
}
