import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

public class Main 
{ 

	public static void main(String[] args) 
	{
		File file = null;
		// Check that the an argument is passed and that the argument is a filed
		if(args.length == 0)
		{
			System.out.println("No file has been passed");
			System.exit(0);
		}
		else
		{
			file = new File(args[0]);
			if(!file.exists())
			{
				System.out.println("The file does not exist");
				System.exit(0);
			}
		}
		
		// Store the contents of the file into a string
		String fileContent = null;
		try 
		{
			fileContent = new String(Files.readAllBytes(file.toPath()));
		} 
		catch (IOException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		 
		
	}

}
