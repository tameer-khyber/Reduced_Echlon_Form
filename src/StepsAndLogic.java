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

    }
    static void interchange_R1_and_R3(double[][] matrix, int row, int column){
        //Step-2
        /* checking if  R1 & C1's 1st element is Not 1
         * and the R2 & C1's 1st element is also not 1
         * then we check if R3 & C1 1st element is 1 then
         * We're interchanging the R3 to R1 means R1's
         * All elements replace with R3's all elements
         * and R3's all elements replace with R1's all elements */
        if(matrix[1][1] !=1){ //checking R1's 1st Element is not = 1
            if (matrix[3][1] == 1){ // checking R3's 1st Element is = 1
                int[][] temp = new int[row][column];
                for (int i =1; i < row; i++){
                    for (int j =1; j < column; j++){  //where N= the number Columns 1st col then 2nd...
                        temp[i][j] = (int) matrix[1][j];   //Assigning R1 & CN value to temp array
                        matrix[1][j] = matrix[3][j]; // Assigning R2 & CN value to R1 & C1
                        matrix[3][j] = temp[i][j];   // Assigning Temp array values to R2 & CN
                        /*Note Temp array now have R1 & CN values because we are first assigning
                          the R1 & CN values to temp array */
                    } //inner for
                } //outer for
            } // inner if
        } //outer if
    }

    static void if_R1_1st_Element_is_Neg(double[][] matrix, int row, int column){
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

    static void if_R1_1st_Element_is_Pos_But_Not_1(double[][] matrix, int row, int column){
        //Step-3
        /* Checking If (R1's -- 1st Element is not 1, and it's greater than 0)
         * means R1's 1st element is not a negative number then we perform the
         * Elementary Row operations. Here we Divide the R1's -- 1st element to
         * with complete R1 The logic is like this.
         * (R1 (1/N) where N = The element that you want to change.In our case
         * N = R1 & C1 means R1's 1st element because we want R1 & C1 1st Element as 1 */
        if(matrix[1][1] > 0 && matrix[1][1] !=1) { //checking R1's 1st element is greater than 0 and not = 1
            double divisor =  matrix[1][1];
            for (int j = 1; j < column; j++) {
                matrix[1][j] /= divisor;
            } //inner for
        } //outer for
    } //outer if

    //     -----This Whole Logic is only for replacing R2 And R3 1st Element by 0 -----
    static void replace_2ndRow_and_1st_Column_by_0(double[][] matrix, int row, int column) {
        /* Checking the R2's 1st element is not 0 and its negative
         * then we're applying the multiplication method
         * The Logic is Like that (R2 + NR1) where N is any constant
         * of R2's 1st Element <<(It is Only Working For Negative)>>   */
        if (matrix[2][1] != 0) { //checking R2's 1st Element is not 0
            if (matrix[2][1] < 0) { //checking R2's 1st Element is negative
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
        // <<(It is Only Working For Positive)>>
        if (matrix[2][1] > 0) { //checking R2's 1st Element is Greater than 0 means a positive number
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
        } //outer if
    }


    static void replace_3rdRow_and_1st_Column_by_0(double[][] matrix, int row, int column){
        /* Checking the R3's 1st element is not 0 and its negative
         * then we're applying the multiplication method
         * The Logic is Like that (R3 + NR1) where N is any constant
         * of R3's 1st Element <<(It is Only Working For Negative)>>   */
        if(matrix[3][1]!=0){ //checking R3's 1st Element is not 0
            if(matrix[3][1] < 0){ //checking R3's 1st Element is negative
                for (int i = 1; i < row; i++) {
                    for (int j = 1; j < column; j++) {
                        //Assigning R3 - NR3 * R1 to temp variable
                        int temp = (int) (matrix[3][1] - (matrix[3][1] * matrix[1][1]));
                        //Assigning R3 - NR3 * R1 to (R3 & C2)
                        matrix[3][2] = matrix[3][2] - (matrix[3][1] * matrix[1][2]);
                        //Assigning R3 - NR3 * R1 to (R3 & C3)
                        matrix[3][3] = matrix[3][3] - (matrix[3][1] * matrix[1][3]);
                        //Assigning R3 - NR3 * R1 to (R3 & C4)
                        matrix[3][4] = matrix[3][4] - (matrix[3][1] * matrix[1][4]);
                        //Assigning Temp variable value to (R3 & C1)
                        matrix[3][1] = temp;
                    } //inner for
                } //outer for
            } //inner if
        } //outer if

        // <<(It is Only Working For Positive)>>
        if(matrix[3][1]!=0){ //checking R3's 1st Element is not 0
            for (int i = 1; i < row; i++) {
                for (int j = 1; j < column; j++) {
                    //Assigning R3 - NR3 * R1 to temp variable
                    int temp = (int) (matrix[3][1] - (matrix[3][1] * matrix[1][1]));
                    //Assigning R3 - NR3 * R1 to (R3 & C2)
                    matrix[3][2] = matrix[3][2] - (matrix[3][1] * matrix[1][2]);
                    //Assigning R3 - NR3 * R1 to (R3 & C3)
                    matrix[3][3] = matrix[3][3] - (matrix[3][1] * matrix[1][3]);
                    //Assigning R3 - NR3 * R1 to (R3 & C4)
                    matrix[3][4] = matrix[3][4] - (matrix[3][1] * matrix[1][4]);
                    //Assigning Temp variable value to (R3 & C1)
                    matrix[3][1] = temp;
                } //inner for
            } //outer for
        } //outer if

    }

    //     -----This Whole Logic is only for Making the 1 in R2 & C2-----

    static void interchange_R2_and_C2_by_R3_if_R3_have_1(double[][] matrix, int row, int column){
        /* checking if  R2 & C2's 1st element is Not 1
         * and the R3 & C2's 1st element is 1
         * We're interchanging the R2 to R3 means R2's
         * All elements replace with R3's all elements
         * and R3's all elements replace with R2's all elements */
        if(matrix[2][2] !=1){ //checking R2's 1st Element is not = 1
            if (matrix[3][2] == 1){ // checking R3's 1st Element is = 1
                int[][] temp = new int[row][column];
                for (int i =1; i < row; i++){
                    for (int j =1; j < column; j++){  //where N= the number Columns 1st col then 2nd...
                        temp[i][j] = (int) matrix[2][j];   //Assigning R2 & CN value to temp array
                        matrix[2][j] = matrix[3][j]; // Assigning R2 & CN value to R3 & CN
                        matrix[3][j] = temp[i][j];   // Assigning Temp array values to R3 & CN
                        /*Note Temp array now have R3 & CN values because we are first assigning
                          the R3 & CN values to temp array */
                    } //inner for
                } //outer for
            } // inner if
        } //outer if
    }


    static void if_R2_and_C2_1st_Element_is_Neg(double[][] matrix, int row, int column){
        /* Checking the R2's 1st Element is Negative if it is negative then
         * we have to multiply the whole row with (-1)
         * The Logic is like this -- R2 (R2 x -1)                     */
        if (matrix[2][2] < 0){ //checking the R2's First element is less than 0 means negative
            for (int i = 1; i < row; i++) {
                for (int j = 1; j < column; j++) {
                    /* Multiplying R2 & CN to -1
                     * Means we are multiplying R2 complete row with -1
                     * where N= the number Columns 1st col then 2nd...   */
                    matrix[2][j] = matrix[2][j] * -1;
                } //inner for
            } //outer for
        } //outer if
    }
    static void if_R2_and_C2_1st_Element_is_Zero_0(double[][] matrix){
        /* Checking the R2's First Element is 0 if it is
         * then we are add +1 to whole Row */
        if (matrix[2][2] == 0) { //checking the R2's 1st Element is 0
            //if its 0 then we are adding +1 in R2 CN
            matrix[2][2] = matrix[2][2] + 1;
            matrix[2][3] = matrix[2][3] + 1;
            matrix[2][4] = matrix[2][4] + 1;
        } //outer if
    }
    static void if_R2_and_C2_1st_Element_is_Pos_But_Not_1(double[][] matrix, int column) {
        //Step-3
        /* Checking If (R2's -- 1st Element is not 1, and it's greater than 0)
         * means R2's 1st element is not a negative number then we perform the
         * Elementary Row operations. Here we Divide the R2's -- 1st element to
         * with complete R2 The logic is like this.
         * (R2 (1/N) where N = The element that you want to change.In our case
         * N = R2 & C2 means R2's 1st element because we want R2 & C2 1st Element as 1 */
        if (matrix[2][2] != 0 && matrix[2][2] != 1) { // checking R2's 1st element is not equal to 0 or 1
            double divisor = matrix[2][2]; // Store the value of matrix[2][2] as divisor
            for (int j = 1; j < column; j++) {
                matrix[2][j] /= divisor; // Divide each element by divisor
            }
        }
    }
    static void replace_3rdRow_and_2nd_Column_by_0(double[][] matrix, int row, int column){
        /* Checking the R2's 1st element is not 0 and its negative
         * then we're applying the multiplication method
         * The Logic is Like that (R2 + NR1) where N is any constant
         * of R2's 1st Element <<(It is Only Working For Negative)>>   */
        if(matrix[3][2]!=0){ //checking R3's 2nd Element is not 0
            if(matrix[3][2] < 0){ //checking R3's 2nd Element is negative
                for (int i = 1; i < row; i++) {
                    for (int j = 1; j < column; j++) {
                        //Assigning R3 - NR3 * R2 to temp variable bcz of 0
                        int temp = (int) (matrix[3][1] - (matrix[3][2] * matrix[2][1]));
                        //Assigning R3 - NR3 * R2 to temp2 variable bcz of 0
                        int temp2 = (int) (matrix[3][2] - (matrix[3][2] * matrix[2][2]));
                        //Assigning R3 - NR3 * R2 to (R2 & C3)
                        matrix[3][3] = matrix[3][3] - (matrix[3][2] * matrix[2][3]);
                        //Assigning R3 - NR3 * R3 to (R2 & C4)
                        matrix[3][4] = matrix[3][4] - (matrix[3][2] * matrix[2][4]);
                        //Assigning Temp variable value to (R3 & C1)
                        matrix[3][1] = temp;
                        //Assigning Temp variable value to (R3 & C2)
                        matrix[3][2] = temp2;
                    } //inner for
                } //outer for
            } //inner if
        } //outer if
        //  <<(It is Only Working For Positive)>>
        if(matrix[3][2]!=0){ //checking R3's 2nd Element is not 0
            for (int i = 1; i < row; i++) {
                for (int j = 1; j < column; j++) {
                    //Assigning R3 - NR3 * R2 to temp variable bcz of 0
                    int temp = (int) (matrix[3][1] - (matrix[3][2] * matrix[2][1]));
                    //Assigning R3 - NR3 * R2 to temp2 variable bcz of 0
                    int temp2 = (int) (matrix[3][2] - (matrix[3][2] * matrix[2][2]));
                    //Assigning R3 - NR3 * R2 to (R2 & C3)
                    matrix[3][3] = matrix[3][3] - (matrix[3][2] * matrix[2][3]);
                    //Assigning R3 - NR3 * R3 to (R2 & C4)
                    matrix[3][4] = matrix[3][4] - (matrix[3][2] * matrix[2][4]);
                    //Assigning Temp variable value to (R3 & C1)
                    matrix[3][1] = temp;
                    //Assigning Temp variable value to (R3 & C2)
                    matrix[3][2] = temp2;
                } //inner for
            } //outer for
        } //outer if
    }
    static void dividing_R3_full_Row_With_R3_C3(double[][] matrix){
        /* Dividing the Full R3 with R3 / C3 to make it R3's 3rd element 0
         * The Logic of This statement is like this R3 (1/N)
         * Where N = the R3's 3rd element here */
        if (matrix[3][3] !=1 && matrix[3][3]!=0){ //checking R3 & C3 is not 1 and 0
            //Assigning R3 & C4 to <R3 (1/N)>
            matrix[3][4] = matrix[3][4]/matrix[3][3];
            //Assigning R3 & C1 to <R3 (1/N)>
            matrix[3][1] = matrix[3][1]/matrix[3][3];
            //Assigning R3 & C2 to <R3 (1/N)>
            matrix[3][2] = matrix[3][2]/matrix[3][3];
            //Assigning R3 & C3 to 1 because become 1 anyhow with division, so we make it constant for simplify
            matrix[3][3] = 1;
        } //outer if
    }
    static void  changingIn_R2AndC3_For_Neg_Pos(double [][] matrix){
        //R2 + 2R3 (WORKING) FOR +ve
        if (matrix[2][3]<0){

            int temp1 = (int) (matrix[2][1]-(matrix[2][3]*matrix[3][1]));
            int temp2 = (int) (matrix[2][2]-(matrix[2][3]*matrix[3][2]));
            int temp3 = (int) (matrix[2][3]-(matrix[2][3]*matrix[3][3]));
            int temp4 = (int) (matrix[2][4]-(matrix[2][3]*matrix[3][4]));
            matrix[2][1]= temp1;
            matrix[2][2]=temp2;
            matrix[2][3]=temp3;
            matrix[2][4]=temp4;
        }// outer if

        //R2 + 2R3 (WORKING) FOR -ve
        if (matrix[2][3] !=0){
            if (matrix[2][3]<0){
                int temp = (int) (matrix[2][1]-(matrix[2][3]*matrix[3][1]));
                int temp2 = (int) (matrix[2][2]-(matrix[2][3]*matrix[3][2]));
                int temp3 = (int) (matrix[2][3]-(matrix[2][3]*matrix[3][3]));
                int temp4 = (int) (matrix[2][4]-(matrix[2][3]*matrix[3][4]));
                matrix[2][1]= temp;
                matrix[2][2] = temp2;
                matrix[2][3] = temp3;
                matrix[2][4] = temp4;
            } //inner if
        } //outer if

        //R2 + 2R3 (WORKING) FOR +ve
        if (matrix[2][3] !=0){
            if (matrix[2][3]>0){

                int temp = (int) (matrix[2][1]-(matrix[2][3]*matrix[3][1]));
                int temp2 = (int) (matrix[2][2]-(matrix[2][3]*matrix[3][2]));
                int temp3 = (int) (matrix[2][3]-(matrix[2][3]*matrix[3][3]));
                int temp4 = (int) (matrix[2][4]-(matrix[2][3]*matrix[3][4]));
                matrix[2][1]= temp;
                matrix[2][2] = temp2;
                matrix[2][3] = temp3;
                matrix[2][4] = temp4;
            } // inner if
        } //outer if

    }
}
