package Testes;

import static org.junit.Assert.*;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class NovosTestes {
    @Test
    public void testFazerLoginMantis() throws InterruptedException {
        //Abrindo o navegador
        System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Java\\jdk1.8.0_251\\bin\\chromedriver.exe");
        WebDriver navegador = new ChromeDriver();
        navegador.manage().window().maximize();


        //Navegando para a página do Mantis
        navegador.get("https://mantis-prova.base2.com.br/login_page.php");
        Thread.sleep(1000);

        //Digitar no campo "Username" o texto "luciene.teodoro"
        navegador.findElement(By.name("username")).sendKeys("luciene.teodoro");

        //Digitar no campo "Password" o texto "170.83.100.148"
        navegador.findElement(By.name("password")).sendKeys("170.83.100.148");

        //clicar no login
        navegador.findElement(By.className("button")).click();

        //Clicar no bug
        navegador.findElement(By.linkText("0003721")).click();
        Thread.sleep(2000);

        //Preencher campo Add Note
       navegador.findElement(By.name("bugnote_text")).click();
        Thread.sleep(2000);

        //Clicar no campo Add Note e prencher com a informação desejada
        navegador.findElement(By.name("bugnote_text")).sendKeys("Teste Base 2");

        //Fechar o navegador
        navegador.quit();
    }
}



