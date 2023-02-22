
public class TestingCoffee {
	public static void main(String[] args) {
		//Constructor con parámetros
		Coffee coffee = new Coffee(20, 250, "Dark");
		
		//Constructor vacío
		//Coffee defaultCoffee = new Coffee();
		
		coffee.drinkAll();
		coffee.refill();
		coffee.drinkAll();
		coffee.drink(15);
		
		//Taza
		if(coffee.isEmpty) {
			coffee.refill();
		}
		else {
			coffee.drinkAll();
		}
	}
}
