package term_2.set_10_exam;

import java.util.ArrayList;

public class Intern extends Developer implements Cloneable {
    private int monthsInterned;
    private int certificateCount;
    private ArrayList<String> certficates;

    public Intern() {
    }

    public Intern(int monthsInterned) {
        this.monthsInterned = monthsInterned;
    }

    public Intern(int monthsInterned, int certificates) {
        this.monthsInterned = monthsInterned;
        this.certificateCount = certificates;
    }

    public Intern(String name, String email, int monthsInterned, int certificateCount) {
        super(name, email);
        this.monthsInterned = monthsInterned;
        this.certificateCount = certificateCount;
    }

    @Override
    public int getScore() {
        return monthsInterned * certificateCount;
    }

    @Override
    public int compareTo(Developer developer) {
        return this.getScore() - developer.getScore();
    }

    @Override
    public Intern clone() {
        try {
            var intern = (Intern) super.clone();
            intern.certficates = (ArrayList<String>) intern.certficates.clone();
            return intern;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }

    @Override
    public String toString() {
        return "Intern{" +
                super.toString() +
                ", monthsInterned=" + monthsInterned +
                ", certificateCount=" + certificateCount +
                '}';
    }
}
