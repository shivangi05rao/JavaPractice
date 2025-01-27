package multithreading.poc;

import java.io.*;

public class MultipleLineFile {
    public static void main(String[] args) throws IOException {
        String fileInput = "/Users/shivangi/Documents/Example/multithreading/input.txt";
        String fileOutput = "/Users/shivangi/Documents/Example/multithreading/output.txt";

        long startTime = System.currentTimeMillis();

        BufferedReader read = new BufferedReader(new FileReader(fileInput));
        BufferedWriter write = new BufferedWriter(new FileWriter(fileOutput));

        String line;
        while ((line = read.readLine()) != null) {
            write.write(line.toUpperCase());
            write.newLine();
        }
        System.out.println("File processing completed! Output saved in: " + fileOutput);

        long endTime = System.currentTimeMillis();

        long timeTaken = endTime - startTime;
        System.out.println("Time taken for file processing: " + timeTaken + " milliseconds");
    }
}
