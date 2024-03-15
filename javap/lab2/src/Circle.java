// Класс, описывающий модель окружности
public class Circle {
    // Свойства окружности
    private double radius;

    // Конструктор класса
    public Circle(double radius) {
        this.radius = radius;
    }

    // Метод для получения радиуса окружности
    public double getRadius() {
        return radius;
    }

    // Метод для изменения радиуса окружности
    public void setRadius(double radius) {
        this.radius = radius;
    }

    // Метод для вычисления площади окружности
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    // Метод для вычисления длины окружности
    public double calculateCircumference() {
        return 2 * Math.PI * radius;
    }
}
