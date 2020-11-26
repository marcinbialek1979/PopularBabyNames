package app;

import java.util.List;

public class CSVModel {
private String yearOfBirth;
private String gender;
private String ethnicity;
private String firstName;
private int count;
private int rank;

private List<CSVModel> csvModels;

    public CSVModel(){}

    public CSVModel(String yearOfBirth, String gender, String ethnicity, String firstName, int count, int rank) {
        this.yearOfBirth = yearOfBirth;
        this.gender = gender;
        this.ethnicity = ethnicity;
        this.firstName = firstName;
        this.count = count;
        this.rank = rank;
    }

    public String getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(String yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getEthnicity() {
        return ethnicity;
    }

    public void setEthnicity(String ethnicity) {
        this.ethnicity = ethnicity;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    public List<CSVModel> getCsvModels() {
        return csvModels;
    }

    public void setCsvModels(List<CSVModel> csvModels) {
        this.csvModels = csvModels;
    }

    @Override
    public String toString() {
        return "CSVModel{" +
                "yearOfBirth='" + yearOfBirth + '\'' +
                ", gender='" + gender + '\'' +
                ", ethnicity='" + ethnicity + '\'' +
                ", firstName='" + firstName + '\'' +
                ", count=" + count +
                ", rank=" + rank +
                '}';
    }


}
