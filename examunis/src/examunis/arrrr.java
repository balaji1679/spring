package examunis;

import java.util.Arrays;
import java.util.Scanner;

public class arrrr {
	 public static int makeZero(int N,int[] A) {
		int target=Arrays.stream(A).sum()-N,size=-1,a=A.length;
		for(int lo=-1, hi=0,winSum=0;hi<a;++hi) {
			winSum += A[hi];
			while(lo+1<A.length&&winSum>target) {
				winSum-=A[++lo];
				
			}
			if(winSum==target) {
				size=Math.max(size, hi-lo);
			}
			
		}
		
		 int result = -404;
		 
		 return result;
	 }
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		int N=sc.nextInt();
		
		int[] A =new int[N];
		for(int i=0;i<N;i++)
		{
			A[i]= sc.nextInt();
		}
		sc.close();
		System.out.println(makeZero(N,A));
	}

}
