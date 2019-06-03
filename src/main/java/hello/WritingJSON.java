package hello;

import com.fasterxml.jackson.databind.ObjectMapper;

public class WritingJSON {

    public static void main(String[] args) {
        example1();
    }

    private static void example1() {
        Subject[] sTest = new Subject[3];


        // ObjectMapper is a jackson class that's used to read and write JSON data
        ObjectMapper mapper = new ObjectMapper();


        String someData = "The capital of New York is Albany";
        String fileName = "NewYorkCapital.txt";
        String path = "/home/jake/IdeaProjects/Tutoring/src/main/java/Students/Jsontest";

        //  try {

        // writes p1 as json to the specified file
        //mapper.writeValue(new File(path), p1);

        // writes p1 as json to the specified file in a more readable way
        //    mapper.writerWithDefaultPrettyPrinter().writeValue(new File(path), p1);

//        } catch (IOException e) {
//            e.printStackTrace();
//        }
    }

    private static void example2() {
//
//        // ObjectMapper is a jackson class that's used to read and write JSON data
//        ObjectMapper mapper = new ObjectMapper();
//        try {
//
//            // writes p1 as json to the specified file in a more readable way
//            mapper.writerWithDefaultPrettyPrinter().writeValue(new File("C:/Users/Zach/Documents/people.json"), people);
//
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }
    }

}