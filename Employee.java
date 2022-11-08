


class Employee
{
	private String name;
	private int id;
	
	public Employee(String name, int id)
	{
		this.name = name;
		this.id = id;
	}
	
	public String getName()
	{
		return name;
	}
	
	public int getID()
	{
		return id;
	}
	
	public static boolean verifyEmployeeID(String ename, int eID)
	{
		// check from Employee.txt
		try {
			file = new File("Employee.txt");
			infile = new Scanner(file);

			int id;
			String name;
			while (infile.hasNext())
			{
				id = infile.nextInt();
				name = infile.next();
				if (id == eID && ename.equals(name))
					return true;
			}

			return false;

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		return false;
	}
	
}