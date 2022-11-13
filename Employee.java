// Author: Dac Vien Le (Eric)
// Data: 11.08.2022
// Description: abtract class that contains information of an employee
// 				EmployeeName, EmployeeID, 
//				LinkedListOrder 

import java.io.*;
import java.util.Scanner;

abstract class Employee
{
	// General information of an Employee
	private String name;
	private int id;
	protected LinkedListOrder list;

	// File manipulate class
	private static Scanner infile;
	private static File file;
	private FileWriter ofile;
	
	// general information created
	public Employee(String name, int id, LinkedListOrder list)
	{
		this.name = name;
		this.id = id;
		this.list = list;
	}

	public Employee(String name, int id)
	{
		this.name = name;
		this.id = id;
		list = new LinkedListOrder();
	}
	
	public String getName()
	{
		return name;
	}
	
	public int getEmployeeID()
	{
		return id;
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

	public int getASUID(int id)
	{
		return list.findOrder(id).getCustomer().getID();
	}

	public double getPizzaPrice(int id)
	{
		return list.findOrder(id).getPizza().getPizzaPrice();
	}

	
	/* 
	public static boolean verifyEmployeeID(String ename, int eID)
	{
		// check from Employee.txt
		try {
			file = new File("Employee.txt");
			infile = new Scanner(file);

			String id;
			while (infile.hasNext())
			{
				id = infile.next();
				if (eID.equals(id)))
					return true;
			}

			return false;

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		return false;
	}*/

	public static boolean verifyEmployeeID(String eID)
    {
        // check from Employee.txt
        try {
            file = new File("Employee.txt");
            infile = new Scanner(file);

            String id;
            while (infile.hasNext())
            {
                id = infile.next();
                if (eID.equals(id))
                    return true;
            }

            return false;

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return false;
    }

	// No parameters needed. The whole file will be rewrite
	public void saveOrders()
	{
		try {
			ofile = new FileWriter("PizzaOrders.txt");
			ofile.write(list.toString());
			ofile.close();
			
		} catch (IOException e){
			e.printStackTrace();
		}
	}

	public void addOrder (int orderID, int orderStatus, String pizzaType, String[] topping,
			String pickUpTime, int asuID, String email)
	{
		Pizza pizza = new Pizza(pizzaType, topping, pickUpTime);
		ASU_Student customer = new ASU_Student(asuID, email);
		Order order = new Order(orderID, customer, pizza);
		list.insertOrder(new NodeOrder(order));
	}

	public void updateStatus(int id, int status)
	{
		list.findOrder(id).setStatus(status);
	}

}
