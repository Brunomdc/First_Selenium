package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static Utils.Helper.*;


public class PaginaLogin {

    WebDriver driver;

    By username = By.name("email");
    By password = By.name("password");
    By continuar = By.xpath("//div[4]/button[@class='btn btn-primary']");
    By integre = By.xpath("//a[3][@title='Página de integre']");
    By venda = By.xpath("//a[1][@title='Página de venda']");
    By compra = By.xpath("//a[2][@ title='Página de compra']");
    By cadastre = By.xpath("//a[1][@class='botaoHeaderLaranja first']");
    By acesseConta = By.xpath("//a[2][@class='botaoHeaderLaranja ativo']");
    By acesseRedepay = By.xpath("//h1/a[@title='Acesso ao Rede Pay']");
    By esqueciSenha = By.xpath("//p/a[@class='hlink']");
    By cadastrese = By.xpath("//div[4]/button[@class='btn btn-primary']");

    public void nomeLogin() {
        sendKeys(username, "servicoyaman720477@userede.com.br");
    }

    public void senhaLogin() {
        sendKeys(password, "Rede@2018");
    }

    public void continuar() {
        click(continuar);
    }

    public void integre() {
        click(integre);
    }

    public void venda() {
        click(venda);
    }

    public void compra() {
        click(compra);
    }

    public void cadastre() {
        click(cadastre);
    }

    public void acesseConta() {
        click(acesseConta);
    }

    public void acesseRedepay() {
        click(acesseRedepay);
    }

    public void esqueciSenha() {
        click(esqueciSenha);
    }

    public void cadastrese() {
        click(cadastrese);
    }


    public static String getText(By by) {
        WebDriver driver = new ChromeDriver();
        return driver.findElement(by).getText();
    }

}

