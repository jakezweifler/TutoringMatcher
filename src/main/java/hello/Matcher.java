package hello;

import java.util.*;

public class Matcher {

    public static List<MatchedStudents> matchMe(Student pupil, ArrayList<Student> tutors) {
        boolean anyMatches = false;
        List<MatchedStudents> possibleTutors = new ArrayList<>();

        Day[] days = Day.values();
        Time[] times = Time.values();

        //maybe make more readable eventually...
        for (int x = 0; x < tutors.size(); x++) {
            if(returnMatchedClasses(tutors.get(x),pupil).size() > 0 && returnMatchedTimes(tutors.get(x),pupil).size() > 0) {
                anyMatches = true;
                Day commonDay = days[returnMatchedTimes(tutors.get(x),pupil).get(0)[0]];
                Time commonTime = times[returnMatchedTimes(tutors.get(x),pupil).get(0)[1]];
                List<String> commonSubject = returnMatchedClasses(tutors.get(x),pupil);
                possibleTutors.add(new MatchedStudents(tutors.get(x), pupil, commonDay, commonTime, commonSubject));
            }
        }
        if (!anyMatches) {
            System.out.println("There were no matches, :(.");
        }
        return possibleTutors;
    }


    //returns actual class that is shared
    public static List<String> returnMatchedClasses(Student tutor, Student pupil) {
        Set<String> tutorClasses = new HashSet<>(tutor.getClasses());
        Set<String> pupilClasses = new HashSet<>(pupil.getClasses());

        tutorClasses.retainAll(pupilClasses);
        List<String> subjectsInCommon = new ArrayList<>(tutorClasses);
        return subjectsInCommon;
    }


    //returns boolean saying if a time match exists
    public static List<Integer[]> returnMatchedTimes (Student tutor, Student pupil) {
        boolean[][] tutorTimes = tutor.getFreeTimes();
        boolean[][] pupilTimes = pupil.getFreeTimes();
        List<Integer[]> sharedTimes = new ArrayList<>();

        for (int x = 0; x < 7; x++) {
            for (int y = 0; y < tutorTimes[x].length; y++)
                if (tutorTimes[x][y] && pupilTimes[x][y]) {
                    sharedTimes.add(new Integer[]{x,y});
                }
        }
        return sharedTimes;
    }


}
