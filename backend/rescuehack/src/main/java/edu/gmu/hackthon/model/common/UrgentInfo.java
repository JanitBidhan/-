package edu.gmu.hackthon.model.common;

public class UrgentInfo {
    private int id;
    private String data;
    private int priority;

    public UrgentInfo() {
    }

    public UrgentInfo(int id, String data, int priority) {
        this.id = id;
        this.data = data;
        this.priority = priority;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }
}
