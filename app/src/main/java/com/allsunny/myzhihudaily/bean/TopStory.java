package com.allsunny.myzhihudaily.bean;

/**
 * Created by allsunny on 2016/12/21.
 */

public class TopStory {
    /**
     * image : http://pic1.zhimg.com/76aefe123bba397137549a10d9f03d00.jpg
     * type : 0
     * id : 9082982
     * ga_prefix : 122107
     * title : 2016 年度盘点 · 警惕这些财务造假的公司
     */

    private String image;
    private int type;
    private int id;
    private String ga_prefix;
    private String title;

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

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
}
