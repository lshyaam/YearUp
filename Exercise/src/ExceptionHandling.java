public class ExceptionHandling {

	public static void main(String[] args) {
	{
		try
		{
		int[] numbers = null;		
		AddArray(numbers);
	}
catch (ArrayIndexOutOfBoundsException ar)
		{
	System.out.println("I tried to access a location in an array that did not exist");
	ar.printStackTrace();
		}
		catch(NullPointerException np)
		{
			System.out.println("I gave a null array.");
		}
}
	}
	private static void AddArray(int[] numbers) 
	{
		int sum = 0;
		
		if (numbers == null)
		{
			System.out.println("The input to add array was a null array");
			throw new NullPointerException();
		}
	
		for (int i = 0; i <=numbers.length; i++)
		{
			sum = sum + numbers[i];
		}
			System.out.println("Sum is: " + sum);
	}
}