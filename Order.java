package CSE360_SunDevilPizza;

public class Order {
	
	private int orderId;
	private ASU_Student customer;
	private int orderStatus;
	private Pizza pizza;
	
	
	public Order(int orderId, ASU_Student customer,Pizza pizza) {
		
		this.orderId = orderId;
		this.customer = customer;
		//this.orderStatus = orderStatus;
		this.pizza = pizza;
		
	}
	
	public int getStatus() {
		
		return orderStatus;
	}
	
	public int getOrderID() {
		
		return orderId;
	}
	
	public ASU_Student getCustomer() {
		
		return customer;
	}
	
	public Pizza getPizza() {
		
		return pizza;
	}
	
	public void setStatus(int status) {
		
		
		orderStatus = status;
		// 0: not verified
		// 1: Verified/ ready to cook
		// 2: Cooking
		// 3: Finished/ ready for pickup
		
		
	}
	
	public String toString(){
		/*
		 * The New Order file contains information in this order:
		 *  OrderID, OrderStatus, PizzaType, topping1, topping2, 
		 *  topping3, topping4, pickUpTime, ASU_ID, email 
		 */
		return String.format( "%s\s%s\s%s\s%s",
				 orderId,orderStatus,pizza.toString(), customer.toString());
	}
}
