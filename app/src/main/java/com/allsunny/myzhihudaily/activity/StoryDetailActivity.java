package com.allsunny.myzhihudaily.activity;

import android.os.Bundle;
import android.webkit.WebView;

import com.allsunny.myzhihudaily.R;

/**
 * Created by allsunny on 2016/11/29.
 */

public class StoryDetailActivity extends BaseActivity {

    private String news = "<div class=\"main-wrap content-wrap\">\n" +
            "    <div class=\"headline\">\n" +
            "        <div class=\"img-place-holder\"></div>\n" +
            "    </div>\n" +
            "    <div class=\"content-inner\">\n" +
            "        <div class=\"question\"><h2 class=\"question-title\">老佛爷爱的初体验 | 西餐北漂前传（二）</h2>\n" +
            "            <div class=\"answer\">\n" +
            "                <div class=\"meta\"><img class=\"avatar\"\n" +
            "                                       src=\"http://pic3.zhimg.com/fc12ad693cf92ea54085d19eeb022f4e_is.jpg\">\n" +
            "                    <span class=\"author\">王璞，</span><span class=\"bio\">公众号：馋人事务所</span></div>\n" +
            "                <div class=\"content\"><p>1903 年 5\n" +
            "                    月的一天，紫禁城里的午膳设在了养云轩，那是宫里专门用来举办重要宴会的地点，而这一天的这场宴会有两位主宾：美国公使的妻子康格夫人和美国海军上将的妻子伊万夫人。为了布置好这顿饭的餐桌，宫里足足忙了一上午，悉数按照太后的吩咐：铺上了白色桌布，摆好了鲜花，金质菜单托架的旁边，是装满了杏仁和西瓜子的小金盘子，筷子及餐具也都是最高规格&mdash;&mdash;银质的。不仅如此，太后还特别叮嘱要专门预备好外国人用的刀叉，酒也要指定&mdash;&mdash;一定要有最好的香槟！按她的说法：&ldquo;我知道外国女子都喜欢喝这种酒。&rdquo;</p>\n" +
            "                    <p><img class=\"content-image\"\n" +
            "                            src=\"https://pic4.zhimg.com/38498a62444c27564ceb954e954a1193_b.jpg\"\n" +
            "                            alt=\"\"/></p>\n" +
            "                    <blockquote>与老佛爷握着手的，就是宴会主宾康格夫人。</blockquote>\n" +
            "                    <p><img class=\"content-image\"\n" +
            "                            src=\"https://pic2.zhimg.com/43274a28d78385bdbc7f2af84bc0ec89_b.jpg\"\n" +
            "                            alt=\"\"/></p>\n" +
            "                    <blockquote>老佛爷有没有搞一个华丽丽的香槟塔？对于这位时髦的老太太，也不是没有可能&hellip;&hellip;</blockquote>\n" +
            "                    <p>是的，这位&ldquo;太后&rdquo;就是慈禧。政治上的慈禧顽固不化，而生活中的这位老太太却着实按捺不住内心的时髦：尤其爱拍照，留下了不少照片，不但会摆各种\n" +
            "                        Pose，甚至还玩过 Cosplay。此外，还亲自作为模特被美国女画家画了一幅肖像画送到世博会展出&mdash;&mdash;要知道，在当时中国人的意识里，只有死人才有画像！</p>\n" +
            "                    <p><img class=\"content-image\"\n" +
            "                            src=\"https://pic1.zhimg.com/e620853622e8952fb26a3cc90b04b528_b.jpg\"\n" +
            "                            alt=\"\"/></p>\n" +
            "                    <blockquote>千真万确，老佛爷确实是 Cosplay 界的祖师奶奶！</blockquote>\n" +
            "                    <p>&ldquo;海归女&rdquo;裕德龄初从法国归来时穿着一身欧式洋装（十三姨即视感&hellip;&hellip;）进宫觐见老佛爷，老佛爷看她这一身儿不禁自己心里痒得很，于是七七八八地问了许多关于巴黎服装的问题，并表示非常喜欢她脚上的那双&ldquo;路易十五&rdquo;高跟鞋。临了儿，还不忘嘱咐：&ldquo;以后你每回进宫可都得穿得这么好看呐！&rdquo;</p>\n" +
            "                    <p><img class=\"content-image\"\n" +
            "                            src=\"https://pic4.zhimg.com/1995d1d2d1608c0da1dd13dde6e56227_b.jpg\"\n" +
            "                            alt=\"\"/></p>\n" +
            "                    <blockquote>巴黎归来的&ldquo;时尚姊妹花&rdquo;：妹妹裕容龄（左）与裕德龄。</blockquote>\n" +
            "                    <p>扯远了，说回到 1903 年的这顿饭。如此大费周章准备了这一桌高规格西式风格的午餐款待外国友人，看来太后老佛爷这是又在赶时髦尝鲜啦？\n" +
            "                        那几年，如此这般打开宫廷大门并以洋人的方式宴请洋人已成常态，每隔一段时间，就会有某个国家的公使或是公使夫人到宫里坐客。慈禧太后固然赶时髦，但事实上，这位强势了一辈子的老太太也是迫不得已。经历了八国联军进京的惨痛教训，落魄地从西安返京后，慈禧深知洋人惹不起，于是便总结出了那句著名的&ldquo;方法论&rdquo;：&ldquo;量中华之物力，结与国之欢心&rdquo;，开始特别注重与各国的洋大人们搞好关系，就此，紫禁城便开启了一顿一顿又一顿的饭局之路。\n" +
            "                        请洋人吃饭，又得让人家吃得舒服，那就请吃西餐吧！但问题是，宫里没人会做西餐啊&hellip;&hellip;那么就有样学样地走一走西餐的形式好了，哪料即便如此，还是出了不少洋相。曾经多次参加清宫宴会的美国传教士赫德兰在他《一个美国人眼中的晚清宫廷》一书中对自己的&ldquo;第一次&rdquo;印象深刻：&ldquo;餐桌上铺着颜色十分艳丽的漆布，但是没有像样的桌布或餐巾，我们都用和手帕一样大小的五颜六色的花棉布做餐巾。没有鲜花，桌上的装饰主要是大盘小盘的糕点和水果。&rdquo;更囧的是，按宫中规矩，与慈禧太后一起用膳，除了慈禧本人，谁都得站着吃饭，福晋、格格如此，即便是光绪皇帝和隆裕皇后也得站着吃。出席宴会的公使夫人们自然有的坐，但眼看着这些只能站着的陪客，那哪受得了啊！在她们的再三请求之下，众人终得座，但面对桌上的菜，这些个陪客总显得心事重重、没有胃口&mdash;&mdash;弄成这样，想想都难受！</p>\n" +
            "                    <p><img class=\"content-image\"\n" +
            "                            src=\"https://pic1.zhimg.com/a691e1eecdd04b04c5c2b1269fd2c828_b.jpg\"\n" +
            "                            alt=\"\"/></p>\n" +
            "                    <blockquote>就冲老佛爷这充满杀气的眼神，就算被赐座应该也坐不踏实...</blockquote>\n" +
            "                    <p>&ldquo;曙光&rdquo;出现在 1902 年 3\n" +
            "                        月，前文中提到的美国公使妻子康格夫人在这时发挥了重要作用。康格夫人邀请清廷的一票福晋、格格到美国公使馆用餐。而这几个女人在赴宴前想必一定接受了最高领导的指示：得把人家那一套吃饭的方式方法学来啊！于是在餐会的整个过程中，每个人都在仔细观察：餐桌怎么布置，餐巾怎么用，刀叉怎么使，她们恨不得把康格夫人的每一个细微动作都用心记下来（百多年后成天玩小视频的姆们看着真捉急！）。餐后，她们与公使夫人喝茶、弹钢琴、唱歌、看照片，算是非常完整地参与了一次最纯正的西式聚会。</p>\n" +
            "                    <p><img class=\"content-image\"\n" +
            "                            src=\"https://pic3.zhimg.com/f2d7b0361f8c7c9fcb4d93bc0f4f07a6_b.jpg\"\n" +
            "                            alt=\"\"/></p>\n" +
            "                    <blockquote>清后期西方人在北京中式庭院内的西式晚宴。</blockquote>\n" +
            "                    <p>正是在这一次的&ldquo;培训&rdquo;之后，紫禁城的外事接待水平实现了全面大升级。一如本文开篇提到的那场宫廷宴会，不但餐桌布置全盘西化，甚至在就餐过程中，从侍者到就餐者对于西式餐会都应对得十分到位。由此可见紫禁城这是下了多大的工夫啊！\n" +
            "                        1903\n" +
            "                        年的那场宴会，当时作为慈禧贴身女官的裕德龄在多年后她的《清宫二年记》中回忆得详细，餐桌上有刀，有叉，有鲜花，有餐巾，更有香槟，整体的西洋氛围十分到位。菜也准备得丰盛，除了小点心外，一共二十四道菜。但有（gan）趣（ga）的是：那是二十四道地地道道的&mdash;&mdash;满！洲！菜！究其原因，想来也简单&mdash;&mdash;那时就连老佛爷都在好奇&ldquo;洋饭&rdquo;到底啥味儿，宫里那是千真万确没有一个人有做西餐的能耐昂！\n" +
            "                        带着老佛爷打开西餐味蕾的，还得是踩着那双路易十五高跟鞋的海归女裕德龄。裕德龄是大清驻法公使裕庚的大女儿，跟着父亲在法国生活多年，精通英语、法语，更通晓西方礼仪，回国后甚得慈禧欢心，于是便被留在宫中担任太后的贴身女官，主要负责翻译工作。慈禧能够成为中国史上唯一一位在世时就拥有自己肖像画的国家统治者，裕德龄的幕后工作功不可没；如今我们能看到那么多那么生动的老佛爷生活照，也跟裕德龄有着最直接的关系，正是经她的推荐，中国史上出现了第一位宫廷御用摄影师&mdash;&mdash;裕德龄的亲哥哥裕勋龄。</p>\n" +
            "                    <p><img class=\"content-image\"\n" +
            "                            src=\"https://pic3.zhimg.com/6406b925b9dd180b52fa07b2dc2a1686_b.jpg\"\n" +
            "                            alt=\"\"/></p>\n" +
            "                    <blockquote>美国女画家卡尔为了这幅画消耗了 9\n" +
            "                        个月的时间，如此长的时间里老佛爷怎么可能每天挨那儿一动不动当模特，于是，在她老人家的示意下，裕德龄穿上了太后的衣服&hellip;&hellip;等到该画脸了，老佛爷本人再亲自现身。\n" +
            "                    </blockquote>\n" +
            "                    <p><img class=\"content-image\"\n" +
            "                            src=\"https://pic1.zhimg.com/f64a7eb427a0835dba3b48af06ba71f0_b.jpg\"\n" +
            "                            alt=\"\"/></p>\n" +
            "                    <blockquote>老佛爷每一张&ldquo;有态度&rdquo;的肖像都是出自裕德龄的亲哥哥裕勋龄。</blockquote>\n" +
            "                    <p>事实上，慈禧正式接触西餐，作为太后身边的红人，裕德龄依然是无法回避的核心人物。正是在她反复多次、眉飞色舞的力荐之下，表面固执的慈禧终于还是没能禁住&ldquo;舌尖上的诱惑&rdquo;，决定尝上一尝&mdash;&mdash;不过她也有限制条件，不能带宫外不知底细的厨子进宫！于是德龄亲自拟定菜单后，先是跑到使馆区附近的西餐馆（按地理位置和时间点推断，北京饭店的可能性最大）购买了一部分菜肴，然后还有些菜则亲自下厨。</p>\n" +
            "                    <p><img class=\"content-image\"\n" +
            "                            src=\"https://pic4.zhimg.com/8ec74809515294ac3f0c76ee9167506f_b.jpg\"\n" +
            "                            alt=\"\"/></p>\n" +
            "                    <blockquote>1920 年代的北京饭店（左为 1917 年加盖后的新楼，右为 1901 年建的老楼）。</blockquote>\n" +
            "                    <p>\n" +
            "                        一场丰盛的法国大餐在中国宫廷正式上演，一番尝试过后，慈禧明显对那些麻烦又难用的刀叉不以为然，其中的几道尽显法兰西风情的豪华大菜也并没有引起老佛爷多大的兴致，反倒是杯盘碗碟间摆着的那几块黄澄澄的法式面包让这位老太太一见钟情，更意外的是，她老人家居然当场下旨，钦点面包纳入自己每天的茶点单：&ldquo;以后有事儿没事儿我就要来上两块垫垫肚子。&rdquo;&mdash;&mdash;当年慈禧西逃一路上，这位锦衣玉食大半辈子的中国最高领导人吃得最香的食物就是从一帮逃难人那里讨来的一个窝窝头。仔细想来，这几块法兰西面包真是跟那个窝窝头有着或多或少的相似之处：从生理学层面来说，都能垫肚子！如果上升到食物美学的层次，那就是它们都特其貌不扬但却统统有着一颗华丽的内心：可以让人最简单直接地感受到最原始的粮食的味道&mdash;&mdash;话说能够认识到这一点，慈禧老佛爷这是真懂行的吃主儿啊！</p>\n" +
            "                    <p><img class=\"content-image\"\n" +
            "                            src=\"https://pic2.zhimg.com/e267c52d424039f527cb487f8604e941_b.jpg\"\n" +
            "                            alt=\"\"/></p>\n" +
            "                    <blockquote>\n" +
            "                        无从得知老佛爷爱上的到底是哪种法式面包，但，对于年届七十的她来说，首先应该排除的就是法棍吧&hellip;&hellip;</blockquote>\n" +
            "                    <p>文中图片均来源于网络</p>\n" +
            "                    <hr/>\n" +
            "                    <p>欢迎关注公众号：馋人事务所</p>\n" +
            "                    <div class=\"view-more\"><a href=\"http://zhuanlan.zhihu.com/p/22212233\">查看知乎讨论</a>\n" +
            "                    </div>\n" +
            "                </div>\n" +
            "            </div>\n" +
            "        </div>\n" +
            "    </div>\n" +
            "</div>";

    private String obj;
    private String str = news;
    private WebView mWebView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        layoutResID = R.layout.activity_story_detail;
        super.onCreate(savedInstanceState);

        mWebView = (WebView) findViewById(R.id.web_view);

        news = "";
        obj = news;
        obj = String.format("<!doctype html><html><head><meta charset=\"utf-8\"><meta name=\"viewport\" content=\"width=device-width,user-scalable=no\"><link href=\"news_qa.min.css\" rel=\"stylesheet\"></head><body className=\"%s\">", new Object[]{obj});
        news = obj;
//        obj = news + "<script src=\"large-font.js\"></script>";
//        obj = news + "<script src=\"night.js\"></script>";
        news = new StringBuilder(String.valueOf(obj)).append(str).toString() + "</body></html>";


        mWebView.getSettings().setJavaScriptEnabled(true);//support show JS

        mWebView.loadDataWithBaseURL("file:///android_asset/", news, "text/html", "UTF-8", null);
    }

}
