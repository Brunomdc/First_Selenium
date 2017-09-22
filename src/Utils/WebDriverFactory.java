package Utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverFactory {
    private static WebDriver driver;

    public static WebDriver GetChromeDriver() {
            System.setProperty("webdriver.chrome.driver", "C:\\Users\\bruno.moreira\\IdeaProjects\\Projeto_maroto\\resource\\chromedriver.exe");
            driver = new ChromeDriver();
            driver.manage().window().maximize();
            return driver;

    }
}
