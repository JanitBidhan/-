package edu.gmu.hackthon.model.person;

public class Officer {
    private int location;
    private String foodStock;
    private int checkPoint;
    private int campLocation;

    public Officer() {
    }

    public Officer(int location, String foodStock, int checkPoint, int campLocation) {
        this.location = location;
        this.foodStock = foodStock;
        this.checkPoint = checkPoint;
        this.campLocation = campLocation;
    }

    public int getLocation() {
        return location;
    }

    public void setLocation(int location) {
        this.location = location;
    }

    public String getFoodStock() {
        return foodStock;
    }

    public void setFoodStock(String foodStock) {
        this.foodStock = foodStock;
    }

    public int getCheckPoint() {
        return checkPoint;
    }

    public void setCheckPoint(int checkPoint) {
        this.checkPoint = checkPoint;
    }

    public int getCampLocation() {
        return campLocation;
    }

    public void setCampLocation(int campLocation) {
        this.campLocation = campLocation;
    }
}
