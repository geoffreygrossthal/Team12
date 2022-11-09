//
//
//
//
//
class Chef_Agent
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
			file = new File("Orders.txt");
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
}