public class Point {
    //Two private integer instance variables, x and y
    public int x;
    public int y;

    String printedMessage;

    //A “no-arg” constructor that creates a point with the coordinates (0, 0)
    public Point(){
        this.x = 0;
        this.y = 0;
    }

    //An overloaded constructor that takes two integer parameters xVal and yVal and set the instance variables accordingly.
    public Point(int xVal,int yVal){
        this.x = xVal;
        this.y = yVal;
    }

    //A getter method for each instance variable.
    public int getValueX (){
        return this.x;
    }

    public int getValueY(){
        return this.y;
    }

    //A method named setPoint that takes two integer parameters newX and newY and set the instance variables accordingly.
    public void setPoint(int newX, int newY){
        this.x = newX;
        this.y = newY;

    }

    //A method named toString which takes no parameters,
    // and returns a string with the coordinates of the point
    // within parentheses and comma separated,
    // for example: (2, 5)
    public String toString(){

        String result = String.format("(%d, %d)",this.x, this.y);
        return result;
    }

    public Double distance(Point disPoint){
        double formula = Math.sqrt(Math.pow( (this.x - disPoint.getValueX() ),2) + Math.pow( (this.y-disPoint.getValueY() ),2) );
        return formula;
    }


}
