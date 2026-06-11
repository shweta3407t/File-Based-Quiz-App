package service;

import model.Questions;
import java.io.*;
import java.util.*;

public class QuizService {
    static Questions javaQ;
    static Questions scienceQ;
    static Questions gkQ;

    static  String javaAns;
    static String sAns;
    static String gkAns;

//    static ArrayList<ArrayList<String[]>> allQuestionList = new ArrayList<>();
    static ArrayList<String[]> javaList = new ArrayList<>();
    static ArrayList<String[]> scienceList = new ArrayList<>();
    static ArrayList<String[]> gkList = new ArrayList<>();

    public static void manageQuestion( Scanner sc ,HashMap<String, Questions> quesMap) {
        try {
            BufferedReader br = new BufferedReader(new FileReader("src/Question"));

            String line;
           while((line = br. readLine()) != null) {
               String[] allQInPart = line.split("[//#]");
                allQInPart =line.split("[//|]");

//               String[] parts =line.split("[//|]");
               if (line.length() < 6) {
                   continue;
               }
               javaList.add(new String[]{allQInPart[0]}) ;
               scienceList.add(new String[] {allQInPart[1]}) ;
                 gkList.add(new String[ ] {allQInPart[2]}) ;

//                 allQuestionList.add(javaList);
//               allQuestionList.add( scienceList);
//               allQuestionList.add( gkList);
           }
            br.close();
        } catch (   IOException e) {
            System.out.println(e);
        }

    }


    public static void AllQuestion(Scanner sc ,String category, HashMap<String, Questions> quesMap) {
        switch (category){
            case "1":

                System.out.println("2222222222222222");

                System.out.println("----WELCOME TO JAVA QUIZ----");
                System.out.println("3333333333333333333");
                utils.outputHandler.printQuestion(sc, javaList);
                 break;
            case "2":
                System.out.println("----WELCOME TO SCIENCE QUIZ----");
                utils.outputHandler.printQuestion(sc, scienceList);
                break;
            case "3":
                System.out.println("----WELCOME TO GK QUIZ----");
                utils.outputHandler.printQuestion(sc,  gkList);

                break;
            default:
                System.out.println("---INVALID OPTION SELECTED----");
        }
    }

}



