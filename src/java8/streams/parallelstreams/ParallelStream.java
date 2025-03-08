package java8.streams.parallelstreams;

import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Stream;

public class ParallelStream {
    public static void main(String[] args) {
        //Using stream
        long startTime = System.currentTimeMillis();
        List<Integer> list = Stream.iterate(1, x -> x + 1).limit(20000).toList();
        List<Long> factorialsList = list.stream().map(ParallelStream::fact).toList();
        long endTime = System.currentTimeMillis();
        long currentTime = endTime - startTime;
        System.out.println("Time taken with sequential stream: " + currentTime + "ms");

        //Using parallel stream
        startTime = System.currentTimeMillis();
        factorialsList = list.parallelStream().map(ParallelStream::fact).toList();
        endTime = System.currentTimeMillis();
        currentTime = endTime - startTime;
        System.out.println("Time taken with parallel stream: " + currentTime + "ms");

        List<Integer> list1 = Arrays.asList(1, 2, 3, 4, 5);
        AtomicInteger sum = new AtomicInteger(0);
        List<Integer> cumulativeSum = list1.parallelStream().map(x -> sum.addAndGet(x)).toList();
        System.out.println(cumulativeSum);
    }

    private static long fact(int n) {
        long result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }
}
