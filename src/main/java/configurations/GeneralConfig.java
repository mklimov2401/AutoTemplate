package configurations;

import org.aeonbits.owner.Config;

/**
 * Интерфейс содержащий главные настройки фраймворка.
 */
@Config.Sources("file:src/main/resources/properties/GeneralConfig.properties")
public interface GeneralConfig extends Config {
    @DefaultValue("prod")
    String env();

    @Key("prod.hostname")
    String hostname();

    @DefaultValue("chrome")
    String browser();

    String pathChrome();
}
