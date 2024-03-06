package dip107;

import java.util.Scanner;

public class Mda1_211rdb146 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		float x, y;
		x = 0;
		y = 0;
		
		System.out.println("211RDB146 Jānis Kauls 7");
		
		System.out.print("x=");
		if (sc.hasNextFloat())
			x = sc.nextFloat();
		else {
			System.out.println("input-output error");
			sc.close();
			return;
		}
		System.out.print("y=");
		if (sc.hasNextFloat())
			y = sc.nextFloat();
		else {
			System.out.println("input-output error");
			sc.close();
			return;
		}
		sc.close();
		
		System.out.println("result:");
		if (((x-4)*(x-4)+(y-5)*(y-5)<= 1 ) && x>3 && x<5 || ((x-10)*(x-10)+(y-5)*(y-5)<= 1) && x>9 && x<11 )
			System.out.println("green");
		else
			if (-x+10>=y && y>=6 && x>=2)
				System.out.println("blue");
			else
				if (x>=2 && x<=12 && y>=5 && y<=8)
					System.out.println("red");
					else
						System.out.println("white");
	}
	
}
