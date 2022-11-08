package CSE360_SunDevilPizza;

public class Pizza {
	
	private static final String type1 = "Cheese";
	private static final String type2 = "Veggie";
	private static final String type3 = "Pepperoni";
	
	private static final String topping1 = "Olive";
	private static final String topping2 = "Mushroom";
	private static final String topping3 = "Onion";
	private static final String topping4 = "ExtraCheese";
	
	private static final double priceType1 = 10.00;
	private static final double priceType2 = 12.00;
	private static final double priceType3 = 15.00;
	private static final double toppingPrice = 1.50;
	
	
	private String pizzaType;
	private String[] pizzaTopping = new String[4];
	private Time pickupTime;
	private double pizzaPrice;
	

	
	public Pizza(String type, String[] topping, Time time) {
		
		pizzaType = type;
		pizzaTopping = topping;
		pickupTime = time;
		
		
		
	}
	
	public String getPizzaType() {
		
		return pizzaType;
	}
	
	public String[] getPizzaTopping() {
		
		return pizzaTopping;
	}
	
	public Time getPickupTime() {
		
		return pickupTime;
	}
	
	public double getPizzaprice() {
		
		return pizzaPrice;
	}
	

	
	public double calculatePrice() {
		
		double totalPrice = 0;
	
		if(pizzaType.equals(type1))
			totalPrice = priceType1;
		
		else if(pizzaType.equals(type2))
			totalPrice = priceType2;
		
		else if(pizzaType.equals(type3))
			totalPrice = priceType3;
		
		for( int i = 0; i < 4; ++i) {
			
			if(pizzaTopping[i] != null && (pizzaTopping[i].equals(topping1) ||
					pizzaTopping[i].equals(topping2)||
					pizzaTopping[i].equals(topping3) ||
					pizzaTopping[i].equals(topping4)))
	
				totalPrice += toppingPrice;
						 							
		}
		
		
		return totalPrice;
		
	}
	
	public String toString() {
		
		return String.format("%s\s%s\s%s",
				pizzaType, topping1 + "\s" + topping2 + "\s" + topping3 + "\s" + topping4,
				pickupTime.toString());
	}
}
