package arohatechproject;

import java.util.Scanner;

public class numberpattern {
	public static void main(String[] args) {
		
		int i,j,k =1;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of lines");
		int rows=sc.nextInt();
		System.out.println("Triangle using alphabet");
		for(i = 1; i <= rows; i++) {
			for(j = 1; j <= i; j++, k++) {
				System.out.print((char) (k + 64));
			}
			System.out.println();
		}

		
		
		int n=6;
		for(int i1=n-1;i1>=1;i1--) {
			for(int j1=1; j1<=i1; j1++) {
				
				
			
				System.out.print(j1+" ");
			}
			System.out.println();
		}}
	}

