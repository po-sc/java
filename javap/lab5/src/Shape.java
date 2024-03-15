import java.awt.*;
public abstract class Shape {
    private Color color; //переменная отвечающую за цвет фигур
    private int x,y; //переменная отвечающую за позицию фигур

    public Shape(Color color,int x,int y){
        this.color = color;
        this.x = x;
        this.y = y;
    }

    public Color getColor(){ //метод возвращает цвет фигуры
        return color;
    }

    public int getX(){ // возвращает позицию фигуры по оси X
        return x;
    }
    public int getY(){ // возвращает позицию фигуры по оси Y
        return y;
    }

    public abstract void paint(Graphics g); //Метод для отрисовки фигуры



}
