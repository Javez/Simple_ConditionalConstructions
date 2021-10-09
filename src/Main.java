import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int yourFirstNumber = 0;
        int yourSecondNumber = 0;

        Scanner in = new Scanner(System.in);

        yourFirstNumber = in.nextInt();
        yourSecondNumber = in.nextInt();

        System.out.println("Your first number = " + yourFirstNumber);
        System.out.println("Your second number = " + yourSecondNumber);

        if(yourFirstNumber > yourSecondNumber) {
            System.out.println(yourFirstNumber + " > " + yourSecondNumber);
        }else if (yourFirstNumber < yourSecondNumber) {
            System.out.println(yourFirstNumber + " < " + yourSecondNumber);
        }else if (yourFirstNumber == yourSecondNumber) {
            System.out.println(yourFirstNumber + " is equal " + yourSecondNumber);
        }
        in.close();
    }
}
