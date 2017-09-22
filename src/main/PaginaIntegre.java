package main;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PaginaIntegre {

    static WebDriver driver;

    @Test
    public static void main(String args[]) {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\bruno.moreira\\IdeaProjects\\Projeto_maroto\\resource\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("http://10.59.164.13/portal/#/");
        driver.manage().window().maximize();

        //driver.findElement(By.xpath("//a[3][@title='Página de integre']")).click();
        String teste = driver.findElement(By.id("content")).getText();
        Assert.assertEquals(teste, "Integrar a nossa solução em seu site é muito simples.");

        System.out.println(teste);
        try {
            Thread.sleep(8000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        driver.quit();
    }
}
