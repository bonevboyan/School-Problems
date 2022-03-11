package term_2.set_10_exam;

import java.util.ArrayList;

public class Senior extends Developer implements Cloneable{
    private int yearsWorked;
    private int companyCount;
    private ArrayList<String> companies;

    public Senior() {
    }

    public Senior(int yearsWorked) {
        this.yearsWorked = yearsWorked;
    }

    public Senior(int yearsWorked, int companies) {
        this.yearsWorked = yearsWorked;
        this.companyCount = companies;
    }

    public Senior(String name, String email, int yearsWorked, int companyCount) {
        super(name, email);
        this.yearsWorked = yearsWorked;
        this.companyCount = companyCount;
    }

    @Override
    public int getScore() {
        return yearsWorked * companyCount;
    }

    @Override
    public int compareTo(Developer developer) {
        return this.getScore() - developer.getScore();
    }

    @Override
    public Senior clone() {
        try {
            Senior clone = (Senior) super.clone();
            clone.companies = (ArrayList<String>) this.companies.clone();
            return clone;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }

    @Override
    public String toString() {
        return "Senior{" +
                super.toString() +
                ", yearsWorked=" + yearsWorked +
                ", companyCount=" + companyCount +
                '}';
    }
}
