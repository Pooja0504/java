import java.util.*;
public class Factorial1 {
    public static void main(String[] args) {
        int result = 1;
        System.out.println("Enter number : ");
        Scanner sc = new Scanner(System.in);
        int input = 0;
        try {
           input = sc.nextInt();
        } catch (Exception e) {
            System.out.println("Only Integer Can Classify As Even Or Odd");
        }
        if (input >= 0) {
        
       while (input!=0)
        {
           
            result=result*input;
            
            input--;
        }
        System.out.println("\nFactorial is "+result);
            }else {
            System.out.println("Can not find factorial of negative numbers \n ");
        }
    }
}
