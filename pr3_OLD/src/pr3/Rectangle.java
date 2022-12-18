package pr3;

public class Rectangle extends Shape
{
        protected double width;
        protected double length;

        public Rectangle  () {
            this.filled = false;
            this.color = "pink";
            width = 2;
            this.length = 2;
        }

        public Rectangle (double width, double length)
        {
            this.width = width;
            this.length = length;
        }

        public Rectangle (double width, double length, String color, boolean filled)
        {
            this.width = width;
            this.length = length;
            this.setColor(color);
            this.setFilled(filled);
        }

        public double getWidth ()
        {
            return width;
        }

        public void setWidth  (double width)
        {
            this.width = width;
        }

        public void setLength (double length)
        {
            this.length = length;
        }

        public double getLength ()
        {
            return length;
        }

        @Override
        public double getArea ()
        {
            return width*length;
        }

        @Override
        public double getPerimeter ()
        {
            return 2*width+2*length;
        }
        @Override
        public String toString ()
        {
            return ("прямоугольник с площадью " + getArea() + " и периметром " + getPerimeter()) ;
        }

}
