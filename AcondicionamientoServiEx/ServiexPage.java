package AcondicionamientoServiEx;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import javax.swing.JOptionPane;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.By.ByName;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.TakesScreenshot;

public class ServiexPage extends BaseServiEx {

	public ServiexPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	// private WebDriver driver;

	// TODO DECLARACIONES DE VARIABLES E IDENTIFICADORES DEL SITO WEB EMPRESAS

	// ***********************LOGIN*****************************

	By inicioLogoBancoLocator = By.xpath("//img[@src='../logo_bcoEstado/image.htm?v=1103']");
	By rutEmpreLocator = By.id("txtRutEmpresa");
	By rutAdminLocator = By.id("txtRutUsuario");
	By passwordLocator = By.id("pswClave");
	By loginBtnLocator = By.id("btnIngresar");

	By botonActualizar = By.className("btn btn-primary");
	By MenuServi = By.linkText("Perfilamiento Empresa");
	By contenedorMenu = By.xpath("//div[@class='navbar-collapse collapse']");

	By EstructuraEmpre = By.linkText(
			"/BancoEstado/PerfilamientoAutorizaciones/middleoffice/Entidades/Index/a4222b53ef53461db43dba3c9b700188");

	// ***********************LOGIN*****************************

	// ***********************Home*****************************

	By LogoHomePageLocator = By.id("1403721");
	By MenuNomina = By
			.xpath("/html/body/div[1]/section/section/aside/form/div/div/div[3]/table[12]/tbody/tr/td/div/div[1]/span");
	By MenuBloquearNom = By.id("145000");

	By TableMenu = By.id("1402370");

	// ***********************Home*****************************

	// ***********************Menu Bloqueo Nomina*****************************

	By ComboBoxLocator = By.xpath("//*[@id=\"lMenor15Convenio-vt-custom-dropdown2\"]/a");
	By SelectConvenio = By.xpath("/html/body/ul/li[1]");
	// By SelectConvenio = By.id("ui-id-11");

	// ***********************Menu Bloqueo Nomina*****************************

	// ***********************Validación de Botones*****************************

	By ValidaBtnConsultar = By.id("btnConsultar");
	// Validar botón continuar en pantalla Bloqueo Nómina
	By ValidaBtnContinuar = By.id("btnContinuarNom");
	// Validar botón Volver en pantalla de autorización
	By ValidaBtnVolverAuto = By.id("btn_1539586");
	By ValidaBtnConfirmarFirma = By.id("btnFirmar");
	By ValidaBtnBloquearOtrosPagos = By.id("1539546");

	// ***********************Validación de Botones*****************************

	// ***********************Icono Colapsable*****************************

	By ValidaIconoColapsable = By.id("arrowCuenta");

	// ***********************Icono Colapsable*****************************

	// ***********************Seleccionar Nóminas*****************************

	By MarcaCheckBox = By.xpath(
			"/html/body/div[1]/section/section/article/form/div/div[2]/div[4]/div/div[2]/table/tbody/tr/td/div/div[2]/div/div[1]/div/table/thead/tr/th[1]/input");

	// Seleccionar un solo check
	By SeleccionarCheckBox = By.id("chkNominas_1");

	// ***********************Seleccionar Nóminas*****************************

	// ***********************TextBox Token*****************************

	By IngresaToken = By.id("tiClaveToken");

	// ***********************TextBox Token*****************************

	// TODO COMIENZO DE LOS METODOS GENERADOS

	// Login Usuario
	public void LoginUsuario() throws InterruptedException, IOException {

		visit();
		Thread.sleep(6000);
		// datos para realizar pruebas de check con menos de 15 y seleccionar todos los
		// check
		/*
		 * type("69071700k", rutEmpreLocator); type("170134613", rutAdminLocator);
		 * 
		 * /* type("823667000", rutEmpreLocator); type("115187406", rutAdminLocator);
		 */
		// type("kib2012", passwordLocator);

		capturarPantalla(driver, "Login");
		Thread.sleep(10000);
		// click(botonActualizar);
		// Thread.sleep(7000);

		/*
		 * String parentHandle = driver.getWindowHandle(); // get the current window
		 * handle driver.findElement(By.xpath("//*[@id='someXpath']")).click(); // click
		 * some link that opens a new window
		 * 
		 * for (String winHandle : driver.getWindowHandles()) {
		 * driver.switchTo().window(winHandle); // switch focus of WebDriver to the next
		 * found window handle (that's your newly opened window) }
		 */

		/*
		 * if (isDisplayed(inicioLogoBancoLocator)) {
		 * 
		 * Thread.sleep(3000); capturarPantalla(driver, "inicio");
		 * click(loginBtnLocator);
		 * 
		 * } else { System.out.print("No se encuentra el logo especificado"); }
		 */

	}

