package pr3;

public class MovablePoint implements Movable
{
    int x;
    int y;
    int xSpeed;
    int ySpeed;

    public MovablePoint (int x, int y, int xSpeed, int ySpeed)
    {
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;

    }

    @Override
    public String toString() {return ("Movable Point " + "(" +x + "," + y +")");}

    public void moveUp(){
        x++;
        System.out.println(x);
    }
    public void moveDown(){}
    public void moveLeft(){}
    public void moveRight(){}

}
