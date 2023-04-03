package tests.properties;

import org.junit.jupiter.api.Test;

public class SystemPropertiesTest {
    @Test
    void systemPropertiesTest(){
       String browser =  System.getProperty("browser");
       System.out.println(browser);

    }
}
