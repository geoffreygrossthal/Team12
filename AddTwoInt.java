// Author: Dac Vien Le
// Date: 10.3.2022
// Description: Add two integer. Testing uploading class onto GitHub

class AddTwoInt{
	private int answer;
	public static int add(int a, int b)
	{
		return a+b;
	}
	
	public static void main (String[] args)
	{
		for (int i = 0; i < args.length; ++i){
			System.out.println(args[i]);
		}
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		
		System.out.println(AddTwoInt.add(a, b));
	}
}