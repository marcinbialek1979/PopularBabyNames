package app;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        CSVUtils csvUtils = new CSVUtils();
        final List<CSVFinalModel> csvFinalModels = csvUtils.createListFromCSVFile("C:\\Users\\Marcin\\OneDrive\\Dokumenty\\IdeaProjects\\Learning\\PopularBabyNames\\src\\main\\resources\\Popular_Baby_Names.csv");
        Calculate calculate = new Calculate();
        calculate.mostCommonBabyNamesTop10(csvFinalModels);
        calculate.mostCommonBabyNameFemale(csvFinalModels);
        calculate.mostCommonFirstLetterOfSurnameTop3(csvFinalModels);

    }
}
