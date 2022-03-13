package edu.gmu.hackthon.model.common;

public class Address {
    private String hNo;
    private String StreetName;
    private String CityName;
    private String ZipCode;

    public Address(String hNo, String streetName, String cityName, String zipCode) {
        this.hNo = hNo;
        StreetName = streetName;
        CityName = cityName;
        ZipCode = zipCode;
    }

    public Address() {
    }

    public Address(String hNo) {
        this.hNo = hNo;
    }

    public String gethNo() {
        return hNo;
    }

    public void sethNo(String hNo) {
        this.hNo = hNo;
    }

    public String getStreetName() {
        return StreetName;
    }

    public void setStreetName(String streetName) {
        StreetName = streetName;
    }

    public String getCityName() {
        return CityName;
    }

    public void setCityName(String cityName) {
        CityName = cityName;
    }

    public String getZipCode() {
        return ZipCode;
    }

    public void setZipCode(String zipCode) {
        ZipCode = zipCode;
    }
}
