package com.epam;
import java.util.Scanner;
public class Simplecalculator {

	public static void main(String[] args) {

		   Scanner scanner = new Scanner(System.in);
		   double num1, num2;
		   System.out.print("Enter first and second number:");
		   num1 = scanner.nextDouble();
		   num2 = scanner.nextDouble();
		   System.out.print("Enter an operator (+, -, *, /): ");
		   char operator = scanner.next().charAt(0);
		   Operators operators=new Operators();
		   operators.formulate(num1,num2,operator,operators);
		 }
		}