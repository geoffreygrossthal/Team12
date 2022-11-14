import java.io.*;
import java.util.Scanner;

class WriteToFile
{
	public static void addNewOrder(String order)
	{
		// read all data in file, then add new order at the end of the file
		try {
			File file = new File("C:/Users/Dave/Documents/csc360/Team12-main/PizzaOrders.txt");
			Scanner infile = new Scanner(file);
			String orders = "";
			String temp;
			while (infile.hasNext())
			{
				
				temp = infile.nextLine();
				orders = orders + temp;
				orders = orders + "\n";
			}
			orders = orders+order;
			infile.close();
			FileWriter ofile = new FileWriter("C:/Users/Dave/Documents/csc360/Team12-main/PizzaOrders.txt");
			ofile.write(orders);
			ofile.close();

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public static String orderIDgen()
	{
		int newID = 0;
        try {
			File file = new File("C:/Users/Dave/Documents/csc360/Team12-main/OrdersID.txt");
			try (Scanner infile = new Scanner(file)) {
				while (infile.hasNext())
				{
					newID = infile.nextInt();
				}
				infile.close();
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		newID++;
        return String.format("%d", newID);
	}

	public static void writeOrderID (String id)
	{
		// read all data in file, then add new order at the end of the file
		try {
			File file = new File("C:/Users/Dave/Documents/csc360/Team12-main/OrdersID.txt");
			Scanner infile = new Scanner(file);
			String orders = "";
			String temp;
			while (infile.hasNext())
			{
				temp = infile.next();
				orders = orders + temp;
				orders = orders + "\n";
			}
			orders = orders + id;
			infile.close();
			FileWriter ofile = new FileWriter("C:/Users/Dave/Documents/csc360/Team12-main/OrdersID.txt");
			ofile.write(orders);
			ofile.close();

		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
