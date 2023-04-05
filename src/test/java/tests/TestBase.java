package tests;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.logevents.SelenideLogger;

import io.qameta.allure.selenide.AllureSelenide;
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


    @BeforeAll
    static void beforeall() {
        Configuration.holdBrowserOpen = true;
        Configuration.browser = System.getProperty("BROWSER", "chrome");
        Configuration.browserVersion = System.getProperty("BROWSER_VERSION", "100.0");
        Configuration.browserSize = System.getProperty("BROWSER_SIZE", "1920x1080");
        Configuration.baseUrl = System.getProperty("BASE_URL", "https://demoqa.com");
        Configuration.remote = "https://user1:1234@" + System.getProperty("SELENOID_ADDRESS", "selenoid.autotests.cloud/wd/hub");

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
