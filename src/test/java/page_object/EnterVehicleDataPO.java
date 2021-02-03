package page_object;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import page_object.enums.FuelType;
import page_object.enums.Make;
import page_object.enums.Model;
import page_object.enums.NumberOfSeats;
import selenium.page_object.BaseWebPage;

/**
 * Page Object Enter Vehicle Data
 * 
 * @author Carlos Moreira
 */
public class EnterVehicleDataPO extends BaseWebPage {

	private static By FIRST_NAME = By.cssSelector("#firstname");
	private static By ENTER_INSURANT_DATA = By.xpath("//*[@id='enterinsurantdata']/..");
	private static By BTN_PREVIOUS = By.cssSelector("#preventerinsurancedata");
	private static By ENGINE_PERFORMANCE = By.cssSelector("#engineperformance");
	private static By CX_MODEL = By.cssSelector("#model");
	private static By CYLINDER_CAPACITY = By.cssSelector("#cylindercapacity");
	private static By PAYLOAD = By.cssSelector("#payload");
	private static By TOTAL_WEIGHT = By.cssSelector("#totalweight");
	private static By RIGHT_HAND_DRIVE_YES = By.cssSelector("#righthanddriveyes");
	private static By RIGHT_HAND_DRIVE_NO = By.cssSelector("#righthanddriveno");
	private static By CX_MAKE = By.cssSelector("#make");
	private static By DATE_OF_MANUFACTURE = By.cssSelector("#dateofmanufacture");
	private static By CX_NUMBER_OF_SEATS = By.cssSelector("#numberofseats");
	private static By CX_FUEL_TYPE = By.cssSelector("#fuel");
	private static By LIST_PRICE = By.cssSelector("#listprice");
	private static By LICENSE_PLATE_NUMBER = By.cssSelector("#licenseplatenumber");
	private static By ANNUAL_MILEAGE = By.cssSelector("#annualmileage");
	private static By BTN_NEXT = By.xpath("//*[@id='nextenterinsurantdata']");

	public EnterVehicleDataPO(WebDriver webDriver) {
		super(webDriver);
	}

	@Override
	public boolean isDisplayed() {
		return true;
	}

	/**
	 * Título da página - 'Enter Vehicle Data'
	 * 
	 * @return
	 * @throws Exception
	 */
	public WebElement title() throws Exception {
		return searchElement.findElementBy(CX_MAKE, "Título da página - 'Enter Vehicle Data'");
	}
	
	/**
	 * Campo 'First Name'
	 * 
	 * @return
	 * @throws Exception
	 */
	public WebElement firstName() throws Exception {
		return searchElement.findElementBy(FIRST_NAME, "Campo 'First Name'");
	}
	
	/**
	 * Link para a página 'Enter Insurant Data'
	 * 
	 * @return
	 * @throws Exception
	 */
	public WebElement enterInsurantData() throws Exception {
		return searchElement.findElementBy(ENTER_INSURANT_DATA, "Link para a página 'Enter Insurant Data'");
	}
	
	/**
	 * Botão para retornar a página 'Enter Insurant Data'
	 * 
	 * @return
	 * @throws Exception
	 */
	public WebElement btnPrevious() throws Exception {
		return searchElement.findElementBy(BTN_PREVIOUS, "Botão para retornar a página 'Enter Insurant Data'");
	}

	/**
	 * Caixa de seleção do marca do veículo
	 * 
	 * @return
	 * @throws Exception
	 */
	public WebElement cxMake() throws Exception {
		return searchElement.findElementBy(CX_MAKE, "Caixa de seleção que contém a marca do veículo");
	}

	/**
	 * Campo da caixa de seleção da marca do veículo
	 * 
	 * @param make
	 * @return
	 * @throws Exception
	 */
	public WebElement make(Make make) throws Exception {
		return searchElement.findElementBy(make.getBy(), make.toString());
	}

	/**
	 * Caixa de seleção do modelo do veículo
	 * 
	 * @return
	 * @throws Exception
	 */
	public WebElement cxModel() throws Exception {
		return searchElement.findElementBy(CX_MODEL, "Caixa de seleção que contém o modelo do veículo");
	}

	/**
	 * Campo da caixa de seleção do modelo do veículo
	 * 
	 * @param model
	 * @return
	 * @throws Exception
	 */
	public WebElement model(Model model) throws Exception {
		return searchElement.findElementBy(model.getBy(), model.toString());
	}
	
