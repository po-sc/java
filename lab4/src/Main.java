public class Main {
    public static void main(String[] args) {
        Planet planet = new Planet("Earth");
        Car car = new Car("Toyota");
        Human human = new Human("Ben");

        String planet_name = planet.getName();
        String car_name = car.getName();
        String human_name = human.getName();

        System.out.println("\n"+"Planet: " + planet_name);
        System.out.println("Car: " + car_name);
        System.out.println("Human: " + human_name);

    }
}
