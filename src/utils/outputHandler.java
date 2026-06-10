package utils;

import model.Questions;

import java.util.Collection;
import java.util.HashMap;
import java.util.Scanner;

public class outputHandler {
    public static   String  printQuestion(Scanner sc ,HashMap<String , Questions> quesMap){
        quesMap.forEach((key , Questions) -> {

            Collection <Questions>  q=   quesMap.values();
            System.out.println("Question : "+ key);
            for(model.Questions value : q){
                System.out.print("OPTION A : "+ value.getOptionA());
                System.out.print("OPTION B : "+value.getOptionB());
                System.out.print("OPTION C : "+ value.getOptionC());
                System.out.print("OPTION D : " + value.getOptionD());
            }

        });
        System.out.println("YOUR ANSWER : ");
        String ans=sc.next();

         return   ans;


    }
}
