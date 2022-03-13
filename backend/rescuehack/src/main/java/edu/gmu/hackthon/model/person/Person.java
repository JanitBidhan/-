package edu.gmu.hackthon.model.person;

public class Person {

    private String id;
    private String firstName;
    private String lastName;
    private Location location;
    private StateId stateId;
    private Address address;
    private FamilyMembership family;
    private InfoProvided infoProvided;
    private String photoUrl;

    public Person(String id, String firstName, String lastName, Location location, StateId stateId, Address address, FamilyMembership family, InfoProvided infoProvided, String photoUrl) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.location = location;
        this.stateId = stateId;
        this.address = address;
        this.family = family;
        this.infoProvided = infoProvided;
        this.photoUrl = photoUrl;
    }

    public Person(String id, String firstName, String lastName) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Person() {

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

    public StateId getStateId() {
        return stateId;
    }

    public void setStateId(StateId stateId) {
        this.stateId = stateId;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
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
