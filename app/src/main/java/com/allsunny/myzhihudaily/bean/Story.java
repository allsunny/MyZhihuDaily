package com.allsunny.myzhihudaily.bean;

import java.util.List;

/**
 * Created by allsunny on 2016/12/21.
 */

public class Story {
    /**
     * images : ["http://pic1.zhimg.com/9573dcb5d5b63f714b158975953e2570.jpg"]
     * type : 0
     * id : 9076894
     * ga_prefix : 122110
     * title : 这些医学知识正在「迅猛」更新，却还不为大众所知
     */

    private int type;
    private int id;
    private String ga_prefix;
    private String title;
    private List<String> images;

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getGa_prefix() {
        return ga_prefix;
    }

    public void setGa_prefix(String ga_prefix) {
        this.ga_prefix = ga_prefix;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<String> getImages() {
        return images;
    }

    public void setImages(List<String> images) {
        this.images = images;
    }
}

