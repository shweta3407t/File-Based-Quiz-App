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



    public static void manageQuestion( HashMap<String, Questions> quesMap) {

        try {

            BufferedReader br = new BufferedReader(new FileReader("Question"));

            String line;
            //set question

            while ((line = br.readLine()) != null ) {
                if (line.trim().isEmpty()) {
                    continue;
                }
                String[] parts = line.split("\\|");


                    if (line.matches("java")) {
                        String q = parts[0];
                        String optA = parts[1];
                        String optB = parts[2];
                        String optC = parts[3];
                        String optD = parts[4];
                        javaAns = parts[5];

                        javaQ = new Questions(optA, optB, optC, optD,  javaAns);
                        quesMap.put(q, javaQ);

                    }

                    if (line.matches("science")) {
                        String q = parts[0];
                        String optA = parts[1];
                        String optB = parts[2];
                        String optC = parts[3];
                        String optD = parts[4];
                         sAns = parts[5];

                        scienceQ = new Questions(optA, optB, optC, optD,  sAns);
                        quesMap.put(q, scienceQ);
                    }


                    if (line.matches("gk")) {
                        String q = parts[0];
                        String optA = parts[1];
                        String optB = parts[2];
                        String optC = parts[3];
                        String optD = parts[4];
                         gkAns = parts[5];

                        gkQ = new Questions(optA, optB, optC, optD,  gkAns);
                        quesMap.put(q, gkQ);

                    }

            }
            br.close();
        } catch (   IOException e) {
            System.out.println(e);
        }

    }


    public static void AllQuestion(Scanner sc ,String category, HashMap<String, Questions> quesMap) {
        switch (category){
            case "1":

                System.out.println("----WELCOME TO JAVA QUIZ----");
                String userAns = utils.outputHandler.printQuestion(sc, quesMap);
                if(userAns.matches( javaAns)){
                    System.out.println("CORRECT ANSWER !");
                }else{
                    System.out.println("INCORRECT ANSWER !");
                }
                break;
            case "2":
                System.out.println("----WELCOME TO SCIENCE QUIZ----");
                userAns = utils.outputHandler.printQuestion(sc, quesMap);
                if(userAns.matches( sAns)){
                    System.out.println("CORRECT ANSWER !");
                }else{
                    System.out.println("INCORRECT ANSWER !");
                }
                break;
            case "3":

                System.out.println("----WELCOME TO GK QUIZ----");
                userAns = utils.outputHandler.printQuestion(sc, quesMap);
                if(userAns.matches( gkAns)){
                    System.out.println("CORRECT ANSWER !");
                }else{
                    System.out.println("INCORRECT ANSWER !");
                }
                break;
            default:
                System.out.println("---INVALID OPTION SELECTED----");
        }
    }

}



