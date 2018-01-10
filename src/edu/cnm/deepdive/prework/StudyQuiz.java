package edu.cnm.deepdive.prework;

import java.util.Scanner;

public class StudyQuiz {

    public static void main(String[] args)
    {

      String next = "------------------------------";
      int a;
      int b;
      int c;
      int d;
      int e;
      int f;
      int g;

      Scanner input = new Scanner(System.in);

      System.out.println("Intro to Java Study Quiz");
      System.out.println("Please select your answer by typing in the number corresponding to it");

      System.out.println("Real-world objects contain " + "_____ " + "and " + "____.");
      System.out.println("1) Constant and Uppercase\n2) Byte and Short\n3) State and Behavior\n4) Postincrement and Preincrement");
      a = input.nextInt();

      if (a > 4)
      {
        System.out.println("C'mon now. Did you even read the question?");
      }
      if (a == 3)
      {
        System.out.println("Correct!");
      }
      else
      {
        System.out.println("Incorrect!");
      }
      System.out.println(next);

      System.out.println("A software object's state is stored in " + "____");
      System.out.println("1) Overflow\n2) Fields\n3) Variables\n4) 64 bit");
      b = input.nextInt();

      if (b == 2)
      {
        System.out.println("Correct!");
      }
      else
      {
        System.out.println("Incorrect!");
      }

      System.out.println("Hiding internal data from the outside world, and accessing it only through publicly exposed methods is known as data " + "____");
      System.out.println("1) Storage");
      System.out.println("2) Encapsulation");
      System.out.println("3) Allocation");
      System.out.println("4) Corruption");
      d = input.nextInt();

      if (d == 2)
      {
        System.out.println("Correct!");
      }
      else
      {
        System.out.println("Incorrect!");
      }

      System.out.println("A software object's behavior is exposed through " + "____");
      System.out.println("1) Methods\n2) Fields\n3)Interface \n4) Operators");
      c = input.nextInt();

      if (c == 1)
      {
        System.out.println("Correct!");
      }
      else
      {
        System.out.println("Incorrect!");
      }
    }

}
