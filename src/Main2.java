public class Main2 {
    public static void main(String[] args) {
        Participant[] units = {
                new Person(),
                new Cat(),
                new Robot()
        };

        Obstacles[] obstacles = {
                new RunTruck(),
                new Wall()
        };

        for (Obstacles obstacle : obstacles) {
            for (Participant unit : units) {
                obstacle.overcome(unit);
            }
        }
    }
}
