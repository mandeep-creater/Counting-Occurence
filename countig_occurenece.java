import java.util.Scanner;

public class countig_occurenece {

    public static void main(String[] args) {

        System.out.println("Enter the number: ");

        try (Scanner sc = new Scanner(System.in)) {
            int number = sc.nextInt();

            System.out.println("Enter the no. you want to check occurence : ");

            int occur_digit = sc.nextInt();

            int count = 0;
            int rem;

            while (number > 0) {
                 rem = number % 10;
                if (rem == occur_digit) {
                    count++;
                } 
                    number = number / 10;
                
            }

            System.out.println(count);
        }

    }

}