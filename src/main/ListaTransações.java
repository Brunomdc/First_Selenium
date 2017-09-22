package main;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ListaTransações {

    static WebDriver driver;

    @Test
    public void main() {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\bruno.moreira\\IdeaProjects\\Projeto_maroto\\resource\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://10.59.164.13/portal/#/");
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(By.name("email")));
        driver.findElement(By.name("email")).sendKeys("servicoyaman720477@userede.com.br");
        driver.findElement(By.name("password")).sendKeys("Rede@2017");
        driver.findElement(By.xpath("//div[4]/button[@class='btn btn-primary']")).click();
        wait.until(ExpectedConditions.elementToBeClickable(By.className("placeholder ng-binding")));
        driver.findElement(By.className("placeholder ng-binding")).click();
        //wait.until(ExpectedConditions.elementToBeClickable(By.id("my-transactions")));
        //driver.findElement(By.id("my-transactions")).click();
        //Assert.assertEquals(teste, "meus dados\n" + "meus cartões\n" + "minhas autorizações");
        // driver.findElement(By.xpath("//div/nav/ul/a[1]")).click();
        //wait.until(ExpectedConditions.elementToBeClickable(By.id("bt-confirm")));
        //driver.findElement(By.id("bt-confirm")).click();

        System.out.println();
        try {
            Thread.sleep(8000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        driver.quit();
    }
}
