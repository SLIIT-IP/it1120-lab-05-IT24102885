import java.util.Scanner;
public class IT24102885Lab5Q1
{
	public static void main(String[]args)
	{
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the first integer: ");
		int FirstInteger = input.nextInt();
		
		System.out.print("Enter the second integer: ");
		int SecondInteger = input.nextInt();
		
		System.out.print("Enter the third integer: ");
		int ThirdInteger = input.nextInt();
		
		System.out.println(" ");
		
		System.out.println("User entered number are : "+FirstInteger + " "+ SecondInteger+ " "+ThirdInteger);
		
        int small = Math.min(FirstInteger, Math.min(SecondInteger,ThirdInteger));
		System.out.println("The Smallest number is: "+small);
		
		int large = Math.max(FirstInteger, Math.max(SecondInteger,ThirdInteger));
		System.out.println("The Largest number is: "+large);
		
		
	}
}
	