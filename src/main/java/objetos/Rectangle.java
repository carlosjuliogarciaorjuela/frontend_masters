package objetos;

public class Rectangle {

    private double length;
    private double width;
    private int side = 4;

    public double calculatePerimeter(){
        return (2 * length) + ( 2 * width);
    }

    public double calculateArea(){
        return length * width;
    }

    public int getSide() {
        return side;
    }

    public void setSide(int side) {
        this.side = side;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }
}
