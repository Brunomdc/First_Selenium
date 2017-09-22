package main;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RecuperaçãoSenha {

    static WebDriver driver;

    @Test
    public static void main(String args[]) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\bruno.moreira\\IdeaProjects\\Projeto_maroto\\resource\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://10.59.164.13/portal/#/");
        WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.elementToBeClickable(By.className("hlink")));
        driver.findElement(By.className("hlink")).click();
        wait.until(ExpectedConditions.textToBe(By.name("email"), ""));
        String teste = driver.findElement(By.xpath("/html/body/section/section[2]/div[2]/div/div/section/h1")).getText();
        Assert.assertEquals(teste, "Recuperação de senha");
        driver.findElement(By.name("email")).sendKeys("servicoyaman720477@userede.com.br");

        System.out.println(teste);
        try {
            Thread.sleep(8000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        //driver.quit();

    }
}
