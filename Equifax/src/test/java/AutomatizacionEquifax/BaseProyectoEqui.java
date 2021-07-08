package AutomatizacionEquifax;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class BaseProyectoEqui {
	protected WebDriver driver;
	private static final String EXTENSION_IMAGEN = ".png";

	public void cerrar() throws Exception {
		driver.quit();
	}

	public BaseProyectoEqui(WebDriver driver) {
		this.driver = driver;

	}

	public WebDriver chromeDriverConnection() {
		File file = new File("Drivers\\chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", file.getAbsolutePath());
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		return driver;
	}

	
	
	public void borrar(By locator) {
		driver.findElement(locator).clear();
	}
	
	
	public WebElement findElement(By locator) {
		return driver.findElement(locator);
	}

	public List<WebElement> findElements(By locator) {
		return driver.findElements(locator);
	}

	public String getText(WebElement element) {
		return element.getText();
	}

	public String getText(By locator) {
		return driver.findElement(locator).getText();
	}

	public void type(String inputText, By locator) {
		driver.findElement(locator).sendKeys(inputText);
	}

	public void click(By locator) {
		driver.findElement(locator).click();
	}

	public Boolean isDisplayed(By locator) {
		try {
			return driver.findElement(locator).isDisplayed();
		} catch (org.openqa.selenium.NoSuchElementException e) {
			return false;
		}
	}

	public void visit() {
		File file = new File("Drivers\\chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", file.getAbsolutePath());
		driver = new ChromeDriver(); // se crea el objeto ChromeDriver ejecuta el chrome
		driver.manage().window().maximize(); // Maximiza el navegador
		driver.get("http://advantageonlineshopping.com/#/");

	}

	public void TiempoEspera(final By locator) {

		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
				.withTimeout(60, TimeUnit.SECONDS)
				.pollingEvery(3, TimeUnit.SECONDS)
				.ignoring(NoSuchElementException.class);

		
	}

	public void capturarPantalla(WebDriver driver, String nombreImagen) throws IOException {

		File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(scrFile, new File("./screenshots/Equifax/" + nombreImagen + EXTENSION_IMAGEN));

	}

}
