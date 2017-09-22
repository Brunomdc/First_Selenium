package main;


import Utils.Helper;
import Utils.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

import static Utils.Helper.*;
import static org.openqa.selenium.By.id;
import static org.openqa.selenium.By.name;


public class LoginComprador {

    static WebDriver driver;

    @Test
    public void main() {

        get("http://10.59.164.13/portal/#/");
        elementToBeClickable(name("email"));
        sendKeys(name("email"), "Meu Texto");
        sendKeys(name("email"), "servicoyaman720477@userede.com.br");
        sendKeys(name("password"), "Rede@2017");
        sendKeys(By.xpath(""));
        elementToBeClickable(id("mn-account"));
        click(id("mn-account"));


        //Helper helper = new Helper(WebDriverFactory.GetChromeDriver());
        //System.setProperty("webdriver.chrome.driver", "C:\\Users\\bruno.moreira\\IdeaProjects\\Projeto_maroto\\resource\\chromedriver.exe");
        //driver = new ChromeDriver();
        //driver.manage().window().maximize();
        //driver.get("http://10.59.164.13/portal/#/");
        //WebDriverWait wait = new WebDriverWait(driver, 10);
        // wait.until(ExpectedConditions.elementToBeClickable(By.name("email")));
        //driver.findElement(By.name("email")).sendKeys("servicoyaman720477@userede.com.br");
        //driver.findElement(name("password")).sendKeys("Rede@2017");
        driver.findElement(By.xpath("/html/body/section/section[2]/section/div/form/div[4]/button")).click();
        //wait.until(ExpectedConditions.elementToBeClickable(id("mn-account")));
        driver.findElement(id("mn-account")).click();
        //wait.until(ExpectedConditions.elementToBeClickable(id("minhaconta")));
        String teste = driver.findElement(id("minhaconta")).getText();
        Assert.assertEquals(teste, "meus dados\n" + "meus cartões\n" + "minhas autorizações");
        driver.findElement(By.xpath("//div/nav/ul/a[1]")).click();
        //wait.until(ExpectedConditions.elementToBeClickable(id("bt-confirm")));
        driver.findElement(id("bt-confirm")).click();
        getText(id(""));
        System.out.println();
        try {
            Thread.sleep(8000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        driver.quit();
    }
}
