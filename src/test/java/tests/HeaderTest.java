package tests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import page.HeaderPage;

@Tag("Header")
public class HeaderTest extends TestBase {
    HeaderPage headerPage = new HeaderPage();

    @DisplayName("Переход в раздел 'Каталог продукции'")
    @Test
    @Tag("Positive")
    void successfulTransitionToTheCatalogPageTest() {
        headerPage.openPage()
                .clickCatalogHeader()
                .resultClickCatalogHeader();
    }

    @DisplayName("Открытие формы обратной связи")
    @Test
    @Tag("Positive")
    void successfulTransitionToThePageWithTheFeedbackFormTest() {
        headerPage.openPage()
                .clickLeaveRequestHeader()
                .resultClickRequestResultHeader();
    }

    @DisplayName("Поиск товара")
    @Test
    @Tag("Positive")
    void successfulProductSearchTest() {
        headerPage.openPage()
                .clickStringSearchHeader()
                .searchProductHeader()
                .resultSearchProduct();
    }
}
