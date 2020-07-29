package assign_eight;

import java.io.File;

public class FolderInfo {
	static void printDirectory(String path)
	{
		int cnt=0;
		File file1 = new File(path);
		File[] fileList = file.listFiles();
		for (File file1 : fileList) {
			if (file.isFile()) {

				System.out.println("File :"+file.getName());
				System.out.println("Absoloute Path :"+file.getAbsolutePath());
				System.out.println("Folder Path :"+file.getParent());
				cnt=1;
			}
			if(file.isDirectory()) {
				System.out.println("Directory: "+file.getName());
				System.out.println("Folder Path :"+file.getParent());
				cnt=1;
			}
		}
		if(cnt==0)
			System.out.println("No Folder exists in the given name");
	}
	public static void main(String args[])
	{
		printDirectory("D:\\File\\Badminton");
	}

}
