package hello;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Student {

    private final String name;
    private final int grade;
    private final String email;
    private List<String> classes;

    private boolean[][] freeTimes;
    private boolean needsHelp;


    public Student(String name, int grade, String email, ArrayList<String> classes, boolean needsHelp){
        this.name = name;
        this.email = email;
        this.grade = grade;
        this.classes = classes;
        this.needsHelp = needsHelp;

        freeTimes = new boolean[7][];

        for(int x = 0; x < 5; x++) {
            freeTimes[x] = new boolean[10];
        }
        for(int x = 5; x < 7; x++) {
            freeTimes[x] = new boolean[3];
        }
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", grade=" + grade +
                ", email='" + email + '\'' +
                ", classes=" + classes +
                '}';
    }

    public void addClass(String s) {
        classes.add(s);
    }

    public void setClasses(ArrayList<String> classes) {
        this.classes = classes;
    }

    public void setFreeTimes(boolean[][] freeTimes) {
        this.freeTimes = freeTimes;
    }

    public void setNeedsHelp(boolean needsHelp) {
        this.needsHelp = needsHelp;
    }




    public int getGrade() {
        return grade;
    }

    public String getName() {
        return name;
    }

    public List<String> getClasses() {
        return classes;
    }

    public boolean[][] getFreeTimes() {
        return freeTimes;
    }

    public boolean getNeedsHelp() {
        return needsHelp;
    }
}
