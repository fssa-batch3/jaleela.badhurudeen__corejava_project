package faceprep;

import java.util.Scanner;

public class TwoDArray {
	public static void main(String[] args) {
		int x=29;
		
		int[] ar = {1,5,9,12,15,18,20,23,25,30};
		int s=0,e=9;
		
		for(;s<=e;) {
			int m = (s+e)/2;
			if(ar[m]==x) {
				System.out.println("found");
				return;
				
			}
			else if(ar[m]>x) {
				e=m-1;
			}
			else
			{
				s=m+1;
			}

		}
		

		System.out.println("not found");
		
		
		Scanner sc =new Scanner(System.in);
		int m = sc.nextInt(),n=sc.nextInt();
	int[][] ar2= new int[m][n];
	int[][] ar2New= new int[m][n];

		
		for(int i=0;i<m;i++) {
			
			for(int j=0;j<n;j++) {
				
				ar2[i][j]=sc.nextInt();
//				ar2New[i][j]=sc.nextInt();

			//	System.out.println(ar2[i][j]);

				
			}

			
		}
		
		
		
		
for(int i=0;i<m;i++) {
			
			for(int j=0;j<n;j++) {
				
				// ar2[i][j]=sc.nextInt();
				System.out.print(ar2[i][j]+" ");

//				System.out.print(ar2New[i][j]+" ");

				
			}

			System.out.println();
		}
		
		

	}

}
