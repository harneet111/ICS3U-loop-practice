import java.util.Scanner;
public class positive{
    public static void main(String[] args){
Scanner scanner= new Scanner(System.in);
System.out.println("Pick a number greater than 0, and use -1 to stop. The code will count the entries.");
        int num = scanner.nextInt();
        int count = 0;

        while (num != -1) {
            if (num > 0) {
                count = count + 1;
            }

            num = scanner.nextInt();
        }

        System.out.println(count);
    }
}