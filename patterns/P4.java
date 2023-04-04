/* 
    10
         *
        ***        
       *****       
      *******      
     *********     
    ***********    
   *************   
  ***************  
 ***************** 
*******************
 ***************** 
  ***************  
   *************   
    ***********    
     *********     
      *******      
       *****
        ***
         * 
*/

import java.util.Scanner;

public class P4{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        for(int i=1 ; i<=n ; i++) // spacy pyramid
        {
            // j -> empty Spaces
            // k -> stars
            for(int j=1 ; j<=n-i ; j++)
            {
                System.out.print(" ");
            }
            for(int j=1; j<=i ;j++)
            {
                System.out.print(" *");
            }
            System.out.println();
        }

        for(int i=1 ; i<=n ; i++) // Upper-Side of Diamond
        {
            // j -> empty Spaces
            // k -> stars
            for(int j=1 ; j<=n-i ; j++)
            {
                System.out.print(" ");
            }
            for(int k=1; k<=i ;k++)
            {
                System.out.print('*');
            }
            for(int k=1; k<=i-1;k++)
            {
                System.out.print('*');
            }
            for(int j=1 ; j<=n-i ; j++)
            {
                System.out.print(" ");
            }
            System.out.println();
        }

        for(int i=n-1 ; i>0 ; i--) // Lower Side of Diamond 
        {
            // j -> empty Spaces
            // k -> stars
            for(int j=1 ; j <= n-i ; j++)
            {
                System.out.print(" ");
            }
            for(int k=1; k<=i ;k++)
            {
                System.out.print('*');
            }
            for(int k=1; k<=i-1;k++)
            {
                System.out.print('*');
            }
            for(int j=1 ; j<=n-i ; j++)
            {
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}