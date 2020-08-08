// implementation of the classic FizzBuzz problem 
// by Tony (Ayelmar) Herrington

public class FizzBuzz {
	public static void main(String[] args)
	{
		int j;
		for (int i = 1; i <= 100; i++) // Run from 1 to 100
		{
			j = 0;
			if ((i % 3) == 0) j += 1; // divisible by 3? 
			if ((i % 5) == 0) j += 2; // divisible by 5?

			switch (j)
			{
			case 0:
				System.out.print(i);
				break;
			case 1:
				System.out.print("Fizz"); //output "Fizz" if it's mod 3
				break;
			case 2:
				System.out.print("Buzz"); // output "Buzz" if it's mod 5
				break;
			case 3:
				System.out.print("FizzBuzz"); // output "FizzBuzz" if it's both
			}
				System.out.println(); // otherwise, output the value.
		}
	}
}
