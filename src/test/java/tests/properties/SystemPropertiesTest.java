package tests.properties;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Configuration.browser;

public class SystemPropertiesTest {
    @Test
    void systemPropertiesTest() {
        System.setProperty("browser", "opera");
        String browserName = System.getProperty("browser");
        System.out.println(browserName);

    }
}
