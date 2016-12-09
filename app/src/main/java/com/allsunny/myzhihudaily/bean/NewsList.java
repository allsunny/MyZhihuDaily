package com.allsunny.myzhihudaily.bean;

import java.util.List;

/**
 * Created by allsunny on 2016/12/8.
 */

public class NewsList {
    /**
     * date : 20161208
     * stories : [{"ga_prefix":"120816","id":9047789,"images":["http://pic4.zhimg.com/494d952e179d737c4fb6c0f95c1a27f3.jpg"],"title":"诺基亚智能手机要回来了，这次它能留下来吗？","type":0},{"ga_prefix":"120815","id":9047692,"images":["http://pic3.zhimg.com/af9d3f2ffb7795a788cab9187b58a996.jpg"],"title":"人工智能接管世界，拢共分几步？","type":0},{"ga_prefix":"120814","id":9035656,"images":["http://pic2.zhimg.com/58531530849ac04ae1a8eccb7dc608bd.jpg"],"title":"中世纪的欧洲人吃西餐，并不优雅还得被围观","type":0},{"ga_prefix":"120814","id":9044631,"images":["http://pic2.zhimg.com/9f419eaefbcd52d13a3e41bbd628f349.jpg"],"title":"不用付钱拿着东西就走人，亚马逊无人超市是怎么做到的？","type":0},{"ga_prefix":"120814","id":9047612,"images":["http://pic3.zhimg.com/4a2a93d0b1ac5f09a3157d85239aa312.jpg"],"title":"大误 · 电影院是个危险的地方","type":0},{"ga_prefix":"120811","id":9045781,"images":["http://pic1.zhimg.com/a41072eb42a01801f74ddc4af7bf4b98.jpg"],"title":"踢得好很重要，但俱乐部想赚钱还要靠很多别的花招","type":0},{"ga_prefix":"120810","id":9045081,"images":["http://pic1.zhimg.com/7ee3c4d333b26146f96e45f5b6901358.jpg"],"title":"如果我们说别人有精神病，这一定是个「污名」吗？","type":0},{"ga_prefix":"120809","id":9045388,"images":["http://pic3.zhimg.com/5efd841582d8af67eef6427898d1e656.jpg"],"title":"为什么刚出生的小宝宝这么脆弱？","type":0},{"ga_prefix":"120808","id":9045790,"images":["http://pic3.zhimg.com/a94c736c31dd63caf3fe295966c4348a.jpg"],"title":"翻开这些书，一座座城市便跃然纸上","type":0},{"ga_prefix":"120807","id":9045771,"images":["http://pic1.zhimg.com/459fe9dfb7e65fb668fdc077801fc108.jpg"],"title":"抑郁症会遗传吗？","type":0},{"ga_prefix":"120807","id":9017221,"images":["http://pic1.zhimg.com/77c7d506420a02fed3a9e4f6a41cc5e8.jpg"],"title":"一个简单的例子，搞懂为什么会有一次一次的经济危机","type":0},{"ga_prefix":"120807","id":9039903,"images":["http://pic4.zhimg.com/af6eaa951b0bf92e4c88c06a45e94443.jpg"],"title":"红枣放锅里一煮，飘起一层白白的东西，还能吃吗？","type":0},{"ga_prefix":"120807","id":9046189,"images":["http://pic3.zhimg.com/930999618d141e7061d2f8e22fe9d656.jpg"],"title":"读读日报 24 小时热门 TOP 5 · 中国二胎妈妈们的新态度","type":0},{"ga_prefix":"120806","id":9045043,"images":["http://pic2.zhimg.com/ebaf434a516b65388230f49ae90321bd.jpg"],"title":"瞎扯 · 如何正确地吐槽","type":0}]
     * top_stories : [{"ga_prefix":"120816","id":9047789,"image":"http://pic3.zhimg.com/9db21d0de53dea9506b13f72a613cd2a.jpg","title":"诺基亚智能手机要回来了，这次它能留下来吗？","type":0},{"ga_prefix":"120814","id":9044631,"image":"http://pic3.zhimg.com/d7328dc8aa3e1ee195cdcfe6381cd1e6.jpg","title":"不用付钱拿着东西就走人，亚马逊无人超市是怎么做到的？","type":0},{"ga_prefix":"120815","id":9047692,"image":"http://pic3.zhimg.com/eed8e8ef0e7ae019563577e2d71cd11a.jpg","title":"人工智能接管世界，拢共分几步？","type":0},{"ga_prefix":"120807","id":9039903,"image":"http://pic3.zhimg.com/ade759787d79d6508c0bdc433db707b2.jpg","title":"红枣放锅里一煮，飘起一层白白的东西，还能吃吗？","type":0},{"ga_prefix":"120807","id":9046189,"image":"http://pic3.zhimg.com/1d56364b6d81e4bc415072ef42d2b7a6.jpg","title":"读读日报 24 小时热门 TOP 5 · 中国二胎妈妈们的新态度","type":0}]
     */

    private String date;
    private List<StoriesBean> stories;
    private List<TopStoriesBean> top_stories;

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public List<StoriesBean> getStories() {
        return stories;
    }

    public void setStories(List<StoriesBean> stories) {
        this.stories = stories;
    }

    public List<TopStoriesBean> getTop_stories() {
        return top_stories;
    }

    public void setTop_stories(List<TopStoriesBean> top_stories) {
        this.top_stories = top_stories;
    }

    public static class StoriesBean {
        /**
         * ga_prefix : 120816
         * id : 9047789
         * images : ["http://pic4.zhimg.com/494d952e179d737c4fb6c0f95c1a27f3.jpg"]
         * title : 诺基亚智能手机要回来了，这次它能留下来吗？
         * type : 0
         */

        private int id;
        private String title;
        private int type;
        private List<String> images;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public int getType() {
            return type;
        }

        public void setType(int type) {
            this.type = type;
        }

        public List<String> getImages() {
            return images;
        }

        public void setImages(List<String> images) {
            this.images = images;
        }
    }

    public static class TopStoriesBean {
        /**
         * ga_prefix : 120816
         * id : 9047789
         * image : http://pic3.zhimg.com/9db21d0de53dea9506b13f72a613cd2a.jpg
         * title : 诺基亚智能手机要回来了，这次它能留下来吗？
         * type : 0
         */

        private int id;
        private String image;
        private String title;
        private int type;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getImage() {
            return image;
        }

        public void setImage(String image) {
            this.image = image;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public int getType() {
            return type;
        }

        public void setType(int type) {
            this.type = type;
        }
    }
}
