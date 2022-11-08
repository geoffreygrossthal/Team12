//
//
//
//
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

class Processing_Agent
{
	private Scanner infile;
	private File file;
	private LinkList list;

	public Processing_Agent (LinkList list)
	{
		this.list = list;
	}

	// this constructor automatically read all data from NewOrder.txt
	public Processing_Agent()
	{
		list = new LinkList();
		String pizzaType, pickUpTime, email;
		String topping[] = new String[4];
		int asuID, orderID, orderStatus;

		try {
			file = new File("NewOrder.txt");
			infile = new Scanner(file);

			while (infile.hasNextLine())
			{
				orderID = infile.nextInt();
				orderStatus = infile.nextInt();
				pizzaType = infile.next();
				for (int i = 0; i < 4; ++i)
					topping[i] = infile.next();
				pickUpTime = infile.next();
				asuID = infile.nextInt();
				email = infile.next();


				Pizza pizza = new Pizza(pizzaType, topping, new Time(pickUpTime));
				ASU_Student customer = new ASU_Student(asuID, email);
				Order order = new Order(orderID, customer, orderStatus, pizza);
				list.insertOrder(new NodeOrder (order));

			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

	}

	public int[] getIdList()
	{
		return list.getIdList();
	}

	public int getOrderStatus(int id)
	{
		return list.findOrder(id).getStatus();
	}

	public String[] getTopping(int id)
	{
		return list.findOrder(id).getPizza().getPizzaTopping();
	}

	public String getPickupTime(int id)
	{
		return list.findOrder(id).getPizza().getPickupTime();
	}

	public String getPizzaType(int id)
	{
		return list.findOrder(id).getPizza().getPizzaType();
	}

	public String getEmail(int id)
	{
		return list.findOrder(id).getCustomer().getEmail();
	}

	public int getStudentID(int id)
	{
		return list.findOrder(id).getCustomer().getID();
	}

	public void addOrder (Order order)
	{
		list.insertOrder (new NodeOrder(order));
	}

	// No parameters needed. The whole file will be rewrite
	public void saveAcptOrder()
	{
		try {
			myWriter = new FileWriter("PizzaOrder.txt");
			myWriter.write(list.toString());
			myWriter.close();
			
		} catch (IOException e){
			e.printStackTrace();
		}
		
	}

	public boolean verifyOrder (Order order)
	{
		int id = order.getCustomer().getID();
		if (verifyID(id))
		{
			list.findOrder(id).setStatus(1);
			return true;
		}
		return false;
	}

	private boolean verifyID (int asuID)
	{
		// check from ASUID.txt
		try {
			file = new File("ASUID.txt");
			infile = new Scanner(file);

			int id;
			while (infile.hasNext())
			{
				id = infile.nextInt();
				if (id == asuID)
					return true;
			}

			return false;

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		return false;
	}

	private boolean employeeLogin()
	{

		return false;
	}
}