	/**
	 * Input 'Cylinder Capacity [ccm]'
	 * 
	 * @return
	 * @throws Exception
	 */
	public WebElement inputCylinderCapacity() throws Exception {
		return searchElement.findElementBy(CYLINDER_CAPACITY, "Input 'Cylinder Capacity [ccm]'");
	}

	/**
	 * Input 'Engine Performance [kW]'
	 * 
	 * @return
	 * @throws Exception
	 */
	public WebElement inputEnginePerformance() throws Exception {
		return searchElement.findElementBy(ENGINE_PERFORMANCE, "Input 'Engine Performance [kW]'");
	}

	/**
	 * Input 'Date of Manufacture'
	 * 
	 * @return
	 * @throws Exception
	 */
	public WebElement dateOfManufacture() throws Exception {
		return searchElement.findElementBy(DATE_OF_MANUFACTURE, "Input 'Date of Manufacture'");
	}

	/**
	 * Input 'Number of Seats'
	 * 
	 * @return
	 * @throws Exception
	 */
	public WebElement cxNumberOfSeats() throws Exception {
		return searchElement.findElementBy(CX_NUMBER_OF_SEATS, "Input 'Number of Seats'");
	}

	/**
	 * Campo da caixa de seleção 'Number of Seats'
	 * 
	 * @param number
	 * @return
	 * @throws Exception
	 */
	public WebElement numberOfSeats(NumberOfSeats number) throws Exception {
		return searchElement.findElementBy(number.getBy(), number.toString());
	}

	/**
	 * Checkbox 'Right Hand Drive' - Yes
	 * 
	 * @return
	 * @throws Exception
	 */
	public WebElement rightHandDriveYes() throws Exception {
		return searchElement.findElementBy(RIGHT_HAND_DRIVE_YES, "Checkbox 'Right Hand Drive' - Yes");
	}

	/**
	 * Checkbox 'Right Hand Drive' - No
	 * 
	 * @return
	 * @throws Exception
	 */
	public WebElement rightHandDriveNo() throws Exception {
		return searchElement.findElementBy(RIGHT_HAND_DRIVE_NO, "Checkbox 'Right Hand Drive' - No");
	}

	/**
	 * Input 'Fuel Type'
	 * 
	 * @return
	 * @throws Exception
	 */
	public WebElement cxFuelType() throws Exception {
		return searchElement.findElementBy(CX_FUEL_TYPE, "Input 'Fuel Type'");
	}

	/**
	 * Campo da caixa de seleção 'Fuel Type'
	 * 
	 * @param fuel
	 * @return
	 * @throws Exception
	 */
	public WebElement fuelType(FuelType fuel) throws Exception {
		return searchElement.findElementBy(fuel.getBy(), fuel.toString());
	}

	/**
	 * Input 'Payload'
	 * 
	 * @return
	 * @throws Exception
	 */
	public WebElement inputPayload() throws Exception {
		return searchElement.findElementBy(PAYLOAD, "Input 'Payload'");
	}
	
	/**
	 * Input 'Total Weight [kg]'
	 * 
	 * @return
	 * @throws Exception
	 */
	public WebElement inputTotalWeight() throws Exception {
		return searchElement.findElementBy(TOTAL_WEIGHT, "Input 'Total Weight [kg]'");
	}

	/**
	 * Input 'List Price'
	 * 
	 * @return
	 * @throws Exception
	 */
	public WebElement listPrice() throws Exception {
		return searchElement.findElementBy(LIST_PRICE, "Input 'List Price'");
	}

	/**
	 * Input 'License Plate Number'
	 * 
	 * @return
	 * @throws Exception
	 */
	public WebElement licensePlateNumber() throws Exception {
		return searchElement.findElementBy(LICENSE_PLATE_NUMBER, "Input 'License Plate Number'");
	}

	/**
	 * Input 'Annual Mileage [mi]'
	 * 
	 * @return
	 * @throws Exception
	 */
	public WebElement annualMileage() throws Exception {
		return searchElement.findElementBy(ANNUAL_MILEAGE, "Input 'Annual Mileage [mi]'");
	}

	/**
	 * Botão 'Next'
	 * 
	 * @return
	 * @throws Exception
	 */
	public WebElement btnNext() throws Exception {
		return searchElement.findElementBy(BTN_NEXT, "Botao 'Next'");
	}
}