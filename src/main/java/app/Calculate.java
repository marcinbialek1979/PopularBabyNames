package app;

import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Calculate {

    public void mostCommonBabyNamesTop10(List<CSVFinalModel> csvFinalModels) {

        System.out.println("Most 10 popular baby names:");
        csvFinalModels.stream()
                .sorted(Comparator.comparingInt(CSVFinalModel::getCount).reversed())
                .limit(3)
                .forEach(System.out::println);
    }

    public void mostCommonBabyNameFemale(List<CSVFinalModel> csvFinalModels) {

        System.out.println("The most popular female name:");
        csvFinalModels.stream()
                .filter(i -> i.getGender().equalsIgnoreCase("FEMALE"))
                .sorted(Comparator.comparingInt(CSVFinalModel::getCount).reversed())
                .limit(1)
                .forEach(System.out::println);
    }

    public void mostCommonFirstLetterOfSurnameTop3(List<CSVFinalModel> csvFinalModels) {

        System.out.println("The most 3 common letters:");
        Map<String, Integer> mostCommonLetters = csvFinalModels.stream()
                .collect(Collectors.groupingBy(i -> i.getFirstName().substring(0, 1), Collectors.summingInt(CSVFinalModel::getCount)));

        Map<String, Integer> sortedByValue = mostCommonLetters.entrySet().stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .limit(3)
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,
                        (oldValue, newValue) -> oldValue, LinkedHashMap::new));
        System.out.println(sortedByValue);
    }

}
