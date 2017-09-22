package Utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Helper {
    private static WebDriver driver;

    public static void elementToBeClickable(By by) {
        WebDriverWait wait = new WebDriverWait(getWebDriver(), 10);
        wait.until(ExpectedConditions.elementToBeClickable(by));
    }

    public static String getText(By by) {
        return findElement(by).getText();
    }

    public static void click(By by) {
        getWebDriver().findElement(by).click();
    }

    public static void get(String url) {
        getWebDriver().get(url);
    }

    public static WebElement findElement(By by) {
        return getWebDriver().findElement(by);
    }

    public static void sendKeys(By by, CharSequence... text) {
        findElement(by).sendKeys(text);
    }

    private static WebDriver getWebDriver() {
        if (driver == null) {
            return WebDriverFactory.GetChromeDriver();
        } else {
            return driver;
        }
    }
}

