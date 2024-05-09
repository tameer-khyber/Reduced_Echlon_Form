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

    }   // main method
} //main class