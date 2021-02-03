package page_object.enums;

import org.openqa.selenium.By;

public enum Model {
	SCOOTER(By.xpath("//*[@id='model']/option[@value='Scooter']"), "Scooter"),
	THREE_WHEELER(By.xpath("//*[@id='model']/option[@value='Three-Wheeler']"), "Three-Wheeler"),
	MOPED(By.xpath("//*[@id='model']/option[@value='Moped']"), "Moped"),
	MOTORCYCLE(By.xpath("//*[@id='model']/option[@value='Motorcycle']"), "Motorcycle");

	private Object[] option;

	Model(Object... vals) {
		option = vals;
	}

	public By getBy() {
		return (By) option[0];
	}

	public String getTexto() {
		return (String) option[1];
	}
}