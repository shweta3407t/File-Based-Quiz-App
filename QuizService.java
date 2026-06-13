package service;

 import java.io.*;
  import java.io.BufferedWriter;
 import java.io.FileWriter;
 import java.io.IOException;
import java.util.*;

public class QuizService {
    static ArrayList<String[]> javaQuestionList = new ArrayList<>();
    static ArrayList<String[]> scienceQuestionList = new ArrayList<>();
    static ArrayList<String[]> gkQuestionList = new ArrayList<>();

    public  static  void  takeQuizz(Scanner sc ){

        boolean isRunning=true;
        while( isRunning){

            System.out.println("""
                    CATEGORY :
                    1. : JAVA
                    2. : SCIENCE
                    3. : GENERAL KNOWLEDGE
                    4. :  EXIT CATEGORY
                    """);
            System.out.print("ENTER CHOICE : ");
            String category=sc.next();

            switch (category){
                case "1" :
                    String filePath="src/Question";
                    System.out.println("----WELCOME TO JAVA QUIZ----");
                    loadQuestion(sc , javaQuestionList, filePath);

                    break;


                case "2" :

                     filePath="src/sQuestion";
                    System.out.println("----WELCOME TO SCIENCE QUIZ----");

                     loadQuestion(sc ,scienceQuestionList,  filePath);

                    break;

                case "3" :
                      filePath="src/gkQuestion";
                    System.out.println("----WELCOME TO  GENERAL KNOWLEDGE QUIZ----");

                      loadQuestion(sc , gkQuestionList, filePath);

                    break;

                case "4" :
                    System.exit(0);
                    break;
                default:
                    System.out.println("-----INVALID OPTION SELECTED");
            }


        }
    }





    public static void loadQuestion( Scanner sc  ,ArrayList<String[]> questionList ,String filePath) {
        try {
            BufferedReader br = new BufferedReader(new FileReader( filePath));

            String line;
           while((line = br. readLine()) != null) {

               String[] parts =line.split("[//|]");
               if (line.length() < 6) {
                   continue;
               }

                questionList.add(parts);


           }
            br.close();
        } catch (   IOException e) {
            System.out.println(e);
        }


         utils.outputHandler.printQuestion(sc,  questionList);

    }




    public static void addQuestionInTxtFile(String data , String   filename){
        try(BufferedWriter  br=new BufferedWriter(new FileWriter( filename , true))){
                 br.write(data);
                 br.newLine();
                 br.close();

            System.out.println("DATA ADDED SUCCESSFULLY");

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static void  chooseFile(Scanner sc){
        System.out.println("""
                ENTER :
                1. ADD JAVA QUESTION
                2. ADD  SCIENCE QUESTION
                3. ADD  GK QUESTION 
                4. EXIT QUESTION ADDING
         """);

        String choice=sc.next();
        switch (choice){
            case "1":
                System.out.print("ENTER DATA TO ADD : ");
                String data=sc.next();
                String path="src/Question";
                addQuestionInTxtFile(  data ,  path);
            break;

            case "2":
                System.out.print("ENTER DATA TO ADD : ");
                  data=sc.next();
                  path="src/sQuestion";
                addQuestionInTxtFile( data ,  path);
                break;

            case "3":
                System.out.print("ENTER DATA TO ADD : ");
                  data=sc.next();
                  path="src/gkQuestion";
                addQuestionInTxtFile(data ,  path);
                break;

            case "4":
                System.exit(0);
                break;
            default:
                System.out.println("INVALID OPTION SELECTED");
        }

    }









}



