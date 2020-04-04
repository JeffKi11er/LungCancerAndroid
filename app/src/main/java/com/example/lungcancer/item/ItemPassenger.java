package com.example.lungcancer.item;

public class ItemPassenger {
    private String id;
    private String name;
    private String gender;
    private String type;
    private String date;

    public ItemPassenger(String id, String name, String gender, String type, String date) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.type = type;
        this.date = date;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
