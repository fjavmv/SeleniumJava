package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.List;

public class EncontrarTest {
    //Creamos una instacia de WebDriver
    WebDriver driver = new ChromeDriver();

    public void abrirNavegador() throws InterruptedException {
        //Establacemos las propiedades del sistema
        System.setProperty("webdriver.chrome.driver", "src\\driver\\chromedriver.exe");
        //abrimos el navegador
        driver.get("https://buggy.justtestit.org/");
        //manipulamos el navegador
        driver.manage().window().maximize();
        click(driver);
        recorrerLista(encontrarElementos(driver));
        Thread.sleep(5000);
        driver.close();

    }

    //Hacer click
    private void click(WebDriver webDriver) {
        //Encontramos el elemento y ejcutamos un click
        WebElement webElement = webDriver.findElement(By.linkText("Register"));
        webElement.click();
    }


    private List<WebElement> encontrarElementos(WebDriver driver) {
        /*
        XPath (lenguaje de rutas XML)
        es una sintaxis que sirve para seleccionar
        elementos y atributos de un documento XML navegando
        su estructura en forma de árbol.
         */
        return driver.findElements(By.xpath("//a"));
        //ArrayList<WebElement> todosLosLinks = (ArrayList<WebElement>) driver.findElements(By.xpath("//a"));
    }

    private void recorrerLista(List<WebElement> enlaces) {
        for (WebElement enlace : enlaces) {
            System.out.println(enlace.getText());
        }
    }


}
