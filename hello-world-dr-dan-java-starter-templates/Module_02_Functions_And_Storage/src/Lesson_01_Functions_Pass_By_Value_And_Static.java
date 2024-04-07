/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
// Hello World with Dr. Dan - A Complete Introduction to Programming from Java to C++ (Code and Course � Dan Grissom)
//
// Additional Lesson Resources from Dr. Dan:
// 		High-Quality Video Tutorials: www.helloDrDan.com
// 		Free Commented Code: https://github.com/DanGrissom/hello-world-dr-dan-java
//
// In this lesson you will learn:
//		1) Functions
//			a) Function Prototype: accessModifier static returnType functionName(parameters)
//			b) Passing parameters by value
//		2) Static variables
//			a) Variables that can be used anywhere in the file when using a main() method
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
import java.util.Scanner;
public class Lesson_01_Functions_Pass_By_Value_And_Static {
    //////////////////////////////////////////////////////////////////
    // Static Variables
    private static double runningSum = 0, minGrade = Double.MAX_VALUE, maxGrade = Double.MIN_VALUE, avgGrade = 0;
    private static Scanner scan = new Scanner(System.in);
    ///////////////////////////////////////////////////////////////
    // MAIN - Entry point where code will begin execution for file
    ///////////////////////////////////////////////////////////////
    public static void main(String[] args) {
        // Simple welcome statements printed to screen
        System.out.println("Program Objective: Learn to use functions and static variables to simplify code ");
        System.out.println("===========================================================================");
        // Prompt user for number
        System.out.println("Please enter the number of assignments submitted on time: ");
        int numGrades = scan.nextInt();
        // Initialize variables for stats
        final double LATE_PENALTY=10;
        ////////////////////////////////////////////////////////////////////////////////////
        // Iterate from 0 to numGrades - 1
        for(int i = 0; i< numGrades; i++) {
            double newGrade = getNextGrade(i+1);
            updateStats(newGrade, i+1);
            if(i != (numGrades-1)) {// if i != 2  // Print stats if not the last iteration
                printStatistic((i+1), false);
            }
        }
        printStatistic(numGrades, true);
        ////////////////////////////////////////////////////////////////////////////////////
        // Ask user if there are any late grades to collect
        scan.nextLine();//Flush new line
        System.out.print("\nAre there any late grades to collect (Y/N): ");
        boolean moreGrades = (scan.nextLine().toUpperCase().charAt(0))=='Y';//force capital Y
        ////////////////////////////////////////////////////////////////////////////////////
        // WHILE loop to collect more grades until user says NO more
        while(moreGrades){
            double newGrade = getNextGrade(numGrades+1);
            newGrade -= LATE_PENALTY;
            updateStats(newGrade, numGrades+1);
            printStatistic(++numGrades, false);
            // Ask user if there are any late grades to collect
            scan.nextLine();//Flush new line
            System.out.print("\nAre there any late grades to collect (Y/N): ");
            moreGrades = (scan.nextLine().toUpperCase().charAt(0))=='Y';//force capital Y
        }
        printStatistic(numGrades, true);
    }

    ////////////////////////////////////////////////////////////////////////////////
    // This method repeatedly asks the user to enter a new grade while it is within
    // the range of appropriate grades.
    //		Parameters:
    //			gradeNumber: An integer which represents how many grades will have
    //							been collected with this grade
    //		Returns:
    //			A double which represents the new grade entered by the user
    ////////////////////////////////////////////////////////////////////////////////
        private static double getNextGrade(int gradeNumber){
                double newGrade = 0;
                // Continue to read grades while the input is bad (that is, until it is good!)
                boolean badInput = true;//somewhere in while loop is to be false until badInput is true
                do{
                    // Prompt user for grade and read
                    System.out.print("Enter grade "+(gradeNumber)+": ");
                    newGrade = scan.nextDouble();

                    // Check if grade is valid
                    if(newGrade<0 || newGrade>100){ // Bad input
                        System.out.println("Grade must be from 0%-100%. You entered: "+newGrade+"%");
                        System.out.println("Please try again...");
                    }else badInput=false;//good input

                }while (badInput);
                return newGrade;
            }
    ////////////////////////////////////////////////////////////////////////////////
    // This method updates basic statistics of sum, min, max and average.
    //		Parameters:
    //			grade:			A double which represents the new grade to process
    //			gradeNumber: 	An integer which represents how many grades will have
    //							been collected with this grade
    //		Returns:
    //			void (nothing)
    ////////////////////////////////////////////////////////////////////////////////
       //Function Prototype:
    // accessModifier(private/protected/public. what part of a program can call this method)
    // static(must be same as main)
    // returnType(void(nothing)/return if there is a result. what type of data you want it to return or from what it produces) functionName(parameters)
        private static void updateStats(double grade, int gradeNumber){

        runningSum += grade;
            minGrade = Math.min(minGrade, grade);
            maxGrade = Math.max(maxGrade, grade);
            avgGrade = runningSum/(gradeNumber+1);//i+1 is how many grades collect.
        }
    ////////////////////////////////////////////////////////////////////////////////
    // This method prints the basic statistics of sum, min, max and average.
    //		Parameters:
    //			numGradesCollected: 	An integer which represents how many grades have
    //									been collected
    //			finalStatistics:		A boolean that is true if it should print final stats
    //									and false otherwise
    //		Returns:
    //			void (nothing)
    ////////////////////////////////////////////////////////////////////////////////
        private static void printStatistic(int numGradesCollected, boolean finalStatistic) {

        if(numGradesCollected>0) {//We had grades entered
            if(finalStatistic) {
                System.out.print("\nFinal statistics for " + numGradesCollected + "grades:\n\t");
            }
            else {
                System.out.printf("\tAfter %s grades: ", numGradesCollected);
            }
            System.out.printf("Avg = %.2f; Min = %.2f; Max = %.2f\n", avgGrade, minGrade, maxGrade);
        }else //no grades entered
            System.out.println("You did not enter any grades!");

    }
}
