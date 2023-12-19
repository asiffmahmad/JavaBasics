package filehandling;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class writingIntoFiles {

    public static void main(String[] args) {
        try {
            // Specify the file path
            File file = new File("C:\\Users\\asiff\\OneDrive\\Desktop\\java\\newfile.txt");

            // Method 1: Check if the file exists
            if (file.exists()) {
                System.out.println("Method 1: File already exists.");
            } else {
                // Method 2: Create a new file
                boolean isFileCreated = file.createNewFile();

                if (isFileCreated) {
                    System.out.println("Method 2: File created successfully.");
                } else {
                    System.out.println("Method 2: File already exists.");
                }
            }

            // Method 3: Get absolute path
            System.out.println("Method 3: Absolute path: " + file.getAbsolutePath());

            // Method 4: Get file name
            System.out.println("Method 4: File name: " + file.getName());

            // Method 5: Get parent directory
            System.out.println("Method 5: Parent directory: " + file.getParent());

            // Create a BufferedWriter to write into the file
            BufferedWriter writer = new BufferedWriter(new FileWriter(file));

            // Method 6: Write the string into the file
            writer.write("asiff in");
            writer.newLine(); // Add a new line
            writer.write("asiff in");
            writer.write("124asiff in");
            writer.write("asiff in");
            // Method 7: Close the BufferedWriter to release resources
            writer.close();

            System.out.println("Method 6: Data written successfully.");

            // Method 8: Read from the file using BufferedReader
            BufferedReader reader = new BufferedReader(new FileReader(file));
            String line;
            System.out.println("Method 8: Reading from the file:");
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
            reader.close();

            // Method 9: Delete the file
			/*
			 * if (file.delete()) {
			 * System.out.println("Method 9: File deleted successfully."); } else {
			 * System.out.println("Method 9: Failed to delete the file."); }
			 */

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
