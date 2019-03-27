package models;

public class Floor {
    private double width;
    private double heigth;
    
    public Floor(double width, double heigth) {
        this.width = (width < 0)? 0 : width;
        this.heigth = (heigth < 0)? 0 : heigth;
    }
}
