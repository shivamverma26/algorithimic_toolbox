//4
import java.util.Scanner;
public class LCM {
  public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        long a=sc.nextInt();
        long b=sc.nextInt();
        long gcd = 1;

    for(long i = 1; i <= a && i <= b; ++i) {
      if(a % i == 0 && b % i == 0)
        gcd = i;
    }

    long lcm = (a * b) / gcd;
    System.out.print(lcm);
  }
}
