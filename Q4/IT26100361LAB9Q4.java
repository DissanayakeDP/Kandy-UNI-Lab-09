import java.util.Scanner;

public class IT26100361LAB9Q4{

    public static double calcFinalMark(double assignment, double exam) {
        return (assignment * 30 / 100) + (exam * 70 / 100);
    }

    public static char findGrades(double finalMark) {
        if (finalMark >= 75) {
            return 'A';
        } else if (finalMark >= 60 && finalMark < 75) {
            return 'B';
        } else if (finalMark >= 50 && finalMark < 60) {
            return 'C';
        } else {
            return 'F';
        }
    }

    public static void printDetails(String name, double finalMark, char grade) {
        System.out.printf("%-15s %-15.2f %s\n", name, finalMark, grade);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] names = new String[5];
        double[] finals = new double[5];
        char[] grades = new char[5];

        for (int i = 0; i < 5; i++) {
            System.out.print("Enter Name of Student " + (i+1) + ": ");
            names[i] = sc.next();

            System.out.print("Enter Assignment Mark (out of 100) for " + names[i] + ": ");
            double assign = sc.nextDouble();

            System.out.print("Enter Exam Paper Mark (out of 100) for " + names[i] + ": ");
            double exam = sc.nextDouble();

            System.out.println();

            finals[i] = calcFinalMark(assign, exam);
            grades[i] = findGrades(finals[i]);
        }

        System.out.printf("%-15s %-15s %s\n", "Name", "Final Mark", "Grade");
        for (int i = 0; i < 5; i++) {
            printDetails(names[i], finals[i], grades[i]);
        }

        sc.close();
    }
}