package com.example.demo03.bean;

public class Item {

    public static final int TITLE = 0;
    public static final int IMAGE = 1;
    public static final int BODY = 2;
    public static final int BOTTOM = 3;

    private int newsType;//News类型
    private int newsId;
    private int styleType;//显示类型
    private String text;
    private int imageSource;
//省略get,set方法

    public static int getTITLE() {
        return TITLE;
    }

    public static int getIMAGE() {
        return IMAGE;
    }

    public static int getBODY() {
        return BODY;
    }

    public static int getBOTTOM() {
        return BOTTOM;
    }

    public int getNewsType() {
        return newsType;
    }

    public void setNewsType(int newsType) {
        this.newsType = newsType;
    }

    public int getNewsId() {
        return newsId;
    }

    public void setNewsId(int newsId) {
        this.newsId = newsId;
    }

    public int getStyleType() {
        return styleType;
    }

    public void setStyleType(int styleType) {
        this.styleType = styleType;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public int getImageSource() {
        return imageSource;
    }

    public void setImageSource(int imageSource) {
        this.imageSource = imageSource;
    }
}
