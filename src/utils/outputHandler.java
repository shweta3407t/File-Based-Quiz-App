package utils;

import model.Questions;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Scanner;

public class outputHandler {
    public static  void printQuestion(Scanner sc , ArrayList<String[]> list) {
        int score =0;



        System.out.println("444444444444444444444");
        for (int i =1 ; i<list.size() ; i++) {


            System.out.println("555555555555555555");


            System.out.println(list.size());


            String q =  list.get(i)[0];
            String a = list.get(i)[1];
            String b = list.get(i)[2];
            String c = list.get(i)[3];
            String d = list.get(i)[4];
            String  correctAns = list.get(i)[5];


            System.out.println("6666666666666666");

            System.out.println("\nQUESTION " +i +" : "+ q);
            System.out.println("OPTION : " + a);
            System.out.println("OPTION : " + b);
            System.out.println("OPTION : " + c);
            System.out.println("OPTION : " + d);
            System.out.println("ANSWER : " +  correctAns);

            System.out.print("ENTER YOUR ANSWER : ");
            String  userAns = sc.next().toUpperCase();

            if ( userAns.matches( correctAns)) {
                System.out.println("7777777777777777");
                System.out.println("----CORRECT ANSWER ✅----");
                score++;
            } else {
                System.out.println("888888888888888");
                System.out.println("----INCORRECT ANSWER ❌----CORRECT ANSWER ✅ : " +  correctAns);
            }

        }
        System.out.println("---QUIZ FINISHED -----");
        System.out.println("----YOUR SCORE : "+ score +"----");




        }


}


