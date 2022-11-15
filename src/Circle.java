import java.util.Scanner;

public class Circle implements countSquare {
    @Override
     public double calc(){
        int r; double S;
        Scanner scan = new Scanner(System.in);
        System.out.println("Введіть радіус кола, см:");
        r = scan.nextInt();
        S = Math.PI*Math.pow(r,2);
        System.out.println("Площа цього кола складає " + S + " кв.см.");
        return S;
    };
}
