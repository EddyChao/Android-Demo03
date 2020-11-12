package com.example.demo03.bean;

public class News {

    public static final int TEXT = 1;
    public static final int IMAGE = 2;

    private int newsId;
    private int type;
    private String title;
    private String body;
    private int imageSource;

    public News(int newsId, int type, String title, String body, int imageSource) {
        this.newsId = newsId;
        this.type = type;
        this.title = title;
        this.body = body;
        this.imageSource = imageSource;
    }

    public static int getTEXT() {
        return TEXT;
    }

    public static int getIMAGE() {
        return IMAGE;
    }

    public int getNewsId() {
        return newsId;
    }

    public void setNewsId(int newsId) {
        this.newsId = newsId;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public int getImageSource() {
        return imageSource;
    }

    public void setImageSource(int imageSource) {
        this.imageSource = imageSource;
    }
}
//省略get，set方法
