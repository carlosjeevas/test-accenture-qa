package page_object.model;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

import page_object.EnterVehicleDataPO;
import page_object.enums.FuelType;
import page_object.enums.Make;
import page_object.enums.Model;
import page_object.enums.NumberOfSeats;
import selenium.page_object.BaseWebPage;

public class EnterVehicleDataModel extends BaseWebPage {

	Actions actions = new Actions(webDriver);
	private EnterVehicleDataPO EnterVehicleData;

	public EnterVehicleDataModel(WebDriver webDriver) {
		super(webDriver);
		EnterVehicleData = new EnterVehicleDataPO(webDriver);
	}

	@Override
	public boolean isDisplayed() {
		return false;
	}

	/**
	 * Verifica se o campo Make está na página
	 * 
	 * @author Carlos Moreira
	 * @throws Exception
	 */
	public boolean existMake() throws Exception {
		return EnterVehicleData.cxMake().isDisplayed();
	}
	
	/**
	 * Verifica a existência do campo 'First Name'
	 * 
	 * @author Carlos Moreira
	 * @throws Exception
	 */
	public boolean existFirstName() {
		try {
			return EnterVehicleData.firstName().isDisplayed();
		} catch (Exception e) {
			System.out.println(e);
			return false;
		}
		
	}

	/**
	 * Clica no link da página 'Enter Insurant Data'
	 * 
	 * @author Carlos Moreira
	 * @throws Exception
	 */
	public void clickPageEnterInsurantData() throws Exception {
		command.click(EnterVehicleData.enterInsurantData());
	}
	
	/**
	 * Botão para retornar a página 'Enter Insurant Data'
	 * 
	 * @author Carlos Moreira
	 * @throws Exception
	 */
	public void btnPrevious() throws Exception {
		command.click(EnterVehicleData.btnPrevious());
	}

	/**
	 * Seleciona a opção da caixa de seleção 'Make'
	 * 
	 * @author Carlos Moreira
	 * @throws Exception
	 */
	public void selectMake(String make) throws Exception {
		command.click(EnterVehicleData.cxMake());
		command.click(EnterVehicleData.make(Make.valueOf(make)));
	}

	/**
	 * Seleciona a opção da caixa de seleção 'Model'
	 * 
	 * @author Carlos Moreira
	 * @throws Exception
	 */
	public void selectModel(String model) throws Exception {
		command.click(EnterVehicleData.cxModel());
		command.click(EnterVehicleData.model(Model.valueOf(model)));
	}

	/**
	 * Insere o valor no campo 'Cylinder Capacity [ccm]'
	 * 
	 * @author Carlos Moreira
	 * @param cylinderCapacity
	 * @throws Exception
	 */
	public void insertCylinderCapacity(String cylinderCapacity) throws Exception {
		command.send(EnterVehicleData.inputCylinderCapacity(), cylinderCapacity);
	}

	/**
	 * Insere o valor no campo 'Engine Performance [kW]'
	 * 
	 * @author Carlos Moreira
	 * @param valor
	 * @throws Exception
	 */
	public void insertEnginePerformance(String valor) throws Exception {
		command.send(EnterVehicleData.inputEnginePerformance(), valor);
	}

	/**
	 * Insere o valor no campo 'Date of Manufacture'
	 * 
	 * @author Carlos Moreira
	 * @param valor
	 * @throws Exception
	 */
	public void insertDateOfManufacture(String valor) throws Exception {
		command.send(EnterVehicleData.dateOfManufacture(), valor);
	}

	/**
	 * Seleciona a opção da caixa de seleção 'Number of Seats'
	 * 
	 * @author Carlos Moreira
	 * @throws Exception
	 */
	public void selectNumberOfSeats(String number) throws Exception {
		command.click(EnterVehicleData.cxNumberOfSeats());
		command.click(EnterVehicleData.numberOfSeats(NumberOfSeats.valueOf(number)));
	}

	/**
	 * Insere o valor no campo 'Cylinder Capacity [ccm]'
	 * 
	 * @author Carlos Moreira
	 * @param valor
	 * @throws Exception
	 */
	public void selectRightHandDrive(String valor) throws Exception {
		if (valor.toUpperCase().equals("YES")) {
			command.click(EnterVehicleData.rightHandDriveYes());
		} else {
			command.click(EnterVehicleData.rightHandDriveNo());
		}
	}

	/**
	 * Seleciona a opção da caixa de seleção 'Fuel Type'
	 * 
	 * @author Carlos Moreira
	 * @throws Exception
	 */
	public void selectFuelType(String fuelType) throws Exception {
		command.click(EnterVehicleData.cxFuelType());
		command.click(EnterVehicleData.fuelType(FuelType.valueOf(fuelType)));
	}
	
	/**
	 * Insere o valor no campo 'Payload [Kg]'
	 * 
	 * @author Carlos Moreira
	 * @param payload
	 * @throws Exception
	 */
	public void insertPayload(String payload) throws Exception {
		command.send(EnterVehicleData.inputPayload(), payload);
	}

	/**
	 * Insere o valor no campo 'Total Weight [kg]'
	 * 
	 * @author Carlos Moreira
	 * @param totalWeight
	 * @throws Exception
	 */
	public void insertTotalWeight(String totalWeight) throws Exception {
		command.send(EnterVehicleData.inputTotalWeight(), totalWeight);
	}
	
	
	/**
	 * Insere o valor no campo 'List Price'
	 * 
	 * @author Carlos Moreira
	 * @param valor
	 * @throws Exception
	 */
	public void insertListPrice(String valor) throws Exception {
		command.send(EnterVehicleData.listPrice(), valor);
	}

	/**
	 * Insere o valor no campo 'License Plate Number'
	 * 
	 * @author Carlos Moreira
	 * @param valor
	 * @throws Exception
	 */
	public void insertLicensePlateNumber(String valor) throws Exception {
		command.send(EnterVehicleData.licensePlateNumber(), valor);
	}

	/**
	 * Insere o valor no campo 'Annual Mileage [mi]'
	 * 
	 * @author Carlos Moreira
	 * @param valor
	 * @throws Exception
	 */
	public void insertAnnualMileage(String valor) throws Exception {
		command.send(EnterVehicleData.annualMileage(), valor);
	}

	/**
	 * Clica no botão 'Next'
	 * 
	 * @author Carlos Moreira
	 * @throws Exception
	 */
	public void btnNext() throws Exception {
		command.click(EnterVehicleData.btnNext());
	}
}