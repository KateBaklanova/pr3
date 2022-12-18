package pr3;

class MovableRectangle implements Movable
    {
        private MovablePoint topLeft;
        private MovablePoint bottomRight;

        public MovableRectangle (int x1, int y1, int xSpeed1, int ySpeed1, int x2, int y2, int xSpeed2, int ySpeed2)
        {
            topLeft.x = x1;
            topLeft.y = y1;
            topLeft.xSpeed = xSpeed1;
            topLeft.ySpeed = ySpeed1;
            bottomRight.x = x2;
            bottomRight.y = y2;
            bottomRight.xSpeed = xSpeed2;
            bottomRight.ySpeed = ySpeed2;

        }

        public boolean Check () {
            if ( bottomRight.xSpeed == bottomRight.ySpeed ) {
                return true;
            }
            else {
                return false;
            }
        }

        @Override
        public String toString() {return ("Movable Point " + "(" +topLeft.x + "," + bottomRight.y +")");}

        public void moveUp(){}
        public void moveDown(){}
        public void moveLeft(){}
        public void moveRight(){}

    }

