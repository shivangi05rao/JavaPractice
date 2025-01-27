package multithreading.poc;

import java.io.*;


public class FileThread extends Thread {
    @Override
    public void run() {
        String fileInput = "/Users/shivangi/Documents/Example/multithreading/input.txt";
        String fileOutput = "/Users/shivangi/Documents/Example/multithreading/output.txt";

        long startTime = System.currentTimeMillis();

        try (BufferedReader read = new BufferedReader(new FileReader(fileInput));
             BufferedWriter write = new BufferedWriter(new FileWriter(fileOutput))) {

            String line;
            while ((line = read.readLine()) != null) {
                write.write(line.toUpperCase());
                write.newLine();
            }
            System.out.println("File processing completed! Output saved in: " + fileOutput);

        } catch (IOException e) {
            System.out.println("Something went wrong!");
        }

        long endTime = System.currentTimeMillis();
        long timeTaken = endTime - startTime;
        System.out.println("Time taken for file processing: " + timeTaken + " milliseconds");
    }

    public static void main(String[] args) {
        FileThread fileThread = new FileThread();
        fileThread.start();
    }
}
