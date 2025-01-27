package multithreading.poc;

import java.io.*;
import java.nio.file.*;
import java.util.List;

public class FileTwoThread extends Thread {
    private final List<String> lines;
    private final String outputFile;

    public FileTwoThread(List<String> lines, String outputFile) {
        this.lines = lines;
        this.outputFile = outputFile;
    }

    @Override
    public void run() {
        try (BufferedWriter write = new BufferedWriter(new FileWriter(outputFile, true))) {
            for (String line : lines) {
                write.write(line.toUpperCase());
                write.newLine();
            }
        } catch (IOException e) {
            System.err.println("Error while writing: " + e.getMessage());
        }
    }

    public static void main(String[] args) throws IOException, InterruptedException {
        String fileInput = "/Users/shivangi/Documents/Example/multithreading/input.txt";
        String fileOutput = "/Users/shivangi/Documents/Example/multithreading/output.txt";

        List<String> allLines = Files.readAllLines(Paths.get(fileInput));

        Files.write(Paths.get(fileOutput), new byte[0]);

        int mid = allLines.size() / 2;
        List<String> firstHalf = allLines.subList(0, mid);
        List<String> secondHalf = allLines.subList(mid, allLines.size());

        long startTime = System.currentTimeMillis();

        FileTwoThread thread1 = new FileTwoThread(firstHalf, fileOutput);
        FileTwoThread thread2 = new FileTwoThread(secondHalf, fileOutput);

        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();

        long endTime = System.currentTimeMillis();
        System.out.println("File processing completed! Output saved in: " + fileOutput);
        System.out.println("Time taken for file processing with 2 threads: " + (endTime - startTime) + " milliseconds");
    }
}