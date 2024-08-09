    package strings;

    public class SearchCharInStringArray {
        static void searchAndPrint(String[] array, String searchValue) {
            int found = 0;
            for (int i = 0; i < array.length; i++) {
                if (array[i].contains(searchValue)) {
                    System.out.println(searchValue + " found at index: " + i);
                    found = 1;
                }
            }
            if (found==0) {
                System.out.println(searchValue + " NOT found in the list");
            }
        }

        public static void main(String[] args) {
            String[] p = {"25", "55", "888", "9", "30", "45"};

            String searchValue1 = "5";
            System.out.println("Searching for: " + searchValue1);
            searchAndPrint(p, searchValue1);

            String searchValue2 = "50";
            System.out.println("\nSearching for: " + searchValue2);
            searchAndPrint(p, searchValue2);
        }
    }
