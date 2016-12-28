package com.allsunny.myzhihudaily.utils;

public class Constants {
    public static final String BASE_URL = "http://news-at.zhihu.com/api/4/";
    public static final String NEWS = "http://news-at.zhihu.com/api/4/news";
    public static final String LAST_NEWS = "news/latest";
    public static final String STORY_FORMAT = "<!doctype html><html><head><meta charset=\"utf-8\"><meta name=\"viewport\" content=\"width=device-width,user-scalable=no\"><link href=\"news_qa.min.css\" rel=\"stylesheet\"></head><body className=\"%s\">";
    public static final String STORY_LARGE_FONT = STORY_FORMAT + "<script src=\"large-font.js\"></script>";
    public static final String STORY_FORMAT_NIGHT = STORY_FORMAT + "<script src=\"night.js\"></script>";
}
