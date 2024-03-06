package dip107;

import java.util.Scanner;

public class Md2_211rdb146 {

	public static void main(String[] args) {
		System.out.println("211RDB146 Janis Kauls 7");
		Scanner sc = new Scanner(System.in);
		double x, y, v, g, a, t;
		boolean trapija = false, parikalnam = false;
		
		a = Math.toRadians(50) ; g = 23.95 ; t= 0.05; //lenkis, paatrinajums, laiks
		
		System.out.print("v0:");
		if (sc.hasNextDouble())
			v = sc.nextDouble();
		else {
			System.out.println("input-output error");
			sc.close();
			return;
		}
		sc.close();
		System.out.println("result:");
		System.out.println("t  \t  x \t  y");
		
		do {
			x = v*t*Math.cos(a);
			y = v*t*Math.sin(a)-(g*(t*t)/2);
			System.out.printf("%3.2f\t%7.3f\t%7.3f\n", t, x, y);
			t +=0.05;
			if (x>=12) {
				if (y>8) {
					if (x>=14 && x<=17 && y>=8 && y<=10) {
						trapija = true;
					}
				}
				else {
					parikalnam = true;
				}
			}
			
		} while( y>=0 && trapija==false && parikalnam==false);
		if (trapija)
			System.out.println("the target was destroyed");
		else
			System.out.println("shot off the target");
		
	}

}
