import model.Questions;

import java.util.HashMap;
 import java.util.Scanner;
import  service.*;


//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
 public  class Main {
    static void main(String[] args) {
        Scanner sc =  new Scanner(System.in) ;
        HashMap<String , Questions> quesMap =new HashMap<>();


        System.out.println("""
               ENTER :
               1. TAKE QUIZ
               2. VIEW PAST SCORE
               3. ADD NEW QUIZ QUESTION
               4. EXIT
                """);
        System.out.print("ENTER CHOICE : ");
        String c=sc.next();

        switch (c){
            case "1" :
                System.out.print("ENTER USER NAME :  ");
                String name=sc.next();

                System.out.println("""
                    CATEGORY :
                    1. : JAVA
                    2. : SCIENCE
                    3. : GENERAL KNOWLEDGE
                    4. : RETURN CATEGORY
                    """);
                System.out.print("ENTER CHOICE : ");
                String category=sc.next();

                switch (category){
                    case "1" :
service.QuizService.manageQuestion( quesMap);

                        break;

                    case "2" :
                        break;

                    case "3" :
                        break;

                    case "4" :
                        break;
                    default:
                        System.out.println("-----INVALID OPTION SELECTED");
                }




                break;

            case "2" :
                break;

            case "3" :
                break;

            case "4" :
                break;

            default:
                System.out.println("---INVALID OPTION SELECTED---");
        }


    }
}
