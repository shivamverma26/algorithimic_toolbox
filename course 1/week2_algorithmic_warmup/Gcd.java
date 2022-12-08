//3
import java.util.Scanner;  
public class Gcd  
{  
public static void main(String[] args)   
{  
int a, b, gcd = 0;  
Scanner sc = new Scanner(System.in);  
a = sc.nextInt();     
b = sc.nextInt();  
gcd = findGCD(a, b);  
System.out.println(gcd);  
}  
public static int findGCD(int a, int b)  
{  
while(b != 0)  
{  
if(a > b)  
a -=b;
else  
  b -=a;  
}  
return a;  }  
}  