package collectionFramework.hashmap.question;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class HashMapStockPriceQuestion {
    static class TheHighestStockPrice {
        public static void main(String[] args) {
            Map<String, Integer> stockPrice = new HashMap<>();
            stockPrice.put("Oracle", 56);
            stockPrice.put("Fiserv", 117);
            stockPrice.put("BMW", 73);
            stockPrice.put("Microsoft", 213);
            stockPrice.put("Google", 421);
            stockPrice.put("Ford", 456);
            stockPrice.put("Novartis", 43);
            stockPrice.put("TCS", 23);

            int max = 0;
            String company = "";

            for (Map.Entry<String, Integer> entry : stockPrice.entrySet()) {
                if (entry.getValue() > max) {
                    company = entry.getKey();
                    max = entry.getValue();
                }
            }
            System.out.println("The company with highest stock price is: " + company);
        }
    }
    static class AverageStockPrice {
        public static void main(String[] args) {
            Map<String, Integer> stockPrice1 = new HashMap<>();
            stockPrice1.put("Oracle", 56);
            stockPrice1.put("Fiserv", 117);
            stockPrice1.put("BMW", 73);
            stockPrice1.put("Microsoft", 213);
            stockPrice1.put("Google", 421);
            stockPrice1.put("Ford", 456);
            stockPrice1.put("Novartis", 43);
            stockPrice1.put("TCS", 23);

            Collection<Integer> values = stockPrice1.values();
            System.out.println(values);
            int sum = 0;
            for (int i : values){
                sum += i;
            }
            System.out.println("The average stock price is: " + sum / values.size());
        }
    }

    static class removeCompaniesBelow50 {
        public static void main(String[] args) {
            Map<String, Integer> stockPrice = new HashMap<>();
            stockPrice.put("Oracle", 56);
            stockPrice.put("Fiserv", 117);
            stockPrice.put("BMW", 73);
            stockPrice.put("Microsoft", 213);
            stockPrice.put("Google", 421);
            stockPrice.put("Ford", 456);
            stockPrice.put("Novartis", 43);
            stockPrice.put("TCS", 23);

            stockPrice.entrySet().removeIf(entry1 -> entry1.getValue() < 50);
//            Iterator<Map.Entry<String , Integer>> itr = stockPrice.entrySet().iterator();
//            while (itr.hasNext()){
//                Map.Entry<String , Integer> entry1 = itr.next();
//                if (entry1.getValue() < 50){
//                    itr.remove();
//                }
//            }
            System.out.println(stockPrice);
        }
    }
}
