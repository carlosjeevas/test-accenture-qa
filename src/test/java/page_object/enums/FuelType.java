package page_object.enums;

import org.openqa.selenium.By;

public enum FuelType {
	PETROL(By.xpath("//*[@id='fuel']/option[@value='Petrol']"), "Petrol"),
	DIESEL(By.xpath("//*[@id='fuel']/option[@value='Diesel']"), "Diesel"),
	ELETRIC_POWER(By.xpath("//*[@id='fuel']/option[@value='Eletric Power']"), "Eletric Power"),
	GAS(By.xpath("//*[@id='fuel']/option[@value='Gas']"), "Gas"),
	OTHER(By.xpath("//*[@id='fuel']/option[@value='Other']"), "Other");

	private Object[] option;

	FuelType(Object... vals) {
		option = vals;
	}

	public By getBy() {
		return (By) option[0];
	}

	public String getTexto() {
		return (String) option[1];
	}
}