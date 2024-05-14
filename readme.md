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