package tests;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;
import org.aeonbits.owner.ConfigFactory;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.remote.DesiredCapabilities;
import tests.helpers.Attach;
import tests.pages.RegistrationPage;

import java.util.Map;


public class TestBase extends TestData {
    RegistrationPage registrationPage = new RegistrationPage();

    static config.WebDriverConfig webDriverConfig = ConfigFactory.create(config.WebDriverConfig.class, System.getProperties());


    @BeforeAll
    static void beforeall() {
        Configuration.baseUrl = webDriverConfig.getBaseUrl();
        Configuration.remote = webDriverConfig.getRemoteUrl();
        Configuration.browserSize = webDriverConfig.getBrowserSize();
        Configuration.browser = webDriverConfig.getBrowser();
        Configuration.browserVersion = webDriverConfig.getBrowserVersion();

        Configuration.pageLoadStrategy = "eager";

        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("selenoid:options", Map.<String, Object>of(
                "enableVNC", true,
                "enableVideo", true
        ));

        Configuration.browserCapabilities = capabilities;
    }

    @BeforeEach
    void addListener() {
        SelenideLogger.addListener("AllureSelenide", new AllureSelenide());
    }

    @AfterEach
    void addAttachments() {
        Attach.screenshotAs("Last screenshot");
        Attach.pageSource();
        Attach.browserConsoleLogs();
        Attach.addVideo();
    }


    @AfterAll
    static void afterAll() {
        Configuration.holdBrowserOpen = false;
    }

}
