
import java.io.*;
import java.util.Scanner;

class WriteToFile
{
	// File manipulate class
	//private Scanner infile;
	//private File file;
	//private FileWriter ofile;

	// array of String
	//private String orders;

	public static void addNewOrder(String order)
	{
		// read all data in file, then add new order
		try {
			File file = new File("PizzaOrders.txt");
			Scanner infile = new Scanner(file);
			String orders = "";
			String temp;
			while (infile.hasNextLine())
			{
				
				temp = infile.nextLine();
				orders = orders + temp;
				orders = orders + "\n";
			}
			orders = orders+order;
			infile.close();
			FileWriter ofile = new FileWriter("PizzaOrders.txt");
			ofile.write(orders);
			ofile.close();

		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}