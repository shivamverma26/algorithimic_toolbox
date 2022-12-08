// 2 Maximum Pairwise Product;

import java.util.*;
import java.lang.*;
import java.io.*;


class maximumpair
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc= new Scanner(System.in);
		int t=sc.nextInt();
		long a[]=new long [t];
		for(int i=0;i<t;i++){
			a[i]=sc.nextInt();}
			Arrays.sort(a);
			long z=a[t-1]*a[t-2];
		System.out.println(z);
	}
}
