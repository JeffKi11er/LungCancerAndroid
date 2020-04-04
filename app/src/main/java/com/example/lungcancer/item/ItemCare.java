package com.example.lungcancer.item;

public class ItemCare {
    private String ID;
    private String name;
    private String gender;
    private String dataType;
    private String pudDate;
    private String located;
    private String distinguish;

    public ItemCare(String ID, String name, String gender, String dataType, String pudDate, String located, String distinguish) {
        this.ID = ID;
        this.name = name;
        this.gender = gender;
        this.dataType = dataType;
        this.pudDate = pudDate;
        this.located = located;
        this.distinguish = distinguish;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
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

    public String getDataType() {
        return dataType;
    }

    public void setDataType(String dataType) {
        this.dataType = dataType;
    }

    public String getPudDate() {
        return pudDate;
    }

    public void setPudDate(String pudDate) {
        this.pudDate = pudDate;
    }

    public String getLocated() {
        return located;
    }

    public void setLocated(String located) {
        this.located = located;
    }

    public String getDistinguish() {
        return distinguish;
    }

    public void setDistinguish(String distinguish) {
        this.distinguish = distinguish;
    }
}
