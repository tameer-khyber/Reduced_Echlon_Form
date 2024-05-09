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
    static void if_R1_1st_Element_is_Zero_0(double[][] matrix){
        /* Checking the R1's First Element is 0 if it is
         * then we are add +1 to whole Row */
        if (matrix[1][1] == 0) { //checking the R1's 1st Element is 0
            //if its 0 then we are adding +1 in R1 CN
            matrix[1][1] = matrix[1][1] + 1;
            matrix[1][2] = matrix[1][2] + 1;
            matrix[1][3] = matrix[1][3] + 1;
            matrix[1][4] = matrix[1][4] + 1;
        } //outer if
    }
    //     -----This Whole Logic is only for replacing R2 And R3 1st Element by 0 -----
    static void replace_2ndRow_and_1st_Column_by_0(double[][] matrix, int row, int column){
        /* Checking the R2's 1st element is not 0 and its negative
         * then we're applying the multiplication method
         * The Logic is Like that (R2 + NR1) where N is any constant
         * of R2's 1st Element <<(It is Only Working For Negative)>>   */
        if(matrix[2][1]!=0){ //checking R2's 1st Element is not 0
            if(matrix[2][1] < 0){ //checking R2's 1st Element is negative
                for (int i = 1; i < row; i++) {
                    for (int j = 1; j < column; j++) {
                        //Assigning R2 - NR2 * R1 to temp variable
                        int temp = (int) (matrix[2][1] - (matrix[2][1] * matrix[1][1]));
                        //Assigning R2 - NR2 * R1 to (R2 & C2)
                        matrix[2][2] = matrix[2][2] - (matrix[2][1] * matrix[1][2]);
                        //Assigning R2 - NR2 * R1 to (R2 & C3)
                        matrix[2][3] = matrix[2][3] - (matrix[2][1] * matrix[1][3]);
                        //Assigning R2 - NR2 * R1 to (R2 & C4)
                        matrix[2][4] = matrix[2][4] - (matrix[2][1] * matrix[1][4]);
                        //Assigning Temp variable value to (R2 & C1)
                        matrix[2][1] = temp;
                    } //inner for
                } //outer for
            } //inner if
        } //outer if


    }
