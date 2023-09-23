/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class day5
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for(int i = 0;i<t;i++){
		    int n = sc.nextInt();
		    int A[] = new int[n];
		    int B[] = new int[n];
		    for(int j= 0; j<n;j++){
		        int a = sc.nextInt();
		        A[j] = a;
		    }
		    for(int k =0; k<n;k++){
		        int b = sc.nextInt();
		        B[k] = b;
		    }
		    int p=0;
		    for(int l=0;l<n;l++){
		        if((B[l]<=(2*A[l]))&&(A[l]<=(2*B[l]))){
		            p+=1;
		        }
		    }
		    System.out.println(p);
		    
		}
	}
}
