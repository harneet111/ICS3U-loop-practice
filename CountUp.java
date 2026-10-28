import java.util.Scanner;
public class CountUp{
    public static void main(String[] args){
        Scanner scanner= new Scanner(System.in);
        System.out.println("Pick a number");
        int number = scanner.nextInt();
        int min=1;
        while(number>=min){
            System.out.println(min);
            min++;
        }
    }
}