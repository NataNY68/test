package ifStatement;

import java.util.Locale;
import java.util.Scanner;

public class NastedTask1 {
    public static void main(String[] args) {
        Scanner name = new Scanner(System.in);
        System.out.println("Do you know java");
        String java = name.nextLine().toLowerCase();

        if (java.equals("yes")) {
            System.out.println("Do you know selenium?");
            String selenium = name.nextLine().toLowerCase();

          if (selenium.equals("yes")){
              System.out.println("Do you know API testing");
              String api = name.nextLine().toLowerCase();

              if (api.equals("yes")){
                  System.out.println("Do you know SQL");
                  String sql= name.nextLine().toLowerCase();

                  if (sql.equals("yes")){
                      System.out.println("You are HIRED");

                  }else {
                      System.out.println("Please learn SQL");
                  }

              }else {
                  System.out.println("Please learn API");
              }

          }else {
              System.out.println("Please learn Selenium");
          }

          }else {
            System.out.println("we need someone, who know java");
        }
        }

    }

