import java.util.Scanner;

public class Square implements countSquare{
    @Override
     public double calc(){
        int a; double S;
        Scanner scan = new Scanner(System.in);
        System.out.println("Введіть довжину сторони квадрата, см:");
        a = scan.nextInt();
        S = Math.pow(a,2);
        System.out.println("Площа цього квадрата складає " + S + " кв.см.");
        return S;
    }
}
