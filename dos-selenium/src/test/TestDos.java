package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
/*
    Control del navegador
 */

public class TestDos {
    public void abrirNavegador() throws InterruptedException {
        //Seteamos las propiedades del sistemas
        System.setProperty("webdriver.chrome.driver", "src\\driver\\chromedriver.exe");
        //Inicializamo el objeto driver
        WebDriver driver = new ChromeDriver();
        //Iniciamos el navegador
        driver.get("https://buggy.justtestit.org/");
        driver.manage().window().maximize();
        driver.navigate().to("https://buggy.justtestit.org/register");
        //Dormimos el proceso principal 5 segundos
        Thread.sleep(5000);
        driver.close();
    }
}
