package edu.gmu.hackthon.model.person;

public class InfoProvided {
    private int id;
    private boolean istank;
    private boolean isBombs;
    private boolean isGunfire;
    private boolean isEvacuate;
    private boolean isfood;
    private String imagelink;

    public InfoProvided(int id, boolean istank, boolean isBombs, boolean isGunfire, boolean isEvacuate, boolean isfood, String imagelink) {
        this.id = id;
        this.istank = istank;
        this.isBombs = isBombs;
        this.isGunfire = isGunfire;
        this.isEvacuate = isEvacuate;
        this.isfood = isfood;
        this.imagelink = imagelink;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean isIstank() {
        return istank;
    }

    public void setIstank(boolean istank) {
        this.istank = istank;
    }

    public boolean isBombs() {
        return isBombs;
    }

    public void setBombs(boolean bombs) {
        isBombs = bombs;
    }

    public boolean isGunfire() {
        return isGunfire;
    }

    public void setGunfire(boolean gunfire) {
        isGunfire = gunfire;
    }

    public boolean isEvacuate() {
        return isEvacuate;
    }

    public void setEvacuate(boolean evacuate) {
        isEvacuate = evacuate;
    }

    public boolean isIsfood() {
        return isfood;
    }

    public void setIsfood(boolean isfood) {
        this.isfood = isfood;
    }

    public String getImagelink() {
        return imagelink;
    }

    public void setImagelink(String imagelink) {
        this.imagelink = imagelink;
    }
}
