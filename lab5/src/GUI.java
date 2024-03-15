import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class GUI {
    public static void main(String[] args) {

        JFrame frame = new JFrame("Window"); // Создаем окно с заголовком
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Устанавливаем действие по закрытии окна
        JPanel panel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {

                super.paintComponent(g);
                Random rand = new Random();

                for (int i = 0; i < 20; i++) {
                    Color color = new Color(rand.nextInt(256), rand.nextInt(256), rand.nextInt(256)); // рандомный цвет
                    int x = rand.nextInt(1200); //рандомная позиция по X
                    int y = rand.nextInt(600); //рандомная позиция по Y

                    if (rand.nextBoolean()) {// рандомно выбираем, создавать прямоугольник или круг
                        int width = rand.nextInt(70) + 20;// рандомная ширина
                        int length = rand.nextInt(70) + 20; // рандомная высота
                       Rectangle rectangle = new Rectangle(color, x, y, width, length);
                        rectangle.paint(g); // Отрисовываем прямоугольник
                    } else {
                        int radius = rand.nextInt(70) + 20; // рандомная радиус
                        Circle circle = new Circle(color, x, y, radius);
                        circle.paint(g); // Отрисовываем круг
                    }
                }
            }
        };
        frame.add(panel); // Добавляем панель с отрисовкой во фрейм
        frame.setSize(1500, 800); // Устанавливаем размер окна
        frame.setVisible(true); // Делаем окно видимым


    }
}