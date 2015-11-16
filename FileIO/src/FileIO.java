import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileIO 
{

	public static void main(String[] args) throws Exception  
	{
		System.out.println("Hello World");

		try 
		{
			FileReader fileReader = new FileReader("C:\\Users\\lshyaam\\Documents\\Programming\\Input_Output_Lab.txt");
			String fileContents ="";
			int i;
			while((i = fileReader.read()) != -1)
			{
				char ch = (char)i;
				fileContents = fileContents + ch;
			}

			{
				fileReader.close();		
			}

			System.out.println(fileContents);
			String tmpStr = replaceMyString(fileContents);
			writeItBack(tmpStr);
		} 
		
		catch (FileNotFoundException fnfe)

		{
			System.out.println(fnfe.getMessage());
		}
	}

	private static String replaceMyString(String fileContents) {
		// TODO Auto-generated method stub
		return null;
	}

	private static void writeItBack(String tmpStr) throws IOException 
	{
		FileWriter fileWriter = new FileWriter("C:\\Users\\lshyaam\\Documents\\Programming\\Input_Output_Lab.txt");
		fileWriter.write(tmpStr);
		fileWriter.close();
	}
}