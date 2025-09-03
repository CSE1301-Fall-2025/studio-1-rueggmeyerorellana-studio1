import java.util.Scanner;
public class Hello {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("The first of two integers are to be averaged?");
        double n1 = in.nextDouble();
        double n2 = in.nextDouble();
        double average = (n1 + n2) / 2.0;
        System.out.println("The average of the two integers is " + average );
    }
		


	}