package tests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import page.MenuPage;

@Tag("Menu")
public class MenuTest extends TestBase {

    MenuPage menuPage = new MenuPage();

    @DisplayName("Переход на страницу 'Лицензиии и сертификаты'")
    @Test
    void successfulTransitionToTheLicensesAndCertificatesPageTest() {
        menuPage.openPage()
                .clickButtonMenu()
                .clickButtonLicensesAndCertificates()
                .resultClickLicensesAndCertificates();
    }

    @DisplayName("Переход на страницу 'Производство'")
    @Test
    void successfulTransitionToTheProductionPageTest() {
        menuPage.openPage()
                .clickButtonMenu()
                .clickButtonProduction()
                .resultClickProduction();
    }

    @DisplayName("Переход на страницу 'Пресс-центр'")
    @Test
    void successfulTransitionToThePressCenterPageTest() {
        menuPage.openPage()
                .clickButtonMenu()
                .clickButtonPressCenter()
                .resultClickPressCenter();
    }

    @DisplayName("Переход на страницу 'Применение'")
    @Test
    void successfulTransitionToTheUsePageTest() {
        menuPage.openPage()
                .clickButtonMenu()
                .clickButtonUse()
                .resultClickUse();
    }
}
