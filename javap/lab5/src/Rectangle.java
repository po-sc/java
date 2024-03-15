import java.awt.*;


class Rectangle extends Shape {
    private int width, length;

    public Rectangle(Color color, int x, int y, int width, int length) {
        super(color, x, y);
        this.width = width;
        this.length = length;
    }

    @Override
    public void paint(Graphics g) {
        g.setColor(getColor());
        g.fillRect(getX(),getY(),width,length);

    }
}
