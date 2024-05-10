import java.util.Scanner;

public class ReducedEhclonForm{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //creating variables for operations
        int row = 4; // store the no of rows in matrix
        int column = 5; // store the no of columns in matrix

        double [][] matrix = new double[row][column]; //2D array to manage/interact with rows and columns

        //Taking the input of matrix of (3x4) from user
        System.out.println("Enter the Elements of Matrix: ");
        for(int i=1; i < row; i++){
            for(int j=1; j < column; j++){
                matrix[i][j] = input.nextInt();
            } // inner for
        } // outer for
        //Step-1 >> Interchanging the R1 <--> R2 -- (If R1 don't have the first element as 1)
        StepsAndLogic.interchange_R1_and_R2(matrix, row, column);
        //Step-2 >> Interchanging the R1 <--> R3 -- (If R1 and R2 don't have their first element as 1)
        StepsAndLogic.interchange_R1_and_R3(matrix, row, column);
        //Step-3 >> Multiplying (R1 * -1R1) (If R1's 1st element is negative to make it pos)
        StepsAndLogic.if_R1_1st_Element_is_Neg(matrix, row, column);
        //Step-4 >> Adding (R1 +1R1) (If R1's 1st element is 0 then adding 1 in whole row)
        StepsAndLogic.if_R1_1st_Element_is_Zero_0(matrix);
        //Step-5 >> Dividing (R1 / NR1) -- (If R1's 1st element is not 1, and it's not negative
        StepsAndLogic.if_R1_1st_Element_is_Pos_But_Not_1(matrix, row, column);
        //Step-6 >> Replacing the R2's 1st Element by 0 using multiplication method (Working For -ve and +ve)
        StepsAndLogic.replace_2ndRow_and_1st_Column_by_0(matrix,row,column);
        //Step-7 >> Replacing the R3's 1st Element by 0 using multiplication method (Working For -ve and +ve)
        StepsAndLogic.replace_3rdRow_and_1st_Column_by_0(matrix, row, column);
        //Step-8 >> Interchanging the R2 <--> R3 (If R2 don't have the first element as 1)
        StepsAndLogic.interchange_R2_and_C2_by_R3_if_R3_have_1(matrix, row, column);
        //Step-9 >> Multiplying (R2 * -1R2) (If R2's 1st element is negative to make it pos)
        StepsAndLogic.if_R2_and_C2_1st_Element_is_Neg(matrix, row, column);
        //Step-10 >> Adding (R2 +1R2) (If R2's 1st element is 0 then adding 1 in whole row)
        StepsAndLogic.if_R2_and_C2_1st_Element_is_Zero_0(matrix);
        //Step-11 >> Dividing (R2 / NR2) -- (If R2's 1st element is not 1, and it's not negative
        StepsAndLogic.if_R2_and_C2_1st_Element_is_Pos_But_Not_1(matrix, column);
        //Step-12 >> Replacing the R3's 2nd Element by 0 using multiplication method (Working For -ve and +ve)
        StepsAndLogic.replace_3rdRow_and_2nd_Column_by_0(matrix,row,column);
        //Step-13 >> Dividing R3 whole Row with R3 (1/N)
        StepsAndLogic.dividing_R3_full_Row_With_R3_C3(matrix);
        StepsAndLogic.changingIn_R2AndC3_For_Neg_Pos(matrix);
        StepsAndLogic.changingIn_R1AndC3_For_Neg_Pos(matrix);
        StepsAndLogic.changingIn_R1AndC2_For_Neg_Pos(matrix);
        //Displaying the Values of X Y and Z equation for Simplified Answer

        System.out.print("\nDisplaying the Values of Equation <<X-Y-Z>> \n");
        //Display the values
        StepsAndLogic.logic_and_Displaying_the_values_of_X_Y_Z(matrix);

        //For Displaying the Matrix
        for(int i=1; i < row; i++){
            for (int j =1 ; j< column; j++){
                System.out.print((int)matrix[i][j]+ " ");
            } //inner for
            System.out.println();
        } //outer for

    }   // main method
} //main class