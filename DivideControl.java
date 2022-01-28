import java.util.Scanner;

public class DivideControl {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");

        int number = input.nextInt();

        int sum = 0;

        int a=0;

        for(int i=1;i<number;i++){
            if((i%3==0) && (i%4==0)){
                a++;
                sum = sum+i;
            }
        }

        System.out.println(sum/a);
    }
}
