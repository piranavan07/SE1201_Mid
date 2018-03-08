/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matrixcalc;
 
import java.util.Scanner;
/**
 *
 * @author Piranavan
 */
 
public class Matrixcalc
{
    /**
     * @param args the command line arguments
     */
    
    public static void main(String args[])
    {
        int n,m,o;
        try (Scanner input = new Scanner(System.in)){

            System.out.println("Enter the no.of rows in 1st matrix");
            n= input.nextInt();
	    System.out.println("Enter the no.of cols in 1st matrix");
	    m=input.nextInt();
	    System.out.println("Enter the no.of cols in 2st matrix");
	    o=input.nextInt();

            int[][] input_one = new int[n][m];
            int[][] input_two = new int[m][o];
            int[][] output = new int[n][o];
            System.out.println("Enter the elements of 1st martix row wise \n");
            for (int i = 0; i < n; i++)
            {
                for (int j = 0; j < m; j++)
                {
                    input_one[i][j] = input.nextInt();
                }
            }
            System.out.println("Enter the elements of 2nd martix row wise \n");
            for (int i = 0; i < m; i++)
            {
                for (int j = 0; j < o; j++)
                {
                    input_two[i][j] = input.nextInt();
                }
            }
            System.out.println("Multiplying the matrices..");
            for (int i = 0; i < n; i++)
            {
                for (int j = 0; j < o; j++)
                {
                    for (int k = 0; k < n; k++)
                    {
                        output[i][j] = output[i][j] + input_one[i][k] * input_two[k][j];
                    }
                }
            }
            System.out.println("The product is:");
            for (int i = 0; i < n; i++)
            {
                for (int j = 0; j < o; j++)
                {
                    System.out.print(output[i][j] + " ");
                }
                System.out.println();
            }
        }
    }
}