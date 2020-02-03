import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj 5 liczb całkowitych: ");
        int[] number = new int [5];
        for (int index = 0; index < number.length; index++){
            number [index] = scanner.nextInt();
        }
        int sum = 0;
        for (int index = 0; index < number.length;){
            sum = sum + number[index];
            index+=2;

        }
        System.out.println("\nSuma 1, 3 i 5 liczby wynosi: ");
        System.out.println(sum);



    }
}
