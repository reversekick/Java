package com.bitlrn.intro.arrays;

import java.util.Scanner;

public class ArraySample {
    /**
     * Initialization of array sample
     *  -- 1. When declaring array do initialization
     *  -- 2. Declare an array based on size and then initialize
     * @param sizeOfArray -- how big should be the array for the 2. type of initialization
     * @return array initialized using 2. approach
     */
    public int[] initArray(int sizeOfArray){

        //1.
        int[] arrayInit = {1,2,3,4,5,6,7,8,10};
        System.out.println("Fixed size array of 10 items initialized:");
        for(int j =0; j<arrayInit.length;++j){
            System.out.println("arrayInit["+j+"]="+arrayInit[j]);
        }

        //2.
        int[] array = new int[sizeOfArray];
        System.out.println("Printing the array of size given size = "+sizeOfArray );
        for(int i=0; i <array.length;++i){
            array[i] =i;
            System.out.println("arrayInit["+i+"]="+array[i]);
        }
        return array;
    }

    /**
     * Two dimensional array with given rows and given columns
     * @param rows
     * @param columns
     * @return
     */
    public int[][] init2DArray(int rows, int columns){
        int[][] twoDimensional = new int[rows][columns];
        for( int i =0; i < rows; i++){
            for ( int j =0; j < columns; j++){
                twoDimensional[i][j] = j;
                System.out.println("twoDimensional["+i+"]["+j+"]="+twoDimensional[i][j]);
            }
        }
        return twoDimensional;
    }

    public static void main(String[]args){
        ArraySample as = new ArraySample();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the size of array to be initialized and printed = ");
        int input = scanner.nextInt();
        as.initArray(input);

        System.out.println("Please enter the number of rows for a 2D array=");
        int rows = scanner.nextInt();

        System.out.println("Please enter the number of columns for a 2D array=");
        int columns = scanner.nextInt();

        System.out.println("Two dimensional array of rows="+rows + " , columns = "+columns);
        as.init2DArray(rows,columns);
    }
}
