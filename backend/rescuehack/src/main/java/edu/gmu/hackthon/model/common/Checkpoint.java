package edu.gmu.hackthon.model.common;

public class Checkpoint {
    private int id;
    private int location;
    private boolean isActive;
    private int capacity;

    public Checkpoint() {
    }

    public Checkpoint(int id, int location, boolean isActive, int capacity) {
        this.id = id;
        this.location = location;
        this.isActive = isActive;
        this.capacity = capacity;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getLocation() {
        return location;
    }

    public void setLocation(int location) {
        this.location = location;
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
}
