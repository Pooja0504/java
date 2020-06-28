import java.util.Scanner;

public class PrimeNumber {

    public static void main(String[] args) {
        int i, number, count;
        int sum=0;


        for(number = 2; number <= 13; number++)
        {

            count = 0;
            for (i = 2; i <= number/2; i++)
            {
                if(number % i == 0)
                {
                    count++;
                    break;
                }
            }
            if(count == 0 && number != 1 )
            {
                sum=sum+number;
            }
        }
        System.out.println("\n\nSUM OF PRIME NUMBER BETWEEN 50:: "+sum+"\n");
        }
    }

