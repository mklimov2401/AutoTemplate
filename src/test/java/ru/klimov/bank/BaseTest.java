package ru.klimov.bank;

import configurations.GeneralConfig;
import org.aeonbits.owner.ConfigFactory;
import org.apache.log4j.Logger;

public class BaseTest {

    protected static final Logger logger = Logger.getLogger(BaseTest.class);

    static GeneralConfig config = ConfigFactory.create(GeneralConfig.class);
}
