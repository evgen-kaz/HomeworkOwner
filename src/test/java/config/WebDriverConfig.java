package config;

import org.aeonbits.owner.Config;

@Config.LoadPolicy(Config.LoadType.MERGE) //при ней некорреткно работают 8 и 9 строчки кода. Нужно или или
@Config.Sources({
        "classpath:${env}.properties",
       /* "classpath:local.properties", //из-за них не воспроизводятся тесты через раннер и терминал для локали
        "classpath:remote.properties"*/
})
public interface WebDriverConfig extends Config {

    @Key("browser")
    @DefaultValue("chrome")
    String browser();

    @Key("browserVersion")
    //@DefaultValue("") //локано сам поднимет, а для удаленной прописала в проперти
    String browserVersion();

    @Key("browserSize")
    @DefaultValue("1920x1080")
    String browserSize();

    @Key("baseUrl")
    @DefaultValue("https://korsarcase.ru")
    String baseUrl();

    @Key("remoteUrl")
    //@DefaultValue("") //иначе запуск всегда будет удаленно происходить
    String remoteUrl();
}
