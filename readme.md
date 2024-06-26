<h1>Reduced Echelon Form (REF)</h1>
<h2>Overview</h2>

The Reduced Echelon Form (REF), also known as Row Reduced Echelon Form (RREF), is a matrix form used in linear algebra to simplify systems of linear equations. This form is achieved through Gaussian elimination (and sometimes Gauss-Jordan elimination), making it easier to understand and solve the system of equations.

Characteristics of Reduced Echelon Form
A matrix is in Reduced Echelon Form if it meets the following conditions:

<h3>Leading 1</h3>
Each leading entry (pivot) in a row is 1 and is the only non-zero entry in its column.
Zero Rows: Any rows that are entirely zeroes are at the bottom of the matrix.
Leading 1s Stagger: The leading 1 in each non-zero row appears to the right of the leading 1 in the row above it.
Zeroes Above and Below Leading 1s: All entries in the column containing a leading 1, except the leading 1 itself, are zeroes.
Steps to Convert a Matrix to Reduced Echelon Form
To convert a matrix to its Reduced Echelon Form, follow these steps:

Identify the leftmost non-zero column: This column contains the leading 1 of the first row.
Create a leading 1: Scale the row to turn the leftmost non-zero entry into a 1.
Zero out the column: Use row operations to create zeroes in all other entries of the column containing the leading 1.
Repeat for remaining rows: Move to the next row and column, and repeat the process until the entire matrix is in reduced echelon form.

<h4>A = [ 2  1 -1  8     -3 -1  2 -11     -2  1  2 -3 ]</h4>
Step-by-step transformation to Reduced Echelon Form:

<h4>Create a leading 1 in the first column:</h4>
(1/2)R1 -> R1
R1 = [ 1  0.5 -0.5  4 ]
<h4>Eliminate the first column in the other rows:</h4>
R2 + 3R1 -> R2
R2 = [ 0  0.5  0.5  1 ]

R3 + 2R1 -> R3
R3 = [ 0  2  1  5 ]
<h4>Create a leading 1 in the second row:</h4>
(1/0.5)R2 -> R2
R2 = [ 0  1  1  2 ]

<h4>Eliminate the second column in the other rows:</h4>
R1 - 0.5R2 -> R1
R1 = [ 1  0 -1  3 ]

R3 - 2R2 -> R3
R3 = [ 0  0 -1  1 ]

<h4>Create a leading 1 in the third row:</h4>
(-1)R3 -> R3
R3 = [ 0  0  1 -1 ]

<h4>Eliminate the third column in the other rows:</h4>
R1 + R3 -> R1
R1 = [ 1  0  0  2 ]

R2 - R3 -> R2
R2 = [ 0  1  0  3 ]
The matrix in Reduced Echelon Form is:
REF(A) = [ 1  0  0  2           0  1  0  3           0  0  1 -1 ]

<h2>Usage</h2>
Reduced Echelon Form is particularly useful for:

=> Solving systems of linear equations. <br>
=> Determining the rank of a matrix.<br>
=> Finding the inverse of an invertible matrix. <br>
=> Identifying free variables and pivot variables in a system of linear equations.

<h2>Functions and Implementations</h2>
Here is a simple implementation in Java:

import java.util.Arrays;

public class MatrixUtils {

    public static void toReducedRowEchelonForm(double[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        int lead = 0;
        for (int r = 0; r < rows; r++) {
            if (lead >= cols) {
                return;
            }
            int i = r;
            while (matrix[i][lead] == 0) {
                i++;
                if (i == rows) {
                    i = r;
                    lead++;
                    if (cols == lead) {
                        return;
                    }
                }
            }
            double[] temp = matrix[r];
            matrix[r] = matrix[i];
            matrix[i] = temp;

            double lv = matrix[r][lead];
            for (int j = 0; j < cols; j++) {
                matrix[r][j] /= lv;
            }

            for (i = 0; i < rows; i++) {
                if (i != r) {
                    lv = matrix[i][lead];
                    for (int j = 0; j < cols; j++) {
                        matrix[i][j] -= lv * matrix[r][j];
                    }
                }
            }
            lead++;
        }
    }

    public static void printMatrix(double[][] matrix) {
        for (double[] row : matrix) {
            System.out.println(Arrays.toString(row));
        }
    }

    public static void main(String[] args) {
        double[][] matrix = {
            {2, 1, -1, 8},
            {-3, -1, 2, -11},
            {-2, 1, 2, -3}
        };

        System.out.println("Original Matrix:");
        printMatrix(matrix);

        toReducedRowEchelonForm(matrix);

        System.out.println("\nReduced Row Echelon Form:");
        printMatrix(matrix);
    } }

<h2>Conclusion</h2>
Understanding and being able to convert matrices to Reduced Echelon Form is a fundamental skill in linear algebra. It simplifies complex problems and provides a clear method for solving systems of linear equations and analyzing matrix properties.