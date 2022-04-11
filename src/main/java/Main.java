/*      if ( k < 0 || a > b || s < 0 ) {System.out.println("error"); return null;}
        List primes = new ArrayList();
        int copy;
        int digit;
        int sum;
        boolean found;
        int number, divisor;
        for(number = a; primes.size() <= k && number <= b; number++)
        {
            if(number == 1) continue;
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
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static java.lang.Math.sqrt;

public class Main {
    public static void main(String[] args) {
        System.out.println(findPrimes(5,1,1000,5));
    }

    // Gaseste primele K numere prime, ce au suma cifrelor S, din intervalul [a,b]
    public static List findPrimes(int k, int a, int b, int s) {
        if ( k < 0 || a > b || s < 0 ) {System.out.println("error"); return null;}

        List primes = new ArrayList();
        int copy;
        int digit;
        int sum;
        boolean found;
        int number, divisor;

        for(number = a; primes.size() <= k && number <= b; number++)
        {
            if(number == 1) continue;
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
