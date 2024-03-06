package dip107;

import java.util.Scanner;
import java.util.Random;

public class Md4_211rdb146 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int ch, i, j, punkti;
		int ir, nav, count;
		int a[][] =	{{0, 1, 2, 0, 2},
					{4, 4, 4, 4, 4},
					{0, -1, 8, 10, -1},
					{0, 3, -1, 2, 1},
					{4, 8, 4, 8, 12},
					{-1, -1, 2, 0, 1},
					{1, 8, 2, 4, -1},
					{8, 16, -1, 4, 0}};
		
		System.out.println("Janis Kauls 7gr 211RDB146");
		System.out.print("Ka aizpildit masivu (1, 2 vai 3)?: ");
		if (sc.hasNextInt()) {
			ch = sc.nextInt();
		}
		else {
			System.out.println("input-output error");
			sc.close();
			return;
		}
		
		Random rnd = new Random();
		
		switch (ch) {
		case 1:												//masīvu aizpilda lietotajs
			for (i=0; i<8; i++)
				for(j=0; j<5; j++) {
					
					if (sc.hasNextInt()) {
						punkti = sc.nextInt();
						if (punkti >= -1 && punkti <= 20)	//punktu diapazons [-1:20]
							a[i][j] = punkti;
						else {
							System.out.println("input-output error");
							sc.close();
							return;
						}
					}			
					else {
						System.out.println("input-output error");
						sc.close();
						return;
					}
				}
			break;
		case 2:												//random generets masivs
			for (i=0; i<8; i++)
				for(j=0; j<5; j++)
					a[i][j] = rnd.nextInt(22) - 1 ;			//punkti diapazons [-1:20]
			break;
			
		case 3: break;										//lieto jau iedoto masivu
		
		default:
			System.out.println("input-output error");
			sc.close();
			return;
		}
		
		sc.close();
		
		for (i=0; i<8; i++) {								//printe masivu
			for(j=0; j<5; j++)
				System.out.print(a[i][j] + "\t");
			System.out.println();
		}
		
		System.out.println("result:");
		System.out.print("numbers:");
		count = 0;
		for (i=0; i<8; i++) {
			nav = 0;
			ir = 0;
			
			for (j=0; j<5; j++) {
				if (a[i][j] >= 0) nav = 1 ;					// ja nav diskvalificets tad nav==1
				if (a[i][j] < 0) ir = 1;					// ja ir diskvalificets kada no etapiem tad ir==1
			}
			if (nav==1 && ir ==0) {
			System.out.print((i+1) + " ");
			count++;
			
			}
		}
		System.out.println("\ncount: " + count);
	}

}
