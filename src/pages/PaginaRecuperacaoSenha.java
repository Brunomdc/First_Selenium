package pages;

import Utils.Helper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static Utils.Helper.*;
import static Utils.Helper.sendKeys;


public class PaginaRecuperacaoSenha {

    WebDriver driver;

    By email = By.name("email");
    By continuar = By.xpath("//button[@class='btn btn-primary ng-binding']");
    By integre = By.xpath("//a[3][@title='Página de integre']");
    By venda = By.xpath("//a[1][@title='Página de venda']");
    By compra = By.xpath("//a[2][@ title='Página de compra']");
    By cadastre = By.xpath("//a[1][@class='botaoHeaderLaranja first']");
    By acesseConta = By.xpath("//a[2][@class='botaoHeaderLaranja ativo']");
    By acesseRedepay = By.xpath("//h1/a[@title='Acesso ao Rede Pay']");
    By lnkCadastrese = By.xpath("//div[4]/button[@class='btn btn-primary']");

    public void email() {
        sendKeys(email, "servicoyaman720478@userede.com.br");
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

    public void lnkaCadastrese() {
        click(lnkCadastrese);
    }


}