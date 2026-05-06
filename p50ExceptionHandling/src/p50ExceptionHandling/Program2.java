package p50ExceptionHandling;

import java.util.Scanner;

public class Program2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Connection established");

		try{
			System.out.println("Enter the value of a :");
			int a = scan.nextInt();
			System.out.println("Enter the value of b :");
			int b = scan.nextInt();
			int res = a / b;
			System.out.println("DIvision result is " + res);

			System.out.println("Enter the size of the Array :");
			int size = scan.nextInt();
			int arr[] = new int[size];
			System.out.println("Enter the element to be inserted in Array");
			int element = scan.nextInt();
			System.out.println("Enter an index at which element to be inserted");
			int index = scan.nextInt();
			arr[index] = element;
			System.out.println("Element has been stored in Array");
		}

		catch (ArithmeticException e1)
		{
			System.out.println("Please do not enter denominator as ZERO (0)");
		}
		catch (NegativeArraySizeException e2)
		{
			System.out.println("do not enter negative size for Array");
		}
		catch (ArrayIndexOutOfBoundsException e3)
		{
			System.out.println("Please Access array within its boundaries");
		}
		catch (Exception e)
		{
			System.out.println("Exception handled");
		}

		System.out.println("Connection is terminated");
		
		scan.close();

	}
}
