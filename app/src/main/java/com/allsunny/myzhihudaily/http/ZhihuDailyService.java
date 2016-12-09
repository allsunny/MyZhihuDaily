package com.allsunny.myzhihudaily.http;

import com.allsunny.myzhihudaily.bean.NewsList;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

import static com.allsunny.myzhihudaily.utils.Constants.LAST_NEWS;

/**
 * Created by allsunny on 2016/12/9.
 */

public interface ZhihuDailyService {

    @GET(LAST_NEWS)
    Call<List<NewsList>> getNewsList();

}
