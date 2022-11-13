
public class Pizza {
	
	private static final String type1 = "Cheese";
	private static final String type2 = "Vegetable";
	private static final String type3 = "Pepperoni";
	
	private static final String topping1 = "Olives";
	private static final String topping2 = "Mushroom";
	private static final String topping3 = "Onion";
	private static final String topping4 = "ExtraCheese";
	
	private static final double priceType1 = 10.00;
	private static final double priceType2 = 12.00;
	private static final double priceType3 = 15.00;
	private static final double toppingPrice = 1.50;
	
	
	private String pizzaType;
	private String[] pizzaTopping = new String[4];
	private String pickupTime;
	private double pizzaPrice;
	

	
	public Pizza(String type, String[] topping, String time) {
		
		pizzaType = type;
		pizzaTopping = topping;
		pickupTime = time;
		
		calculatePrice();
	}
	
	public String getPizzaType() {
		
		return pizzaType;
	}
	
	public String[] getPizzaTopping() {
		
		return pizzaTopping;
	}
	
	public String getPickupTime() {
		
		return pickupTime;
	}
	
	public double getPizzaPrice() {
		
		return pizzaPrice;
	}
	

	
	private void calculatePrice() {
		
		pizzaPrice = 0;
	
		if(pizzaType.equals(type1))
			pizzaPrice = priceType1;
		
		else if(pizzaType.equals(type2))
			pizzaPrice = priceType2;
		
		else if(pizzaType.equals(type3))
			pizzaPrice = priceType3;
		
		for( int i = 0; i < 4; ++i) {
			
			if(pizzaTopping[i] != null && (pizzaTopping[i].equals(topping1) ||
					pizzaTopping[i].equals(topping2)||
					pizzaTopping[i].equals(topping3) ||
					pizzaTopping[i].equals(topping4)))
	
				pizzaPrice += toppingPrice;
						 							
		}
	}
	
	public String toString() {
		
		return String.format("%s\s%s\s%s",
				pizzaType, pizzaTopping[0] + "\s" + pizzaTopping[1] + 
				"\s" + pizzaTopping[2] + "\s" + pizzaTopping[3],
				pickupTime);
	}
}
