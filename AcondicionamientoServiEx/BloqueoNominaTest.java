package AcondicionamientoServiEx;

import java.io.IOException;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class BloqueoNominaTest {
	private WebDriver driver;
	ServiexPage bloqueoNominaPage;

	@Before
	public void setUp() throws Exception {
		bloqueoNominaPage = new ServiexPage(driver);
		//driver = bloqueoNominaPage.chromeDriverConnection();
		//bloqueoNominaPage.visit("https://empresas.becl.presentation.veritran.cloud/IB/presentation/GREN/index.htm");
	}

	@After
	public void tearDown() throws Exception {
		// driver.quit();
	}

	@Test
	public void test() throws InterruptedException, IOException {

		Thread.sleep(3000);
		// bloqueoNominaPage.capturarPantalla(driver, "Login");
		bloqueoNominaPage.LoginUsuario();
		// bloqueoNominaPage.capturarPantalla(driver, "Home");
		Thread.sleep(3000);
		bloqueoNominaPage.BloqueoNomina();
		Thread.sleep(3000);
		// bloqueoNominaPage.capturarPantalla(driver, "Bloqueo");

		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"lMenor15Convenio-vt-custom-dropdown2\"]/a")).click();

		Thread.sleep(3000);
		driver.findElement(By.id("ui-id-1")).click();

	}

}
