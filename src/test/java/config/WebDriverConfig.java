package config;

import org.aeonbits.owner.Config;

@Config.LoadPolicy(Config.LoadType.MERGE)
@Config.Sources({
        "classpath:${env}.properties",
        "classpath:local.properties",
        "classpath:remote.properties"
})
public interface WebDriverConfig extends Config {

    @Key("browser")
        //@DefaultValue("chrome")
    String browser();

    @Key("browserVersion")
        //@DefaultValue("128.0")
    String browserVersion();

    @Key("browserSize")
        //@DefaultValue("1920x1080")
    String browserSize();

    @Key("baseUrl")
        // @DefaultValue("https://korsarcase.ru")
    String baseUrl();

    @Key("remote")
        // @DefaultValue("https://user1:1234@selenoid.autotests.cloud/wd/hub")
    String remote();

    @Key("pageLoadStrategy")
    String pageLoadStrategy();

    @Key("timeout")
    long timeout();
}
