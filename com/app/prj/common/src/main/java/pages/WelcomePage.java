package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import java.lang.reflect.Field;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class WelcomePage {

    @AndroidFindBy(id = "it.rcs.economiaplus:id/enter_button")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"CONTINUA\"]")
    public WebElement buttonContinua;

    public WelcomePage(AppiumDriver appiumDriver) {
        PageFactory.initElements(new AppiumFieldDecorator(appiumDriver), this);
    }

    public void closeWelcomePage() {
        buttonContinua.click();
    }
}
