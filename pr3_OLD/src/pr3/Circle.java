package pr3;

public class Circle extends Shape
{
    protected double radius;

    public Circle () {
        this.filled = false;
        this.color = "blue";
        radius = 1;
    }

    public Circle (double radius)
    {
        this.filled = false;
        this.color = "blue";
        this.radius = radius;
    }

    public Circle (double radius, String color, boolean filled)
    {
        this.radius = radius;
        this.setColor(color);
        this.setFilled(filled);
    }

    public double getRadius ()
    {
        return radius;
    }

    public void setRadius (double radius)
    {
        this.radius = radius;
    }

    @Override
    public double getArea ()
    {
       return 2*(3.14)*(radius*radius);
    }

    @Override
    public double getPerimeter ()
    {
        return 2*(3.14)*(radius);
    }

    @Override
    public String toString ()
    {
        return ("круг с площадью " + getArea() + " и периметром " + getPerimeter());
    }

}
