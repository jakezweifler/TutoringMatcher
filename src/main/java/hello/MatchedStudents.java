package hello;


import java.util.List;

public class MatchedStudents {

    private Student tutor;
    private Student pupil;
    private Day d;
    private Time t;
    private List<String> sharedSubjects;


    public MatchedStudents(Student tutor, Student pupil, Day commonDay, Time commonTime, List<String> sharedSubjects) {
        this.tutor = tutor;
        this.pupil = pupil;
        this.d = commonDay;
        this.t = commonTime;
        this.sharedSubjects = sharedSubjects;
    }

    public void setD(Day d) {
        this.d = d;
    }

    public void setT(Time t) {
        this.t = t;
    }


    public Student getTutor() {
        return tutor;
    }

    public Student getPupil() {
        return pupil;
    }

    public Day getD() {
        return d;
    }

    public Time getT() {
        return t;
    }

    public List<String> getS() {
        return sharedSubjects;
    }
}

