package page_object.enums;

import org.openqa.selenium.By;

public enum NumberOfSeats {
	UM(By.xpath("//*[@id='numberofseats']/option[@value='1']"), "1"),
	DOIS(By.xpath("//*[@id='numberofseats']/option[@value='2']"), "2"),
	TRES(By.xpath("//*[@id='numberofseats']/option[@value='3']"), "3"),
	QUATRO(By.xpath("//*[@id='numberofseats']/option[@value='4']"), "4"),
	CINCO(By.xpath("//*[@id='numberofseats']/option[@value='5']"), "5"),
	SEIS(By.xpath("//*[@id='numberofseats']/option[@value='6']"), "6"),
	SETE(By.xpath("//*[@id='numberofseats']/option[@value='7']"), "7"),
	OITO(By.xpath("//*[@id='numberofseats']/option[@value='8']"), "8"),
	NOVE(By.xpath("//*[@id='numberofseats']/option[@value='9']"), "9");

	private Object[] option;

	NumberOfSeats(Object... vals) {
		option = vals;
	}

	public By getBy() {
		return (By) option[0];
	}

	public String getTexto() {
		return (String) option[1];
	}
}