package CSE360_SunDevilPizza;

public class NodeOrder {

		Order data;
		NodeOrder next;
		
		public NodeOrder(Order order) {
			
			data = order;
			next = null;
		}
}
