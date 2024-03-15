import java.awt.*;


public class Circle extends Shape {
    private int radius; //переменная отвечающую за радиус круга
    Circle(Color color,int x,int y,int radius){
        super(color,x,y);
        this.radius = radius;

    }

    @Override  // переопределяем метод print в классе circle
    public void paint(Graphics g) {
        g.setColor(getColor()); // устанавливаем цвет фигуры
        g.fillOval(getX(),getY(),2*radius,2*radius); // рисуем круг

    }
}
