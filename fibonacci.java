package fibonacci;

import java.util.Scanner;
public class Fibonacci {

    public static void main(String[] args) {
         Scanner input  = new Scanner(System.in);
      public static void printfb(int i,int x,int y) {
        int fibo ;
        if ( i == 0) {
            System.out.println("");
            return ;
        }
        else {
            fibo = x + y ;
            System.out.print(fibo + " ");
            x= y ;
            y = fibo ;
            printfb(i-1,x,y);
        }
    }
        int range = input.nextInt();
        if ( range == 1 ) 
                {
                System.out.println("0");
                }
        else if ( range == 2) 
        {
        System.out.println("0 1");
        }
        else 
        {
            System.out.print("0 1 ");
            printfb(range- 2,0,1);
        }
    }
    
    }
    
