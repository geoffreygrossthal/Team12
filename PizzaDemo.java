package CSE360_SunDevilPizza;

public class PizzaDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Time time = new Time();
		time.setTime(13, 27);
		System.out.println("valid:");
		System.out.println(time.toUniversalString());
		System.out.println(time.toString());
		System.out.println("invalid:");
		time.setTime(99, 99);
		System.out.println(time.toUniversalString());
		System.out.println(time.toString());
		
		ASU_Student customer = new ASU_Student();
		System.out.println("")	*/
		
		String pizzaType = "Cheese";
		String topping[] = new String [4];
		topping[0] = "Olive";
		topping[1] = "Mushroom";
		
		
		Time time = new Time(10,20);
		
		Pizza mypizza = new Pizza(pizzaType, topping, time);
		Pizza babypizza = new Pizza("Veggie", topping, time);
		Pizza taffypizza = new Pizza("Pepperoni", topping, time);
		
		System.out.println("TotalPrice of Order: ");
		mypizza.calculatePrice();
		babypizza.calculatePrice();
		taffypizza.calculatePrice();
		
		
		
		System.out.println(mypizza.calculatePrice());
		System.out.println(babypizza.calculatePrice());
		System.out.println(taffypizza.calculatePrice());
		System.out.println("------------------------");
		
		ASU_Student customer = new ASU_Student(1010101010, "dvle3@asu.edu");
		ASU_Student baby = new ASU_Student(2020202020, "jmyan@asu.edu");

		
		Order myOrder = new Order(100, customer, mypizza);
		Order mybaby = new Order(101, baby, babypizza);
		
		System.out.println(myOrder.toString());

		LinkedListOrder list = new LinkedListOrder();
		list.insertOrder(new NodeOrder(myOrder));
		list.insertOrder(new NodeOrder(mybaby));
		
	}

}
