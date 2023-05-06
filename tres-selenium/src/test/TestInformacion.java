package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestInformacion {
    //Inicializamo el objeto driver
    WebDriver driver = new ChromeDriver();
    public void abrirNavegador() throws InterruptedException {
        //Seteamos las propiedades del sistemas
        System.setProperty("webdriver.chrome.driver", "src\\driver\\chromedriver.exe");
        //Iniciamos el navegador
        driver.get("https://buggy.justtestit.org/");
        System.out.println(tituloPagina());
        informacion();
        driver.manage().window().maximize();
        driver.navigate().to("https://www.selenium.dev/");
        System.out.println(tituloPagina());
        informacionSitioDos();
        //Dormimos el proceso principal 5 segundos
        Thread.sleep(5000);
        driver.close();
    }

    //Obtenemos información del sitio web
    private void informacion(){
       if(driver.getTitle().contains("Buggy Cars Rating")){
           System.out.println("Pagina cargada");
       }
    }

    private void informacionSitioDos(){
        if(driver.getTitle().contains("Selenium")){
            System.out.println("Pagina cambiada");
        }
    }

    private String tituloPagina(){
        return driver.getTitle();
    }
}
