//
//
//
//
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

class Processing_Agent extends Employee
{
	private Scanner infile;
	private File file;

	public Processing_Agent (String name, int id, LinkedListOrder list)
	{
		super(name, id, list);
	}

	// this constructor automatically read all data from NewOrder.txt
	public Processing_Agent(String name, int id)
	{
		super(name, id);

		String pizzaType, pickUpTime, email;
		String topping[] = new String[4];
		int asuID, orderID, orderStatus;

		try {
			file = new File("PizzaOrders.txt");
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

				super.addOrder(orderID, orderStatus, pizzaType, topping, pickUpTime, asuID, email);
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

	}

	public boolean verifyOrder(int orderID)
	{
		int asuID = super.getStudentID(orderID);
		if (ASU_Student.verifyASUID(asuID))
		{
			list.findOrder(id).setStatus(1);
			return true;
		}
		return false;
	}
}