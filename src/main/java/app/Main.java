package app;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        CSVUtils csvUtils = new CSVUtils();
        final var listFromCSVFile = csvUtils.createListFromCSVFile("C:\\Users\\Marcin\\OneDrive\\Dokumenty\\IdeaProjects\\Learning\\PopularBabyNames\\src\\main\\resources\\Popular_Baby_Names_TEST.csv");
        listFromCSVFile.forEach(System.out::println);

    }
}
