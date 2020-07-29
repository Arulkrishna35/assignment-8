package assign_eight;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ProverbCollection {

	public static void main(String[] args) throws IOException{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter proverbs and type '0' to exit");
		String st = "";
		while(true) {
			st = scan.nextLine();
			if(st.equals("0"))
				break;
			else
				storeProverb(st);
		}
		scan.close();
	}
	static void storeProverb(String str) throws IOException{
		BufferedWriter b= new BufferedWriter(new FileWriter("TopProverbs.txt",true));
		b.write(str);
		b.newLine();
		b.flush();
		b.close();
	}
}