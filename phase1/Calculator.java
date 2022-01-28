package phase1;
import java.util.Scanner;
import java.util.Scanner;

public class Calculator {
	public static void main(String[] args) {
		// TODO Auto-generated method stub


char operator; 
Double number1, number2, result;

//create an object of Scanner class 
Scanner input =  new Scanner(System.in); 

System.out.println("Choose an operator:+ ,-,*,/ ");
		operator = input.next().charAt(0);



System.out.println("Enter first number"); 
number1= input.nextDouble();

System.out.println("Enter second number"); 
		number2= input.nextDouble();

switch (operator) {
//performs addition between numbers

case '+':
result = number1 + number2;

System.out.println(number1+"+"+ number2+"=" +result);

break;

// performs subtraction between numbers

case '-':


result=number1- number2;
System.out.println(number1+"-"+ number2+"=" + result);
break;

//perform multiplication between numbers case
case '*':

result=number1*number2;

System.out.println(number1+"*"+ number2+"=" + result);

break;

//performs division between numbers

case '/':

result=number1/number2;
System.out.println(number1+""+ number2+"=" + result);
break;

default:

System.out.println("Invalid operator");

break;
}

input.close();

	}
}	
