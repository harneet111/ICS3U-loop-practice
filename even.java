import java.util.Scanner;
public class even{
    public static void main(String[] args){
        Scanner scanner= new Scanner(System.in);
        System.out.println("Pick an even number");
        int choice= scanner.nextInt();
        if(choice %2==0){
            int com= 2;
            while(choice>=com){
                System.out.println(com);
                com+=2;
            }
        } else {
            System.out.println("invalid");
        }

    }
}
