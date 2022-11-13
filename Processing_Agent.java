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
			file = new File("C:/Users/levie/Documents/Java_file/ASU_Pizza_Order/src/PizzaOrders.txt");
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

				System.out.println(orderID + orderStatus + 
					pizzaType + topping[0] + pickUpTime + asuID);

				super.addOrder(orderID, orderStatus, pizzaType, topping, pickUpTime, asuID, "@dvien");
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

	}

	public boolean verifyOrder(int orderID)
	{
		int asuID = super.getASUID(orderID);
		if (ASU_Student.verifyASUID(asuID))
		{
			super.updateStatus(orderID, 1);
			return true;
		}
		return false;
	}
}
