package pr3;

class MovableCircle implements Movable
{
    private int radius;
    private MovablePoint center;

    public MovableCircle (int x, int y, int xSpeed, int ySpeed)
    {
        center.x = x;
        center.y = y;
        center.xSpeed = xSpeed;
        center.ySpeed = ySpeed;

    }

    @Override
    public String toString() {return ("Movable Circle " + "(" +center.x + "," + center.y +")");}

    public void moveUp(){}
    public void moveDown(){}
    public void moveLeft(){}
    public void moveRight(){}

}

