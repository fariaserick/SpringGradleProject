package models;

public class Point {
    private int x;
    private int y;
    
    public Point() {
        this.x = 0;
        this.y = 0;
    }
    
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
    
    public double distance() {
    	// distance(A,B) = Math.sqrt(xB - xA)*(xB - xA)+(yB - yA)*(yB - yA);
    	double value = (this.x - 0)*(this.x - 0)+(this.y - 0)*(this.y - 0);
    	double result = Math.sqrt((double)value);
        return result;
    }
    
    public double distance(int x, int y) {
    	double value = (this.x - x)*(this.x - x)+(this.y - y)*(this.y - y);
        double result = Math.sqrt((double)value);
        return result;
    }
    
    public double distance(Point another) {
    	double value = (this.x - another.x)*(this.x - another.x)+(this.y - another.y)*(this.y - another.y);
    	double result = Math.sqrt((double)value);
        return result;
    }
    
    public int getX() {
        return this.x;
    }
    public void setX(int x) {
        this.x = x;
    }
    
    public int getY() {
        return this.y;
    }
    public void setY(int y) {
        this.y = y;
    }
    
}
