package mypkg;
import java.util.Scanner;
public class MyCalc { 
	
	public int sum(int a, int b)
	{
		return (a+b);
	}
	public int diff(int a, int b)
	{
		return (a-b);
	}
	public int mul(int a, int b)
	{
		return (a*b);
	}
	public void display()
	{
		System.out.println("Hello Barclays");
	}
	public void Greeting()
	{
		System.out.println("Hello from Barclays Team");
	}
	public static void main(String[] args) {
		
		MyCalc calc = new MyCalc();
		Scanner sc = new Scanner(System.in);
		int num1;
		int num2;
		System.out.println("Enter the value of Num1 : ");
		num1 = sc.nextInt();
		System.out.println("Enter the value of Num2 : ");
		num2= sc.nextInt();
		System.out.println("Sum is : "+calc.sum(num1, num2));
		System.out.println("Diff is : "+calc.diff(num1, num2));
		System.out.println("Mul is : "+calc.mul(num1, num2));
		calc.display();
		calc.Greeting();
	}
}
