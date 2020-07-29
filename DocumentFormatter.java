package assign_eight ;
import java.io.*;
import java.util.*;
public class DocumentFormatter {
	public static void main(String ar[]) throws IOException {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the name of the file you want to create");
		String fileName = sc.next() + ".txt";
		File f = new File(fileName);
		f.createNewFile();
		BufferedWriter out = new BufferedWriter(new FileWriter(fileName, true));
		BufferedReader in = new BufferedReader(new FileReader("TopProverb.txt"));
		String str;
		while ((str = in.readLine()) != null) {
			str = str.trim().replaceAll("\\s+", " ");
			out.write(str);
			out.newLine();
			out.flush();
		}
	}
}