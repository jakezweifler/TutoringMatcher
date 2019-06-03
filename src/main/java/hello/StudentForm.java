package hello;

import java.util.ArrayList;
import java.util.List;

public class StudentForm {

    private String name;
    private String email;
    private int grade;
    private ArrayList<String> classes;
    //private boolean[][] freeTimes;
    //private boolean needsHelp;

    public StudentForm() {
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

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public ArrayList<String> getClasses() {
        return classes;
    }

    public void setClasses(ArrayList<String> classes) {
        this.classes = classes;
    }

//    public boolean[][] getFreeTimes() {
//        return freeTimes;
//    }
//
//    public void setFreeTimes(boolean[][] freeTimes) {
//        this.freeTimes = freeTimes;
//    }

//    public boolean getNeedsHelp() {
//        return needsHelp;
//    }
//
//    public void setNeedsHelp(boolean needsHelp) {
//        this.needsHelp = needsHelp;
//    }



    public Student toStudent() {
        String name = this.getName();
        String email = this.getEmail();
        int grade = this.getGrade();
//        boolean needsHelp = this.getNeedsHelp();
        ArrayList classes = this.getClasses();
        return new Student(name, grade, email, classes, true);
    }


}
