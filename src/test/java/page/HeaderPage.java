package page;

import com.codeborne.selenide.CollectionCondition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selectors.withTagAndText;
import static com.codeborne.selenide.Selenide.*;

public class HeaderPage {

    public static String nameProduct = "Ударопрочный";

    private final SelenideElement
            catalogButton = $(".header__links [href='/catalog/']"),
            leaveRequestButton = $(".header__links [data-target='#callbackForma']"),
            searchButton = $(byText("Поиск")),
            searchInput = $(".search__input"),

    catalogResult = $("[data-content='Каталог защитных кейсов и контейнеров']"),
            leaveRequestResult = $(".callback-forma");

    private final ElementsCollection
            productsSearchResult = $$(withTagAndText("span", nameProduct));

    @Step("Открытие главной страницы")
    public HeaderPage openPage() {
        open("");
        return this;
    }

    @Step("Клик кнопки 'Каталог продукции'")
    public HeaderPage clickCatalogHeader() {
        catalogButton.click();
        return this;
    }

    @Step("Клик кнопки 'Оставить заявку'")
    public HeaderPage clickLeaveRequestHeader() {
        leaveRequestButton.click();
        return this;
    }

    @Step("Клик кнопки поиска")
    public HeaderPage clickStringSearchHeader() {
        searchButton.click();
        return this;
    }

    @Step("Ввод и поиск товара")
    public HeaderPage searchProductHeader() {
        searchInput.click();
        searchInput.sendKeys(nameProduct);
        searchInput.pressEnter();
        return this;
    }

    @Step("Проверка открытия страницы каталога")
    public void resultClickCatalogHeader() {
        catalogResult.shouldBe();
    }

    @Step("Проверка открытия формы обратной связи")
    public void resultClickRequestResultHeader() {
        leaveRequestResult.shouldBe(visible);
    }

    @Step("Проверка открытия страницы с результатами поиска")
    public void resultSearchProduct() {
        productsSearchResult.shouldBe(CollectionCondition.empty);
    }
}
