package com.allsunny.myzhihudaily.bean;

import java.util.List;

/**
 * Created by allsunny on 2016/12/8.
 */

public class StoriesList {

    /**
     * date : 20161221
     * stories : [{"images":["http://pic1.zhimg.com/9573dcb5d5b63f714b158975953e2570.jpg"],"type":0,"id":9076894,"ga_prefix":"122110","title":"这些医学知识正在「迅猛」更新，却还不为大众所知"},{"images":["http://pic4.zhimg.com/d5714eb675116b85c7c439dec3118d6f.jpg"],"type":0,"id":9082939,"ga_prefix":"122109","title":"一种听起来很神秘的银行：私人银行"},{"images":["http://pic3.zhimg.com/78848553d9651b870e32204a70e17aba.jpg"],"type":0,"id":9083062,"ga_prefix":"122108","title":"哪些职业会最早被机器人取代？"},{"images":["http://pic2.zhimg.com/b05845fe7eab929c8418adaea3e58b75.jpg"],"type":0,"id":9082912,"ga_prefix":"122107","title":"机场跑道突然塌陷，吓得我赶紧蒸了一锅海鲜"},{"images":["http://pic1.zhimg.com/e9f736195bcf37eb170b5d249f945a90.jpg"],"type":0,"id":9082618,"ga_prefix":"122107","title":"电信诈骗新规出台，这次会管得更严吗？"},{"images":["http://pic1.zhimg.com/1711b00ab330984480174d7a9cae1c5c.jpg"],"type":0,"id":9082982,"ga_prefix":"122107","title":"2016 年度盘点 · 警惕这些财务造假的公司"},{"images":["http://pic4.zhimg.com/909357859289c3bb10471972e9c13983.jpg"],"type":0,"id":9082917,"ga_prefix":"122107","title":"读读日报 24 小时热门 TOP 5 · 老司机的那些文案"},{"images":["http://pic3.zhimg.com/02f261c372d459632ce0a328d2d4314a.jpg"],"type":0,"id":9081383,"ga_prefix":"122106","title":"瞎扯 · 如何正确地吐槽"}]
     * top_stories : [{"image":"http://pic1.zhimg.com/76aefe123bba397137549a10d9f03d00.jpg","type":0,"id":9082982,"ga_prefix":"122107","title":"2016 年度盘点 · 警惕这些财务造假的公司"},{"image":"http://pic4.zhimg.com/804ee4d739361b769e287a45ed22bf93.jpg","type":0,"id":9082618,"ga_prefix":"122107","title":"电信诈骗新规出台，这次会管得更严吗？"},{"image":"http://pic1.zhimg.com/136ca33de19f8e8e026d38cab976fd68.jpg","type":0,"id":9082917,"ga_prefix":"122107","title":"读读日报 24 小时热门 TOP 5 · 老司机的那些文案"},{"image":"http://pic4.zhimg.com/f3b10af0bcde5b07822ec974cff75abb.jpg","type":0,"id":9081991,"ga_prefix":"122017","title":"知乎好问题 · 怎样找到靠谱的心理咨询师？"},{"image":"http://pic3.zhimg.com/ec5f94ea6c7bba71b292345f60c0274a.jpg","type":0,"id":9079953,"ga_prefix":"122007","title":"2016 年度盘点 · 中国 + 美国 = 全球 x 70%"}]
     */

    private String date;
    private List<Story> stories;
    private List<TopStory> top_stories;

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public List<Story> getStories() {
        return stories;
    }

    public void setStories(List<Story> stories) {
        this.stories = stories;
    }

    public List<TopStory> getTop_stories() {
        return top_stories;
    }

    public void setTop_stories(List<TopStory> top_stories) {
        this.top_stories = top_stories;
    }

}
