public class Coffee {
	Integer sugar;
	Integer water;
	Integer capacityMl;
	Integer capacityLeft;
	Boolean isEmpty;
	String intensity;
	
	//Constructor vacío
	//Por defecto
	Coffee(){}
	
	Coffee(Integer sugar,
			Integer capacityMl,
			String intensity
		   ){
		this.sugar = sugar;
		this.capacityMl = capacityMl;
		this.capacityLeft = capacityMl;
		this.intensity = intensity;
		this.water = capacityMl;
		this.isEmpty = false;
	}
	
	
	void prepare() {
		System.out.println(
		"Making coffee"		
		);
	}
	
	void drinkAll() {
		if(!isEmpty) {
			System.out.println(
			"Drinking All");
			isEmpty = true;
			capacityLeft = 0;
		}
		else {
			System.out.println
			("There's no coffee left");
		}
	}
	
	void drink
	(Integer ml) {
		if(capacityLeft >= ml) {
			System.out.println("Drinking");
			capacityLeft -= ml;
			if(capacityLeft == 0) {
				isEmpty = true;
			}
		}
		else {
			System.out.println
			("There's no coffee left");
		}
	}	
	
	void refill() {
		capacityLeft = capacityMl;
		isEmpty = false;
		System.out.println
		("Refilling");
	}
}
