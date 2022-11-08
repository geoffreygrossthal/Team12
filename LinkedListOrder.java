package CSE360_SunDevilPizza;

public class LinkedListOrder {

		//private int size;
		private NodeOrder headList;
		
		public LinkedListOrder() {
			
			headList = null;
			
		}
		
		
		public boolean isEmpty() {
			
			if(headList == null)
				return true;
			return false;
		}
		
		public Order findOrder(int id) {
			
			NodeOrder current = headList;
			
			
			while(current != null) {
				if(current.data.getOrderID() == id)
					
					return current.data;
				
				current = current.next;
			}
			
			return null;
			
			
		}
		
		public void insertOrder(NodeOrder newOrder) {
			
			newOrder.next = headList;
			headList = newOrder;
		}
		
		
		
		
		public void deleteOrder(Order deleteOrder) {
			
			NodeOrder temp = headList;
			NodeOrder prev = null;
			
			if(temp.data.equals(deleteOrder) && temp != null)
			{
				headList = temp.next;
				return;
			}
			
			
			while(temp != null && !temp.data.equals(deleteOrder))
			{
				prev = temp;
				temp = temp.next;
			}
			
			if(temp == null)
				return;
			prev.next = temp.next;
			
		}

		
			/*for(NodeOrder i = headList; i != null; i = i.next) {
				
				NodeOrder willDel = i.next;
				
				if(willDel.data.equals(deleteOrder)) {
					
					i.next = willDel.next;
					willDel = null;
				}
			}
			*/
		
		
		//public String toString() {
			
			
		//}
		
		public String toString() {
			
			String ans = "";
			for (NodeOrder i = headList; i != null; i = i.next) {
				
				ans = ans + i.data.toString();
			}
			return ans;
			}
		}
		

