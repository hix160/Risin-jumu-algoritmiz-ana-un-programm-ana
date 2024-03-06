package dip107;

import java.util.Scanner;

public class Ld4_211rdb146 {

	public static void main(String[] args) {
		System.out.println("Janis Kauls, 7, 211RDB146");
		Scanner sc = new Scanner(System.in);
		System.out.print("Ievadiet uzdevuma numuru (1 vai 2): ");
		int i, j, c, s;
		int A[][]= new int[10][10];
		
		if (sc.hasNextInt())
			s = sc.nextInt();
		else {
			System.out.println("input-output error");
			sc.close();
			return;
		}
		sc.close();
		
		if  (s==1) {
			c =1;
			for (i=9; i>=0; i--)
				for (j=11-i; j>=9-i; j--)
					if(j<=9) {
						A[i][j] = c;
						c = c+1;
					}
		}
		
		else if (s==2) {
			for (i=0; i<=8; i++)
				for (j=i+1; j<=9; j++)
					A[i][j] = j-i;
		}
		
		else {
			System.out.println("input-output error");
			return;
		}
		
		System.out.println("result:");
		for (i=0; i<10; i++) {
			for (j=0; j<10; j++)
				System.out.print(A[i][j] + "\t");
			System.out.println();
		}
		

	}

}
