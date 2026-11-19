import java.util.Scanner;

public class Varun {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input number
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        boolean isPrime = true;

        // Prime check logic
        if (num <= 1) {
            isPrime = false;
        } else {
            for (int i = 2; i <= num / 2; i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }

        // Output result
        if (isPrime) {
            System.out.println(num + " is a Prime Number.");
        } else {
            System.out.println(num + " is NOT a Prime Number.");
        }

        sc.close();
    }
}




import java.util.*;

public class Main {
    public static void main(String[] args) {
      int a=23;
      int b=45;
      if(a>b && a<b){
        System.out.println("yes");
      }else {
        System.out.println("no");
      }
    }
}


