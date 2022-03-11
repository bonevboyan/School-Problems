package term_2.set_10_exam;

import java.util.ArrayList;

public abstract class Developer implements Comparable<Developer> {
    private String name;
    private String email;

    protected Developer() {
    }

    protected Developer(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public abstract int getScore();

    public static <T extends Developer> int returnScores(ArrayList<T> developers) {
        return developers.stream().mapToInt(Developer::getScore).sum();
    }

    @Override
    public String toString() {
        return "name='" + name + '\'' +
                ", email='" + email + '\'';
    }
}
