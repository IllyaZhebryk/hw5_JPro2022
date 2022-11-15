import java.lang.reflect.Array;

public class Main {
    public static void main(String[] args) {
        double totalSq=0;
            countSquare[] figures = {
                    new Circle(),
                    new Square(),
                    new Triangle()
            };
        for (countSquare figure:figures){
            if (figure.getClass() == Circle.class) {
                Circle c = ((Circle) figure);
                totalSq = totalSq + c.calc();
            } else if (figure instanceof Square) {
                totalSq = totalSq + ((Square) figure).calc();
            } else {
                totalSq = totalSq + ((Triangle) figure).calc();
            }
        }
        System.out.println("Загальна площа фігур складає " + totalSq);
        }
           }
