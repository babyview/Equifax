package AutomatizacionEquifax;

import java.io.File;
import java.io.IOException;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

import javax.swing.JOptionPane;
import static org.junit.Assert.*;

import org.apache.commons.io.FileUtils;
import org.hamcrest.core.IsEqual;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.UnexpectedTagNameException;

import junit.framework.AssertionFailedError;

import org.openqa.selenium.TakesScreenshot;

public class ProyectoEquifaxPage extends BaseProyectoEqui {

	public ProyectoEquifaxPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	JavascriptExecutor js = (JavascriptExecutor) driver;
	public boolean Aprobado = false;
	// private WebDriver driver;

	// TODO DECLARACIONES DE VARIABLES E IDENTIFICADORES DEL SITO WEB A TESTEAR

	By MenuArticulosPopu = By.xpath("/html/body/header/nav/ul/li[6]/a");
	By VerDetalle = By.id("details_10");
	By CantidadProd = By
			.xpath("/html/body/div[3]/section/article[1]/div[2]/div[2]/div/div[2]/e-sec-plus-minus/div/div[3]");
	By AgregarArticulo = By.xpath("/html/body/div[3]/section/article[1]/div[2]/div[2]/div/div[4]/button");

	By VerCarrito = By.id("checkOutPopUp");

	By Usuario = By.xpath("/html/body/div[3]/section/article/div/div[1]/div/div[1]/sec-form/sec-view[1]/div/input");

	By Clave = By.xpath("/html/body/div[3]/section/article/div/div[1]/div/div[1]/sec-form/sec-view[2]/div/input");
	By BotonLogin = By.id("login_btnundefined");
	By BotonNext = By.id("next_btn");
	By CarritoCompra = By.id("menuCart");
	By Remover = By.xpath("/html/body/div[3]/section/article/div[1]/table/tbody/tr/td[6]/span/a[3]");

	// TODO COMIENZO DE LOS METODOS GENERADOS

	// Visualizar y buscar Articulos
	public void VisualizarArticulo() throws InterruptedException, IOException {

		visit();

		// driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		Thread.sleep(4000);

		Thread.sleep(3000);
		capturarPantalla(driver, "inicio");
		click(MenuArticulosPopu);

		Thread.sleep(3000);
		click(VerDetalle);
		Thread.sleep(3000);

//Thread.sleep(3000);
//type("2", CantidadProd);

	}

	// En esta operación, se seleccionan la cantidad de Productos a comprar y se
	// agregan al carrito

	public void SeleccionarCantidad() throws IOException, InterruptedException {

		click(CantidadProd);
		capturarPantalla(driver, "Selecciona Cantidad");
		Thread.sleep(4000);
		click(AgregarArticulo);
		capturarPantalla(driver, "Agrega al Carrito");
	}

	// Se visulizan los articulos en el carrito y se procede a iniciar sesió

	public void VercarritoAndLogear() throws InterruptedException, IOException {

		Thread.sleep(3000);
		click(VerCarrito);
		Thread.sleep(3000);
		capturarPantalla(driver, "Visualizar Carrito");
		type("Giovanny", Usuario);
		Thread.sleep(3000);
		type("Gio123456", Clave);
		Thread.sleep(3000);
		capturarPantalla(driver, "Login");
		click(BotonLogin);
		Thread.sleep(5000);

	}

	// En esta última operación, el cliente desiste de la compra y borra los
	// articulos

	public void VerCarritoEliminar() throws InterruptedException, IOException {

		Thread.sleep(3000);
		capturarPantalla(driver, "Validación de datos");
		click(BotonNext);
		Thread.sleep(5000);
		click(CarritoCompra);
		Thread.sleep(4000);
		capturarPantalla(driver, "Ver Productos Seleccionados");
		click(Remover);
		Thread.sleep(3000);
		capturarPantalla(driver, "Carro Vacio");

	}

}
