// 1 Fibonacci Number;

import java.util.Scanner;
 public class Fibonacci {
    static int getFibonacci(int N)
    {
        int a = 0, b = 1;
        int c = 0;
        while (c < N) {
         int  temp = b + a;
            a = b;
            b = temp;
            c = c + 1;
        } return a;
    }
    public static void main(String args[])
    {
Scanner sc=new Scanner(System.in);
int N=sc.nextInt();
      System.out.println(getFibonacci(N)); 
          

    }
}
