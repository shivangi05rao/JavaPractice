package collectionframework.arraylist.exersice.countrydetailsproblem;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.List;


public class Exercise1 {
    public static void main(String[] args) throws JsonProcessingException {
        ObjectMapper objectMapper = new ObjectMapper();
        List<CountryDetails> countryDetails =  objectMapper.readValue(JsonData.countryJson, new TypeReference<List<CountryDetails>>() {});
        System.out.println(countryDetails.size());

        CountryProcessor countryProcessor = new CountryProcessor();
        //countryProcessor.printCountryNames(countryDetails);
        countryProcessor.printEnglishSpeakingCountry(countryDetails);

        //countryProcessor.printNamesFromHighGdpToLowGdp(countryDetails);
    }
}
