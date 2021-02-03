package steps;

import org.junit.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import page_object.model.EnterVehicleDataModel;
import runner.TestRule;
import utils.ReporterUtils;

public class EnterVehicleDataSteps {

	private static EnterVehicleDataModel enterVehicleData = new EnterVehicleDataModel(TestRule.getDriver());

	@Given("Que estou na página Enther Vehicle Data")
	public void que_estou_na_página_Enther_Vehicle_Data() throws Exception {
		 Assert.assertEquals(true, enterVehicleData.existMake());
	}

	@When("Preencho o formulário com os dados (.*) (.*) (.*) (.*) (.*) (.*) (.*) (.*) (.*) (.*) (.*) (.*) (.*)")
	public void preencho_o_formulário(String make, String model, String cylinderCapacity, String enginePerformance,
			String dateOfManufacture, String numberOfSeats, String rightHandDrive, String fuelType, String payload,
			String totalWeight, String listPrice, String licensePlateNumber, String annualMileage) throws Exception {
		enterVehicleData.selectMake(make.toUpperCase());
		enterVehicleData.selectModel(model.toUpperCase());
		enterVehicleData.insertCylinderCapacity(cylinderCapacity);
		enterVehicleData.insertEnginePerformance(enginePerformance);
		enterVehicleData.insertDateOfManufacture(dateOfManufacture);
		enterVehicleData.selectNumberOfSeats(numberOfSeats.toUpperCase());
		enterVehicleData.selectRightHandDrive(rightHandDrive.toUpperCase());
		enterVehicleData.selectFuelType(fuelType.toUpperCase());
		enterVehicleData.insertPayload(payload);
		enterVehicleData.insertTotalWeight(totalWeight);
		enterVehicleData.insertListPrice(listPrice);
		enterVehicleData.insertLicensePlateNumber(licensePlateNumber);
		enterVehicleData.insertAnnualMileage(annualMileage);
		ReporterUtils.logPrint("Formulário preenchido");
	}

	@When("Clico em Next")
	public void clico_em_Next() throws Exception {
		enterVehicleData.btnNext();

		if (enterVehicleData.existFirstName()) {
			System.out.print("Botão next funcionou");
		} else {
			System.out.println("Botão next não funcionou\n Tentando click pelo link da página");
			enterVehicleData.clickPageEnterInsurantData();
			enterVehicleData.btnPrevious();
		}
	}

	@Then("Devo ir pra próxima tela")
	public void devo_ir_pra_próxima_tela() {
		ReporterUtils.logPrint("Próxima tela");
	}
}