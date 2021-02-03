package page_object.enums;

import org.openqa.selenium.By;

public enum Make {
	AUDI(By.xpath("//*[@id='make']/option[@value='Audi']"), "Audi"),
	BMW(By.xpath("//*[@id='make']/option[@value='BMW']"), "BMW"),
	FORD(By.xpath("//*[@id='make']/option[@value='Ford']"), "Ford"),
	HONDA(By.xpath("//*[@id='make']/option[@value='Honda']"), "Honda"),
	MAZDA(By.xpath("//*[@id='make']/option[@value='Mazda']"), "Mazda"),
	MERCEDES_BENZ(By.xpath("//*[@id='make']/option[@value='Mercedes Benz']"), "Mercedes Benz"),
	NISSAN(By.xpath("//*[@id='make']/option[@value='Nissan']"), "Nissan"),
	OPEL(By.xpath("//*[@id='make']/option[@value='Opel']"), "Opel"),
	PORSHE(By.xpath("//*[@id='make']/option[@value='Porshe']"), "Porshe"),
	RENAULT(By.xpath("//*[@id='make']/option[@value='Renault']"), "Renault"),
	SKODA(By.xpath("//*[@id='make']/option[@value='Skoda']"), "Skoda"),
	SUZUKI(By.xpath("//*[@id='make']/option[@value='Suzuki']"), "Suzuki"),
	TOYOTA(By.xpath("//*[@id='make']/option[@value='Toyota']"), "Toyota"),
	VOLKSWAGEM(By.xpath("//*[@id='make']/option[@value='Volkswagen']"), "Volkswagen"),
	VOLVO(By.xpath("//*[@id='make']/option[@value='Volvo']"), "Volvo");

	private Object[] option;

	Make(Object... vals) {
		option = vals;
	}

	public By getBy() {
		return (By) option[0];
	}

	public String getTexto() {
		return (String) option[1];
	}
}