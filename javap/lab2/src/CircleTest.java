// Класс для тестирования класса Circle
public class CircleTest {
    public static void main(String[] args) {
        // Создание экземпляра класса Circle
        Circle myCircle = new Circle(5.0);

        // Вывод информации о начальных свойствах окружности
        System.out.println("Начальный радиус: " + myCircle.getRadius());
        System.out.println("Площадь окружности: " + myCircle.calculateArea());
        System.out.println("Длина окружности: " + myCircle.calculateCircumference());

        // Изменение радиуса окружности
        myCircle.setRadius(7.5);

        // Вывод информации после изменения свойства
        System.out.println("\nНовый радиус: " + myCircle.getRadius());
        System.out.println("Площадь окружности: " + myCircle.calculateArea());
        System.out.println("Длина окружности: " + myCircle.calculateCircumference());
    }
}
