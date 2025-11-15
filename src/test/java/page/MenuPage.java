package page;

import com.codeborne.selenide.CollectionCondition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class MenuPage {

    private final SelenideElement
            menuButton = $(".sandwich-btn__icon"),
            licensesAndCertificatesButton = $("a[href='/licenses-and-certificates/']"),
            productionButton = $("a[href='/production/']"),
            pressCenterButton = $("a[href='/press-center/news/']"),
            useButton = $("a[href='/use/']"),

    titleLicensesPage = $("[data-content = 'Лицензии']"),
            titleCertificatesPage = $("[data-content = 'и сертификаты']"),
            titleProductionPage = $(byText("Производство защитных кейсов КОРСАР®")),
            titlePressCenterPage = $("[data-content = 'Пресс-центр Новости']");

    private final ElementsCollection
            titleUsePage = $$(".use-area-modal__menu-item");

    @Step("Открытие главной страницы")
    public MenuPage openPage() {
        open("");
        return this;
    }

    @Step("Открытие меню")
    public MenuPage clickButtonMenu() {
        menuButton.click();
        return this;
    }

    @Step("Клик кнопки 'Лицензии и сертификаты'")
    public MenuPage clickButtonLicensesAndCertificates() {
        licensesAndCertificatesButton.click();
        return this;
    }

    @Step("Клик кнопки 'Производство'")
    public MenuPage clickButtonProduction() {
        productionButton.click();
        return this;
    }

    @Step("Клик кнопки 'Пресс-центр'")
    public MenuPage clickButtonPressCenter() {
        pressCenterButton.click();
        return this;
    }

    @Step("Клик кнопки 'Применение'")
    public MenuPage clickButtonUse() {
        useButton.click();
        return this;
    }

    @Step("Проверка открытия страницы 'Лицензии и сертификаты'")
    public void resultClickLicensesAndCertificates() {
        titleLicensesPage.shouldBe(visible);
        titleCertificatesPage.shouldBe(visible);
    }

    @Step("Проверка открытия страницы 'Производство'")
    public void resultClickProduction() {
        titleProductionPage.shouldBe(visible);
    }

    @Step("Проверка открытия страницы 'Пресс-центр'")
    public void resultClickPressCenter() {
        titlePressCenterPage.shouldBe(visible);
    }

    @Step("Проверка открытия страницы 'Применение'")
    public void resultClickUse() {
        titleUsePage.shouldBe(CollectionCondition.sizeGreaterThan(0));
    }
}
