package edu.gmu.hackthon.model.person;

import edu.gmu.hackthon.model.common.Location;

public class Person {

    private String id;
    private String firstName;
    private String lastName;
    private Location location;
    private int stateId;
    private String address;
    private String familyIds;
    private FamilyMembership family;
    private int InfoId;
    private int locationId;
    private InfoProvided infoProvided;
    private String photoUrl;
    private int need;

    public Person(String id, int stateId, String firstName, String lastName, String address, int location, int infoProvided, String family, int needs, String photoUrl) {
        this.id = id;
        this.stateId = stateId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.locationId = location;
        this.InfoId = infoProvided;
        this.familyIds = family;
        this.need = needs;
        this.photoUrl = photoUrl;
    }

    public Person() {

    }

    public int getLocationId() {
        return locationId;
    }

    public void setLocationId(int locationId) {
        this.locationId = locationId;
    }

    public String getFamilyIds() {
        return familyIds;
    }

    public void setFamilyIds(String familyIds) {
        this.familyIds = familyIds;
    }

    public int getInfoId() {
        return InfoId;
    }

    public void setInfoId(int infoId) {
        InfoId = infoId;
    }

    public int getNeed() {
        return need;
    }

    public void setNeed(int need) {
        this.need = need;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public int getStateId() {
        return stateId;
    }

    public void setStateId(int stateId) {
        this.stateId = stateId;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public FamilyMembership getFamily() {
        return family;
    }

    public void setFamily(FamilyMembership family) {
        this.family = family;
    }

    public InfoProvided getInfoProvided() {
        return infoProvided;
    }

    public void setInfoProvided(InfoProvided infoProvided) {
        this.infoProvided = infoProvided;
    }

    public String getPhotoUrl() {
        return photoUrl;
    }

    public void setPhotoUrl(String photoUrl) {
        this.photoUrl = photoUrl;
    }
}
