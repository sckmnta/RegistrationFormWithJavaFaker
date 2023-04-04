package tests.properties;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;


public class SystemPropertiesTest {
    @Test
    @Tag("couple_properties_test")
    void systemPropertiesTest() {
        System.setProperty("browser", "opera");
        String browserName = System.getProperty("browser", "mozilla");
        String browserVersion = System.getProperty("browser_version", "110.0.1");
        System.out.println(browserName);

    }
}