	// Botones del Sitio

	public void ValidaBotonConsultar() throws InterruptedException, IOException {

		click(ValidaBtnConsultar);
	}

	public void ValidaBotonContinuarVolver() throws InterruptedException, IOException {

		click(ValidaBtnContinuar);
		Thread.sleep(5000);
		capturarPantalla(driver, "Pantalla Firmarm Bloqueo");

		click(ValidaBtnVolverAuto);
		Thread.sleep(5000);
		capturarPantalla(driver, "Pantalla retorno btn Volver");
	}

	public void ValidaBotonContinuarFirmar() throws InterruptedException, IOException {

		click(ValidaBtnContinuar);
		Thread.sleep(5000);
		capturarPantalla(driver, "Pantalla Firmarm Bloqueo");

	}

	public void ValidaBotonConfirmarFirma() throws InterruptedException, IOException {

		click(ValidaBtnConfirmarFirma);
		Thread.sleep(5000);
		capturarPantalla(driver, "Comprobante Exitoso");

	}

	public void ValidaBotonBloquearOtroPago() throws InterruptedException, IOException {

		click(ValidaBtnBloquearOtrosPagos);
		Thread.sleep(5000);
		capturarPantalla(driver, "Funcionalidad Boton Bloquear Otro");

	}

	// Ingreso de Tokens o Tarjeta de Coordenadas

	public void IngresarToken() throws InterruptedException, IOException {
		String token = JOptionPane.showInputDialog("Introduzca un número", "Introducción  número");
		Thread.sleep(3000);
		type(token, IngresaToken);

	}

	// Navegar por el Menú
	public void BloqueoNomina() throws InterruptedException, IOException {

		String oldTab = driver.getWindowHandle();
		ArrayList<String> newTab = new ArrayList<String>(driver.getWindowHandles());
		newTab.remove(oldTab);
		// change focus to new tab
		Thread.sleep(4000);
		driver.manage().window().maximize();
		driver.switchTo().window(newTab.get(0));
		

		WebElement elementToHover = driver.findElement(By.xpath("//ul[@class='nav navbar-nav']"));

		List<WebElement> elementos = elementToHover.findElements(By.xpath("//a[@class='dropdown-toggle']"));
		Thread.sleep(4000);

		WebElement elemento = elementos.get(0);
		
		elemento.click();
		elemento.click();
		
		// click(MenuServi);
		/*
		 * Alert alert = driver.switchTo().alert();
		 * 
		 * alert.dismiss(); driver.switchTo().window(oldTab);
		 */

		/*
		 * driver.switchTo().window(driver.getWindowHandle());
		 * driver.manage().window().maximize(); driver.close();
		 */

		/*
		 * Thread.sleep(7000); capturarPantalla(driver, "PantallaInicio");
		 * click(MenuNomina); Thread.sleep(3000); capturarPantalla(driver,
		 * "DespliegueMenu1"); click(MenuBloquearNom); Thread.sleep(3000);
		 */

	}

	// Metodos Validación de Combobox's

	public void ComboboxConvenio() throws InterruptedException, IOException {

		capturarPantalla(driver, "PantallaBloqueo");
		click(ComboBoxLocator);
		Thread.sleep(2000);
		capturarPantalla(driver, "DespliegueConvenio");
		click(SelectConvenio);
		Thread.sleep(2000);
		capturarPantalla(driver, "SeleccionConvenio");

	}

	public void SeleccionarCombobox() throws InterruptedException, IOException {

		Select dropdown = new Select(driver.findElement(By.id("ui-id-1")));

		dropdown.selectByIndex(2);
	}

	public void ValidarIconoColapsable() throws IOException {

		click(ValidaIconoColapsable);
		capturarPantalla(driver, "IconoColapsable");
	}

	// Validación de CheckBox's
	public void SeleccionarTodosCheck() throws IOException {

		click(MarcaCheckBox);
		capturarPantalla(driver, "CheckMarcados");
	}

	public void SeleccionarUnCheck() throws IOException, InterruptedException {

		click(SeleccionarCheckBox);
		Thread.sleep(4000);
		capturarPantalla(driver, "Seleccionar una nomina");

	}

	public boolean isHomePageDisplayed() {
		return isDisplayed(LogoHomePageLocator);

	}
}
