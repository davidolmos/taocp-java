import java.util.Scanner;

public class euclid_average {

    static Integer euclid_times(Integer m, Integer n, Integer times) {
        if (m % n == 0) {
            System.out.printf("gmd: %s%n", n);
            return times + 1;
        } else {
            return euclid_times(n, m % n, times + 1);
        }
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Integer m, n, times, total;
        System.out.print("Enter number n: ");
        n = input.nextInt();
        
        m = 1;
        total = 0;
        System.out.println("--------------");

        while (m <= n) {
            System.out.printf("m : %s n : %s%n", m, n);
            times = euclid_times(m, n, 0);
            System.out.printf("times: %s%n", times);
            System.out.println("--------------");
            total = total + times;
            m = m + 1;
        }
        
        System.out.printf("Average is %s%n", total / n);
        input.close();
    }
}