package javatraining.filesassignment;

import java.io.File;


//import java.io.FileNotFoundException;
//import java.io.FileOutputStream;
//import java.io.IOException;
public class SearchNonRecursively {

	public static void main(String[] args) {

		String searchDirectory = args[0];
		String fileExtension = args[1];

		File directory = new File(searchDirectory);

		if (!directory.isDirectory()) {
			System.out.println("Error Directory not found");
			return;
		}

		File[] files = directory.listFiles();
		if (files != null) {
			System.out.println(searchDirectory + " is present in the directory");
			for (File file : files) {
				if (file.listFiles() != null) {
					System.out.println("file is present in the folder");
				} else if (file.getName().endsWith(fileExtension)) {
					System.out.println(file.getName() + " is the file you searched");

				}
			}
			if (files == null || files.length == 0) {
				System.out.println("No files found with extension '" + fileExtension + "' in " + searchDirectory);
			}
		}

	}

}
