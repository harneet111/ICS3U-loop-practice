import java.util.Scanner;
public class countdown{
    public static void main(String[] args){
        Scanner scanner= new Scanner(System.in);
        System.out.println("Pick a number, positive");
        int num= scanner.nextInt();
        int com= 0;
        while(num>com){
            System.out.println(num);
            num--;
        }
        System.out.println("Go!");
    }
}