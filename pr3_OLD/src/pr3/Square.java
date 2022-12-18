package pr3;

public class Square extends Rectangle
{
    protected double side;

    public Square () {
        this.filled = false;
        this.color = "purple";
        side = 1;
    }

    public Square (double side)
    {
        this.filled = false;
        this.color = "purple";
        this.side = side;
    }

    public Square (double side, String color, boolean filled)
    {
        this.side = side;
        this.setColor(color);
        this.setFilled(filled);
    }

    public double getSide ()
    {
        return side;
    }

    public void setSize (double side)
    {
        this.side = side;
    }

    @Override
    public double getArea ()
    {
        return side*side;
    }

    @Override
    public double getPerimeter ()
    {
        return 4*side;
    }

    @Override
    public String toString ()
    {
        return ("квадрат с площадью " + getArea() + " и периметром " + getPerimeter());
    }

}
