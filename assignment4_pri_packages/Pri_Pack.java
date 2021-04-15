package assignment4_pri_packages;

import java.util.Scanner;
import assignment4_test_pack.Test_Pack;

public class Pri_Pack {

    public static void main(String[] args) {

		Test_Pack f1 = new Test_Pack();		
		 
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter two numbers...");
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		int reverse = f1.reverse(x);
		
		int fact = f1.factor(x);
		
		int sub = f1.subtract(x, y);
		int mul = f1.multiply(x, y);
		double div = f1.devide(x, y);
		
		System.out.println("Factorial of "+ x + " is "+ fact);
		System.out.println("Reverse of "+ x + " is "+ reverse); 
		System.out.println("Subtraction result is "+ sub); 
		System.out.println("Multiplicaton result is "+ mul); 
		System.out.println("Division result is "+ div); 	
	}
    }