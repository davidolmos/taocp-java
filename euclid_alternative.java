import java.util.Scanner;

public class euclid_alternative {

    static Integer euclid_algorithm_alternative(Integer m, Integer n, Integer r, Integer s) {
 
        // The algorithm uses four parameters:
        // m and n store the inputs.
        // r stores the remainder after being computed in step 1./ Otherwise, it stores 0 in the initial call or the remainder of previous iteration after step 3.
        // s stores the step of the algorithm and has three legal values, 1, 2 or 3.
        //
        if (s == 1) {
            return euclid_algorithm_alternative(m, n, m % n, 2);
        }

        if (s == 2) {
            if (r == 0) {
                return n;
            } else {
                return euclid_algorithm_alternative(m, n, r, 3);
            }
        }
        
        if (s == 3) {
            return euclid_algorithm_alternative(n, r, r, 1);
        }

        // Only executed if initial call passes a step value in parameter s that is different from 1, 2 or 3.
        // -1000 is an error code that the step value passed is not valid (it should be one as initial call).
        //
        return -1000;
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Integer m, n;
 
        System.out.println("--------------");
        System.out.println("Alternative Euclid Algorithm - 1.1.3e p8");
        System.out.println("--------------");

        System.out.print("Enter number m: ");
        m = input.nextInt();

        System.out.print("Enter number n: ");
        n = input.nextInt();
        
        System.out.println("--------------");
        
        System.out.println("Alternative Euclid algorithm result");
        System.out.println("--------------");
        
        // The initial call to the algorithm function includes:
        // The inut parameters, m and n.
        // The remainder set to 0, which will be recalculated in step 1, hence the value is irrelevant.
        // The step to execute next, set to 1.
        //
        System.out.printf("Great Common Divisior of m = %s and n = %s is %s%n", m, n, euclid_algorithm_alternative(m, n, 0, 1));
        System.out.println("--------------");
        input.close();
    }
}