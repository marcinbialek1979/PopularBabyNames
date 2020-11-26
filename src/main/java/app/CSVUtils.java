package app;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CSVUtils {

    List<CSVModel> csvModels;

    List<CSVModel> readFromCsv(String CSVFilePath) {

        csvModels = new ArrayList<>();

        try (
                final var fileReader = new FileReader(CSVFilePath);
                final var bufferedReader = new BufferedReader(fileReader)
        ) {
            // Skip the first line from CSVFile
            bufferedReader.readLine();
            String line;

            while ((line = bufferedReader.readLine()) != null) {
                String[] data = line.toUpperCase().split(",");
                csvModels.add(createCSVModel(data));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return csvModels;
    }

    CSVModel createCSVModel(String[] data) {

        String yearOfBirth = data[0];
        String gender = data[1];
        String ethnicity = data[2];
        String firstName = data[3];
        int count = Integer.parseInt(data[4]);
        int rank = Integer.parseInt(data[5]);
        return new CSVModel(yearOfBirth, gender, ethnicity, firstName, count, rank);
    }


}
