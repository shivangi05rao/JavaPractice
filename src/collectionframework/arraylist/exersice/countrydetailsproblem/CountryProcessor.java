package collectionframework.arraylist.exersice.countrydetailsproblem;

import java.util.Comparator;
import java.util.List;

public class CountryProcessor {
    public void printCountryNames(List<CountryDetails> countryDetails){
//        for (int i = 0; i < countryDetails.size(); i++){
//            CountryDetails countryDet = countryDetails.get(i);
//            System.out.println(countryDet.getName());
//        }

        //using stream
       /* countryDetails
                .forEach(countryDetails1 -> System.out.println(countryDetails1.getName()));
        */
        //Using enhanced for loop
        for (CountryDetails countryDetails1 : countryDetails){
            System.out.println("Names of country: " + countryDetails1.getName());
        }
    }

    public void printEnglishSpeakingCountry(List<CountryDetails> countryDetails){
//        for (int i = 0; i<countryDetails.size(); i++){
//            CountryDetails countryDetails1 = countryDetails.get(i);
//            if (countryDetails1.getOfficialLanguage().equals("English")){
//                System.out.println(countryDetails1.getName());
//            }
//        }

        countryDetails.stream()
                .filter(countryDetails1 -> countryDetails1.getOfficialLanguage().equals("English"))
                .map(CountryDetails::getName)
                .forEach(System.out::println);

        //Using enhanced for loop
        for (CountryDetails countryDetails1 : countryDetails){
            if (countryDetails1.getOfficialLanguage().equals("English")){
                System.out.println(countryDetails1.getName() + " is english speaking country.");
            }
        }
    }


    public void printNamesFromHighGdpToLowGdp(List<CountryDetails> countryDetails) {

        countryDetails.sort(new Comparator<CountryDetails>() {
            @Override
            public int compare(CountryDetails o1, CountryDetails o2) {
                return (int) (o1.getGdp() - o2.getGdp());
            }
        });

        countryDetails.forEach(val -> System.out.println(val.getName()));

        //Using stream
        /*countryDetails.sort((o1, o2) -> (int) (o2.getGdp() - o1.getGdp()));

        List<String> names = countryDetails.stream()
                .map(CountryDetails::getName)
                .toList();

        System.out.println(names);*/

        

    }
}

