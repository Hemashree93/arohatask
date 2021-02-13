package arohatechproject;

import java.util.Scanner;

public class pattern {
public static void main(String[] args) {

	int i,j,n,k =1;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number of lines");
	n=sc.nextInt();
	System.out.println("Triangle using alphabet");
	for(i = 1; i <= n; i++) {
		for(j = 1; j <= i; j++, k++) {
			System.out.print((char) (k + 64));
		}
		System.out.println();
	}
}
}


