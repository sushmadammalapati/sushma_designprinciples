package com.epam;

public class Solve extends Simplecalculator {

	 public void formulate(double num1, double num2, char operator, Operators operators)
	 {
	  double output;
	  try
	  {
	    switch(operator)
	    {
	     case '+':
	  	output=operators.addition(num1,num2);
	        break;
	     case '-':
	   	output=operators.subtraction(num1,num2);
	        break;
	     case '*':
	        output=operators.multiplication(num1,num2);
	        break;
	     case '/':
	        output=operators.division(num1,num2);
	        break;
	     default:
	        System.out.printf("Enter only the mentioned operator");
	        return;
	    }
	    System.out.println(num1+""+operator+""+num2+": "+output);

	  } 
	  catch (Exception e)
	  {
	   System.out.println("Enter arithematic operators only");
	  }
	 }
	}