Feature: Enter Vehicle Data 

Scenario Outline: Prencher tela Enther Vehicle Data 
	Given Que estou na página Enther Vehicle Data 
	When Preencho o formulário com os dados <Make> <Model> <Cylinder Capacity> <Engine Performance> <Date of Manufacture> <Number of Seats> <Right Hand Drive> <Fuel Type> <Payload> <Total Weight> <List Price> <License Plate Number> <Annual Mileage>
	And Clico em Next 
	Then Devo ir pra próxima tela 
	
	Examples: 
		| Make | Model				| Cylinder Capacity | Engine Performance | Date of Manufacture | Number of Seats | Right Hand Drive | Fuel Type | Payload | Total Weight |List Price | License Plate Number | Annual Mileage |
		| Audi | Scooter			| 10				|	20 				 | 02/3/2021 		   | Um 			 | Yes				| Petrol 	| 10	  | 100			 | 2000 	 | Teste 				| 100 			 |
