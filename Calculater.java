    import java.util.Scanner;
    public class Calculater {
        public static void main(String[] args){
            int a = 0, b = 0, sum, ch;

            try(Scanner sc = new Scanner(System.in)){

            do { 
            System.out.print("1) addition\n2) substraction\n3) division\n4) multiply\n5) mobuler\n6) Exit\n");
            System.out.print("Enter your choice: ");
            ch = sc.nextInt();
            
            if(ch == 6){
                System.out.println("Exiting........");
                break;
            }

            if(ch>=1 && ch<=5){
            System.out.print("Enter number for A: ");
            a = sc.nextInt();

            System.out.print("Enter number for B: ");
            b = sc.nextInt();
            }

            switch (ch) {
                case 1 -> {
                    sum = a + b;
                    System.out.println("Addition of A and B is: " + sum);
                }

                case 2 -> {
                    sum = a - b;
                    System.out.println("substraction of A and B is: "+ sum);
                }

                case 3 -> {
                    if(b != 0) {
                        sum = a / b;
                        System.out.println("divistion of A and B is: " + sum);
                    }else {
                        System.out.println("Error: Division by zero is not allowed.");
                    }
                }

                case 4 -> {
                    sum = a * b;
                    System.out.println("multiplaction of A and B is: "+ sum);
                }

                case 5 -> {
                   if (b != 0) {
                    sum = a % b;
                    System.out.println("Modulus of A and B is: " + sum);
                    } else {
                    System.out.println("Cannot find modulus with zero.");
                    }
                }

                case 6 -> System.out.println("exiting............");
            
                default -> System.out.println("invalid number..........");
            }
            } while (ch != 6);
            }
        }
    }
