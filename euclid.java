import java.util.Scanner;

public class euclid {

    static Integer euclid_algorithm(Integer m, Integer n) {
        if (m % n == 0) {
            return n;
        } else {
            return euclid_algorithm(n, m % n);
        }
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Integer m, n;
 
        System.out.print("Enter number m: ");
        m = input.nextInt();

        System.out.print("Enter number n: ");
        n = input.nextInt();
        
        System.out.println("--------------");
        
        System.out.printf("Greater Common Divisor of %s and %s is %s%n", m, n, euclid_algorithm(m, n));
        input.close();
    }
}