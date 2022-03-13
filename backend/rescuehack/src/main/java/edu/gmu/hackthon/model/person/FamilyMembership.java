package edu.gmu.hackthon.model.person;

import java.util.List;

public class FamilyMembership {
    List<Person> family;

    public FamilyMembership(List<Person> family) {
        this.family = family;
    }

    public FamilyMembership() {
    }

    public List<Person> getFamily() {
        return family;
    }

    public void setFamily(List<Person> family) {
        this.family = family;
    }
}
