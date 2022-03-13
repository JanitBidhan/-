package edu.gmu.hackthon.model.common;

public class Location {
    private int id;
    private double latitude;
    private double longitude;
    private String googleMapsLink;
    private boolean safe;

    public Location(int id, double latitude, double longitude, String googleMapsLink, boolean safe) {
        this.id = id;
        this.latitude = latitude;
        this.longitude = longitude;
        this.googleMapsLink = googleMapsLink;
        this.safe = safe;
    }

    public Location() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public String getGoogleMapsLink() {
        return googleMapsLink;
    }

    public void setGoogleMapsLink(String googleMapsLink) {
        this.googleMapsLink = googleMapsLink;
    }

    public boolean isSafe() {
        return safe;
    }

    public void setSafe(boolean safe) {
        this.safe = safe;
    }
}
