package edu.gmu.hackthon.model.common;

public class CampLocation {
    private int id;
    private boolean isActive;
    private int capacity;
    private int location;

    public CampLocation(int id, boolean isActive, int capacity, int location) {
        this.id = id;
        this.isActive = isActive;
        this.capacity = capacity;
        this.location = location;
    }

    public CampLocation() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getLocation() {
        return location;
    }

    public void setLocation(int location) {
        this.location = location;
    }
}
