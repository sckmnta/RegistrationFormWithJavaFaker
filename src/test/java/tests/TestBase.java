package tests;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import tests.pages.RegistrationPage;


public class TestBase extends TestData {
    RegistrationPage registrationPage = new RegistrationPage();






    @BeforeAll
    static void beforeall() {
        Configuration.holdBrowserOpen = true;
        Configuration.browserSize = "1920x1080";
        Configuration.baseUrl = "https://demoqa.com";
    }



   //@AfterAll
   // static void afterAll() {
   //     Configuration.holdBrowserOpen = false;
  // }

}
