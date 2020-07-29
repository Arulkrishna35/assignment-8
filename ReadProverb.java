package assign_eight;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadProverbs {
	public static void main(String[] args) throws IOException {
		try (BufferedReader b = new BufferedReader(new FileReader("M:\\File\\TopProverbs.txt"))) {
			String s;
			while((s=b.readLine())!=null)
					System.out.println(s);
		}
		catch (Exception e)
		{
			System.out.println(e);
		}}}
