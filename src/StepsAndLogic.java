public class StepsAndLogic {

    //Interchanging Rows by <Usaid Chandio>
    static void interchange_R1_and_R2(double[][] matrix, int row, int column){
        //Step-1
        /* checking if R1 & C1's 1st element is Not 1
         * and the R2 & C1's 1st element is 1 then We're interchanging
         * the R2 to R1 means R1's All elements replace with R2's all elements
         * and R2's all elements replace with R1's all elements */

        if(matrix[1][1] !=1){ //checking R1's 1st Element is not = 1
            if (matrix[2][1] == 1){ // checking R2's 1st Element is = 1
                int[][] temp = new int[row][column];
                for (int i =1; i < row; i++){
                    for (int j =1; j < column; j++){  //where N= the number Columns 1st col then 2nd...
                        temp[i][j] = (int) matrix[1][j];   //Assigning R1 & CN value to temp array
                        matrix[1][j] = matrix[2][j]; // Assigning R2 & CN value to R1 & C1
                        matrix[2][j] = temp[i][j];   // Assigning Temp array values to R2 & CN
                        /*Note Temp array now have R1 & CN values because we are first assigning
                          the R1 & CN values to temp array */
                    } //inner for
                } //outer for
            } // inner if
        } //outer if
    }    static void if_R1_1st_Element_is_Neg(double[][] matrix, int row, int column){
        /* Checking the R1's 1st Element is Negative if it is negative then
         * we have to multiply the whole row with (-1)
         * The Logic is like this -- R1 (R1 x -1)                     */
        if (matrix[1][1] < 0){ //checking the R1's First element is less than 0 means negative
            for (int i = 1; i < row; i++) {
                for (int j = 1; j < column; j++) {
                    /* Multiplying R1 & CN to -1
                     * Means we are multiplying R1 complete row with -1
                     * where N= the number Columns 1st col then 2nd...   */
                    matrix[1][j] = matrix[1][j] * -1;
                } //inner for
            } //outer for
        } //outer if
    }
    }
