//Isaac Yun
//2/27
//Grade average

import java.util.*;
public class GradeAverage {
    public static void main(String[]args)
    {
        int grade1;
        int grade2;
        int grade3;
        int grade4;
        int grade5;
        double average;

        Scanner input = new Scanner (System.in);
        System.out.println("Please enter a grade: ");
        grade1 = input.nextInt();

        System.out.println("Please enter a grade: ");
        grade2 = input.nextInt();

        System.out.println("Please enter a grade: ");
        grade3 = input.nextInt();

        System.out.println("Please enter a grade: ");
        grade4 = input.nextInt();

        System.out.println("Please enter a grade: ");
        grade5 = input.nextInt();

        average = (grade1 + grade2 + grade3 + grade4 + grade5)/5.0;
        System.out.println("The average is " + average);
    }
}
