package AutomatizacionEquifax;

import java.io.File;
import java.io.IOException;
import java.sql.Driver;

import org.apache.commons.io.FileUtils;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import junit.framework.Assert;

import org.openqa.selenium.TakesScreenshot;

public class EjecucionTest {
	private static final String EXTENSION_IMAGEN = ".png";
	private WebDriver driver;
	ProyectoEquifaxPage proyectoEquifax;

	@Before
	public void setUp() throws Exception {
		proyectoEquifax = new ProyectoEquifaxPage(driver);

	}

	@After
	public void tearDown() throws Exception {
		Thread.sleep(3000);
		proyectoEquifax.cerrar();
	}

	@Test
	public void test() throws InterruptedException, IOException {

		proyectoEquifax.VisualizarArticulo();
		proyectoEquifax.SeleccionarCantidad();
		proyectoEquifax.VercarritoAndLogear();
		proyectoEquifax.VerCarritoEliminar();
		
	}

}
