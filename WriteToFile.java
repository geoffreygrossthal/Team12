

import java.io.*;
import java.util.Scanner;

class WriteToFile
{
	// File manipulate class
	private Scanner infile;
	private File file;
	private FileWriter ofile;

	// array of String
	private String orders;

	public static void addNewOrder(String order)
	{
		// read all data in file, then add new order
		try {
			file = new File("PizzaOrders.txt");
			infile = new Scanner(file);

			orders = order;
			String temp;
			while (infile.hasNextLine())
			{
				orders = orders + "\n";
				temp = infile.nextLine();
				orders = orders + temp;
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		// after adding new order, write it back to file
		try {
			ofile = new FileWriter("PizzaOrders.txt");
			ofile.write(orders);
			ofile.close();
			
		} catch (IOException e){
			e.printStackTrace();
		}
	}
}