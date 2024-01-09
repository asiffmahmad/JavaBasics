package filehandling;
import java.io.File;
import java.io.IOException;

public class FileMethodsExample {

    public static void main(String[] args) {
        // Specify the file path
        String filePath = "sampleFile.txt";

        // Create a File object
        File file = new File(filePath);

        // Method 1: Check if the file exists
        if (file.exists()) {
            System.out.println("Method 1: File exists: " + file.getName());
        } else {
            System.out.println("Method 1: File does not exist. Creating the file...");

            try {
                // Method 2: Create a new file
                file.createNewFile();
                System.out.println("Method 2: File created: " + file.getName());
            } catch (IOException e) {
                System.out.println("An error occurred while creating the file.");
                e.printStackTrace();
            }
        }

        // Method 3: Display file information
        System.out.println("Method 3: File path: " + file.getAbsolutePath());
        System.out.println("Method 3: Is directory? " + file.isDirectory());
        System.out.println("Method 3: Is file? " + file.isFile());
        System.out.println("Method 3: File size: " + file.length() + " bytes");

        // Method 4: List files in the same directory
        File directory = new File(file.getParent());
        System.out.println("\nMethod 4: Files in the same directory:");
        String[] filesInDirectory = directory.list();
        for (String fileName : filesInDirectory) {
            System.out.println(fileName);
        }

        // Method 5: Delete the file
        System.out.println("\nMethod 5: Deleting the file...");
        if (file.delete()) {
            System.out.println("Method 5: File deleted successfully.");
        } else {
            System.out.println("Method 5: Failed to delete the file.");
        }
    }
}
