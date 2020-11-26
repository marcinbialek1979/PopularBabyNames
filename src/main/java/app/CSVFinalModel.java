package app;

import java.util.Objects;

public class CSVFinalModel {
    private int yearOfBirth;
    private String gender;
    private String firstName;
    private int count;


    public CSVFinalModel(int yearOfBirth, String gender, String firstName, int count) {
        this.yearOfBirth = yearOfBirth;
        this.gender = gender;
        this.firstName = firstName;
        this.count = count;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
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


    @Override
    public String toString() {
        return "CSVModel{" +
                "yearOfBirth='" + yearOfBirth + '\'' +
                ", gender='" + gender + '\'' +
                ", firstName='" + firstName + '\'' +
                ", count=" + count +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CSVFinalModel csvFinalModel = (CSVFinalModel) o;
        return Objects.equals(gender, csvFinalModel.gender) &&
                Objects.equals(firstName, csvFinalModel.firstName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(gender, firstName);
    }
}
