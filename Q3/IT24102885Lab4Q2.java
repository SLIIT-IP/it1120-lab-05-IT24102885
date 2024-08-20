import java.util.Scanner;

public class IT24102885Lab4Q2 {
    public static void main(String []args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter exam marks (out of 100): ");
        int examMarks = input.nextInt();
        if (examMarks < 0 || examMarks > 100) {
            System.out.println("Invalid input for exam marks. Terminating program.");
            return;  
        }

        System.out.print("Please enter lab submission marks (out of 100): ");
        int labMarks = input.nextInt();
        if (labMarks < 0 || labMarks > 100) {
            System.out.println("Invalid input for lab submission marks. Terminating program.");
            return;  
        }

        System.out.print("Please enter the percentage given for the exam: ");
        double examPercentage = input.nextDouble();
        if (examPercentage < 0 || examPercentage > 100) {
            System.out.println("Invalid input for exam percentage. Terminating program.");
            return;  
        }

        System.out.print("Please enter the percentage given for the lab submission: ");
        double labPercentage = input.nextDouble();
        if (labPercentage < 0 || labPercentage > 100) {
            System.out.println("Invalid input for lab submission percentage. Terminating program.");
            return;  
        }

        // Check if the sum of examPercentage and labPercentage equals 100
        if (Math.abs(examPercentage + labPercentage - 100) > 1e-9) {
            System.out.println("The percentages must add up to 100. Terminating program.");
            return;  
        }

        // Calculate the final marks 
        double finalMarks = (examMarks * (examPercentage / 100)) + (labMarks * (labPercentage / 100));
        System.out.println("Final Exam Mark is: " + finalMarks);
    }
}
