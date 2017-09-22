package main;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;


public class PaginaVenda {

    static WebDriver driver;

    @Test
    public void main() {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\bruno.moreira\\IdeaProjects\\Projeto_maroto\\resource\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("http://10.59.164.13/portal/#/");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//a[1][@title='Página de venda']")).click();
        String teste = driver.findElement(By.xpath("//*[@id='content']/div[1]/div/div[1]/div/h1")).getText();
        Assert.assertEquals(teste, "Nós somos o parceiro ideal para o seu e-commerce!");

        System.out.println(teste);
        try {
            Thread.sleep(8000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        driver.quit();
    }
}
