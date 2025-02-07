package com.tit.inputstreamreader.readuserinputandwrite;
import java.io.*;

public class UserInputToFile {

    public static void main(String[] args) {
        String filePath = "C:\\Users\\rajgu\\OneDrive\\Desktop\\user_input.txt";

        // Create InputStreamReader wrapped in BufferedReader for reading user input
        try (InputStreamReader isr = new InputStreamReader(System.in);
             BufferedReader reader = new BufferedReader(isr);
             FileWriter fileWriter = new FileWriter(filePath)) {

            System.out.println("Enter text (type 'exit' to stop):");

            String userInput;
            while (true) {
                userInput = reader.readLine(); // Read a line of input
                if (userInput == null || userInput.equalsIgnoreCase("exit")) {
                    break; // Exit the loop if "exit" is entered or input is null
                }
                fileWriter.write(userInput + "\n"); // Write the input to the file
            }

            System.out.println("Input has been written to " + filePath);

        } catch (IOException e) {
            System.err.println("An error occurred: " + e.getMessage());
        }
    }
}