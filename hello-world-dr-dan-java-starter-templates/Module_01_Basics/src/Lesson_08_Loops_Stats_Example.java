/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
// Hello World with Dr. Dan - A Complete Introduction to Programming from Java to C++ (Code and Course � Dan Grissom)
//
// Additional Lesson Resources from Dr. Dan:
// 		High-Quality Video Tutorials: www.helloDrDan.com
// 		Free Commented Code: https://github.com/DanGrissom/hello-world-dr-dan-java
//
// In this lesson you will learn:
//		1) Loop Constructs
//			a) FOR loop (for when we know how many times we need to do something)
//			b) WHILE loop (for when we do NOT know how many times we need to do something)
//			c) DO WHILE loop (for when we know we need to do something at LEAST once, but not sure how many times after that)
//		2) Nested Loops
//		3) Basic statistics
//			a) Average, minimum, maximum, sum
//		4) Basic Math class operators
//			a) Math.min() for minimum of two numbers
//			b) Math.max() for maximum of two numbers
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

import java.util.Scanner;

public class Lesson_08_Loops_Stats_Example {

    ///////////////////////////////////////////////////////////////
    // MAIN - Entry point where code will begin execution for file
    ///////////////////////////////////////////////////////////////
    public static void main(String[] args) {
        // Simple welcome statements printed to screen
        System.out.println("Program Objective: Learn the FOR, WHILE and DO-WHILE loop constructs and basic stats) ");
        System.out.println("===========================================================================");

        // Initialize Scanner to read in from user
        Scanner scan = new Scanner(System.in);

        // Prompt user for number
        System.out.println("Please enter the number of assignments submitted on time: ");
        int numGrades = scan.nextInt();
        // Initialize variables for stats
        double runningSum = 0, minGrade = Double.MAX_VALUE, maxGrade = Double.MIN_VALUE, avgGrade = 0;
        final double LATE_PENALTY=10;
        ////////////////////////////////////////////////////////////////////////////////////
        // Iterate from 0 to numGrades - 1
        for(int i = 0; i< numGrades; i++) {
            double newGrade;
            // Continue to read grades while the input is bad (that is, until it is good!)
            boolean badInput = true;//somwhere in while loop is to be false until badInput is true
            do{
                // Prompt user for grade and read
                System.out.print("Enter grade "+(i+1)+": ");
                newGrade = scan.nextDouble();

                // Check if grade is valid
                if(newGrade<0 || newGrade>100){ // Bad input
                    System.out.println("Grade must be from 0%-100%. You entered: "+newGrade+"%");
                    System.out.println("Please try again...");
                }else badInput=false;//good input

            }while (badInput);


            // Update stats
            runningSum += newGrade;
            minGrade = Math.min(minGrade,newGrade);
            maxGrade = Math.max(maxGrade,newGrade);
            avgGrade = runningSum/(i+1);//i+1 is how many grades collect.
            // Print stats if not the last iteration
            if(i != (numGrades-1)) {// if i != 2
                System.out.printf("\tAfter %s grades: Avg = %.2f; Min = %.2f; Max = %.2f\n", (i + 1), avgGrade, minGrade, maxGrade);
            }


        }
        ////////////////////////////////////////////////////////////////////////////////////
        // Print final statistics
        if(numGrades>0) {//We had grades entered
            System.out.println("\nFinal statistics for " + numGrades + "grades:");
            System.out.printf("\tAvg = %.2f; Min = %.2f; Max = %.2f\n", avgGrade, minGrade, maxGrade);
        }else //no grades entered
        System.out.println("You did not enter any grades!");
        ////////////////////////////////////////////////////////////////////////////////////
        // Ask user if there are any late grades to collect
        scan.nextLine();//Flush new line
        System.out.print("\nAre there any late grades to collect (Y/N): ");
        boolean moreGrades = (scan.nextLine().toUpperCase().charAt(0))=='Y';//force capital Y

        ////////////////////////////////////////////////////////////////////////////////////
        // WHILE loop to collect more grades until user says NO more
        while(moreGrades){
            double newGrade;
            // Continue to read grades while the input is bad (that is, until it is good!)
            boolean badInput = true;//somwhere in while loop is to be false until badInput is true
            do{
                // Prompt user for grade and read
                System.out.print("Enter grade "+(numGrades+1)+": ");
                newGrade = scan.nextDouble();

                // Check if grade is valid
                if(newGrade<0 || newGrade>100){ // Bad input
                    System.out.println("Grade must be from 0%-100%. You entered: "+newGrade+"%");
                    System.out.println("Please try again...");
                }else badInput=false;//good input

            }while (badInput);


            // Update stats
            newGrade -= LATE_PENALTY;
            runningSum += newGrade;
            minGrade = Math.min(minGrade,newGrade);
            maxGrade = Math.max(maxGrade,newGrade);
            avgGrade = runningSum/(numGrades+1);//i+1 is how many grades collect.
            // Print stats if not the last iteration
            if(numGrades != (numGrades-1)) {// if i != 2
                System.out.printf("\tAfter %s grades: Avg = %.2f; Min = %.2f; Max = %.2f\n", (numGrades + 1), avgGrade, minGrade, maxGrade);
            }


            // Iterate number of grades
            numGrades++;
            // Ask user if there are any late grades to collect
            scan.nextLine();//Flush new line
            System.out.print("\nAre there any late grades to collect (Y/N): ");
            moreGrades = (scan.nextLine().toUpperCase().charAt(0))=='Y';//force capital Y
        }


        ////////////////////////////////////////////////////////////////////////////////////
        // Print final statistics
        if(numGrades>0) {//We had grades entered
            System.out.println("\nFinal statistics for " + numGrades + " grades:");
            System.out.printf("\tAvg = %.2f; Min = %.2f; Max = %.2f\n", avgGrade, minGrade, maxGrade);
        }else //no grades entered
            System.out.println("You did not enter any grades!");
    }
}
