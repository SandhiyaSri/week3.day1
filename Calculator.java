package week3.day1;

public class Calculator {
	public void add(int a,int b)
	{
		System.out.println(a+b);
	}
	public void add(int a,int b,int c)
	{
		System.out.println(a+b+c);
	}
	public void multiply(int a,int b)
	{
		System.out.println(a*b);
	}
	
	public void multiply(int a,double b)
	{
		System.out.println(a*b);
	}
	public void subtract(int a,int b)
	{
		System.out.println(a-b);
	}
	public void subtract(double a,double b)
	{
		System.out.println(a-b);
	}
	public void divide(int a,int b)
	{
		System.out.println(a/b);
	}
	public void divide(double a,int b)
	{
		System.out.println(a/b);
	}
	public static void main(String[] args) {
		Calculator cal=new Calculator();
		cal.add(5, 10);
		cal.add(5, 10, 20);
		cal.subtract(10, 5);
		cal.subtract(10.5, 5.7);
		cal.multiply(10, 10);
		cal.multiply(10, 6.8);
		cal.divide(10, 5);
		cal.divide(10.6, 2);
	}
}
