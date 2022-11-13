import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

//
//
//
//
//
class Chef_Agent extends Employee
{
	private Scanner infile;
	private File file;

	public Chef_Agent(String name, int id, LinkedListOrder list)
	{
		super(name, id, list);
	}

	public Chef_Agent(String name, int id)
	{
		super(name, id);

		String pizzaType, pickUpTime, email;
		String topping[] = new String[4];
		int asuID, orderID, orderStatus;

		try {
			file = new File("C:/Users/levie/Documents/Java_file/ASU_Pizza_Order/src/PizzaOrders.txt");
			infile = new Scanner(file);

			while (infile.hasNext())
			{
				orderID = infile.nextInt();
				orderStatus = infile.nextInt();
				pizzaType = infile.next();
				for (int i = 0; i < 4; ++i)
					topping[i] = infile.next();
				pickUpTime = infile.next();
				asuID = infile.nextInt();

				super.addOrder(orderID, orderStatus, pizzaType, topping, pickUpTime, asuID, "");
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

	}
}
