package AcondicionamientoServiEx;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class BloquearNominaExitosaTest {
	private static final String EXTENSION_IMAGEN = ".png";
	private WebDriver driver;
	ServiexPage bloqueoNominaPage;

	@Before
	public void setUp() throws Exception {
		bloqueoNominaPage = new ServiexPage(driver);

	}

	@After
	public void tearDown() throws Exception {
		// driver.quit();
	}

	@Test
	public void test() throws InterruptedException, IOException {

		Thread.sleep(10000);
		bloqueoNominaPage.LoginUsuario();
		Thread.sleep(5000);
		
		bloqueoNominaPage.BloqueoNomina();
		Thread.sleep(3000);

		/*bloqueoNominaPage.ComboboxConvenio();
		Thread.sleep(3000);

		bloqueoNominaPage.ValidaBotonConsultar();
		Thread.sleep(6000);

		bloqueoNominaPage.SeleccionarUnCheck();

		bloqueoNominaPage.ValidaBotonContinuarFirmar();

		bloqueoNominaPage.IngresarToken();
		Thread.sleep(3000);
		bloqueoNominaPage.ValidaBotonConfirmarFirma();*/
	}

}
