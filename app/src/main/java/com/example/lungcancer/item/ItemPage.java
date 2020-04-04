package com.example.lungcancer.item;

public class ItemPage {
    private String headTitle;
    private String detail;
    private int Imageset;
    private String link;

    public ItemPage(String headTitle, String detail, int imageset, String link) {
        this.headTitle = headTitle;
        this.detail = detail;
        Imageset = imageset;
        this.link = link;
    }

    public String getHeadTitle() {
        return headTitle;
    }

    public void setHeadTitle(String headTitle) {
        this.headTitle = headTitle;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public int getImageset() {
        return Imageset;
    }

    public void setImageset(int imageset) {
        Imageset = imageset;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }
}
