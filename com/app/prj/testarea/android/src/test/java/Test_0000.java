import org.openqa.selenium.MutableCapabilities;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.net.URI;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import pages.WelcomePage;

public class Test_0000 {

    WelcomePage welcomePage;
    AppiumDriver appiumDriver;

    @BeforeMethod
    public void inizializeDriver() throws Exception {
        MutableCapabilities caps = new UiAutomator2Options();
        caps.setCapability("automationName", "UiAutomator2");
        caps.setCapability("platformName", "Android");
        caps.setCapability("deviceName", "Pixel_8");
        appiumDriver = new AppiumDriver(new URI("http://0.0.0.0:4723/wd/hub").toURL(), caps);

        welcomePage = new WelcomePage(appiumDriver);
    }

    @Test
    public void test1() throws InterruptedException {
        Thread.sleep(10000);
        welcomePage.closeWelcomePage();
    }
}
