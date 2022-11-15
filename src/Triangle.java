import java.util.Scanner;

public class Triangle implements countSquare{
    @Override
    public double calc(){
        int a; int h; double S;
        Scanner scan = new Scanner(System.in);
        System.out.println("Введіть довжину сторони трикутника, см:");
        a = scan.nextInt();
        System.out.println("Введіть довжину висоти трикутника, см:");
        h = scan.nextInt();
        S = 0.5*a*h;
        System.out.println("Площа цього трикутника складає " + S + " кв.см");
        return S;
    }
}
