import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
    https://chromedriver.chromium.org/downloads
    https://www.selenium.dev/downloads/
    @author FJMV
 */

public class Test {
    public static void main(String[] args) throws Exception {
        //Seteamos las propiedades del sistema
        System.setProperty("webdriver.chrome.driver", "src\\driver\\chromedriver.exe");
        //Inicializaos el objeto driver
        WebDriver driver = new ChromeDriver();
        //Inicializamos el navegador con la url
        driver.get("https://buggy.justtestit.org/");
        Thread.sleep(5000);
        driver.close();

    }
}
