package utility;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.chrome.ChromeOptions;

public class Hooks {
    public static Tosetbrowser driver;
    public static ChromeOptions options;
    @Before
    public void setUp(){
        driver = new Tosetbrowser();
    }
    @After
    public void tearDown() {
        driver.quit();

    }

}
