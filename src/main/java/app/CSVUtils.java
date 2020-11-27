package app;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CSVUtils {


    public List<CSVFinalModel> createListFromCSVFile(String CSVFilePath) {

        List<CSVFinalModel> csvFinalModels = new ArrayList<>();

        try (
                final var fileReader = new FileReader(CSVFilePath);
                final var bufferedReader = new BufferedReader(fileReader)
        ) {
            // Skip the first line from CSVFile
            bufferedReader.readLine();

            String line;
            while ((line = bufferedReader.readLine()) != null) {
                String[] data = line.toUpperCase().split(",");
                mergeDuplicates(csvFinalModels, createCSVModel(data));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return csvFinalModels;
    }

    private CSVFinalModel createCSVModel(String[] data) {

        int yearOfBirth = Integer.parseInt(data[0]);
        String gender = data[1];
        String firstName = data[3];
        int count = Integer.parseInt(data[4]);
        return new CSVFinalModel(yearOfBirth, gender, firstName, count);
    }

    private void mergeDuplicates(List<CSVFinalModel> csvFinalModels, CSVFinalModel csvFinalModel) {
        if (csvFinalModels.contains(csvFinalModel)) {
            int indexToUpdate = csvFinalModels.indexOf(csvFinalModel);
            int newCount = csvFinalModels.get(indexToUpdate).getCount() + csvFinalModel.getCount();
            csvFinalModels.get(indexToUpdate).setCount(newCount);
        } else {
            csvFinalModels.add(csvFinalModel);
        }
    }

}
