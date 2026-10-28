import java.util.Scanner;
public class saving{
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("what is your savings goal? Keep depositing money until you reach your goal");
        int savings = 0;
        int count = 0;
        int target = scanner.nextInt();

        while (savings < target) {
            int deposit = scanner.nextInt();
            savings = savings + deposit;
            count = count + 1;
        }

        System.out.println(savings);
        System.out.println(count);
    }
}