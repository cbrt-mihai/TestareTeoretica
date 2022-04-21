package cod;

import java.util.ArrayList;
import java.util.List;

import static java.lang.Math.sqrt;

public class Main {

	public static List<Integer> findPrimes(int k, int a, int b, int s) throws IllegalArgumentException {
		if ( k < 0 ) throw new IllegalArgumentException("K is negative.");
		if ( s < 0 ) throw new IllegalArgumentException("S is negative.");
		if ( a < 0 || b < 0) throw new IllegalArgumentException("Range is negative.");
		if ( a > b ) throw new IllegalArgumentException("Range is reversed.");

		List<Integer> primes = new ArrayList<>();
		int copy;
		int digit;
		int sum;
		boolean found;
		int number, divisor;

		for(number = a; primes.size() < k && number <= b; number++)
		{
			if(number == 0 || number == 1) continue;
			found = false;
			for(divisor = 2; !found && divisor <= sqrt(number); divisor++)
			{
				if(number % divisor == 0) found = true;
			}

			if(!found)
			{
				copy = number;
				sum = 0;
				while(copy != 0)
				{
					digit = copy % 10;
					copy = copy / 10;
					sum += digit;
				}
				if(sum == s) primes.add(number);
			}
		}
		return primes;
	}

}
