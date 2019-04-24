/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package markov_matrix;

/**
 *
 * @author Acer
 */
import java.util.Scanner;
public class Markov_matrix {
      static boolean markovmatrix(float mt[][],int r,int c)
      { 
          for(int i=0;i<r;i++)
        {
            float sum=0;
            for(int j=0;j<c;j++)
            {
              sum=sum+mt[i][j];
            }
            if(sum!=1)
                return false;
            }
          return true;
      }

    static void print(float mt[][],int r,int c)
    {
        System.out.println("Given Matrix ::");
       for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
              System.out.print(mt[i][j]+"\t");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter row");
        int r= sc.nextInt();
        System.out.println("Enter colum");
        int c= sc.nextInt();
        float [][] mt= new float[r][c];
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                mt[i][j]=sc.nextFloat();
            }
        }
        print(mt,r,c);
        boolean n=markovmatrix(mt,r,c);
        if(n==true)
            System.out.println("Markov Matrix");
        else
           System.out.println("Not Markov Matrix"); 
    }
    
}
