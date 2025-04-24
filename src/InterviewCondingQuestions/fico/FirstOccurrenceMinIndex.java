package InterviewCondingQuestions.fico;

import java.util.*;

public class FirstOccurrenceMinIndex { //O(n)
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(2, 4, 8, 7, 8, 2);
        Map<Integer, Integer> firstIndexMap = new HashMap<>();
        Set<Integer> duplicates = new HashSet<>();

        int minIndex = Integer.MAX_VALUE;
        int result = -1;

        for (int i = 0; i < nums.size(); i++) {
            int num = nums.get(i);
            if (firstIndexMap.containsKey(num)) {
                if (!duplicates.contains(num)) {
                    duplicates.add(num);
                    int firstIndex = firstIndexMap.get(num);
                    if(firstIndex < minIndex) {
                        minIndex = firstIndex;
                        result = num;
                    }
                }
            } else {
                firstIndexMap.put(num, i);
            }
        }
        System.out.println(result);
    }
}
