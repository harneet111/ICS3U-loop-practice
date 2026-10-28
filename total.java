import java.util.Scanner;
public class total{
    public static void main(String[] args){
        Scanner scanner= new Scanner(System.in);
        System.out.println("pick a number, those values will be added until a 0 is placed");
        int num = scanner.nextInt();
        int total = 0;

        while (num != 0) {
            total = total + num;
            num = scanner.nextInt();
        }
        System.out.println(total);
    }
}
