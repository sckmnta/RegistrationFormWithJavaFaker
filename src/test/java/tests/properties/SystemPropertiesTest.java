package tests.properties;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Configuration.browser;

public class SystemPropertiesTest {
    @Test
    @Tag("couple_properties_test")
    void systemPropertiesTest() {
        //System.setProperty("browser", "opera");
        String browserName = System.getProperty("browser", "mozilla");
        String browserVersion = System.getProperty("browser_version", "97.0");
        System.out.println(browserName);

    }
}
