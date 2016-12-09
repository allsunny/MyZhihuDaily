package com.allsunny.myzhihudaily.http;

import com.allsunny.myzhihudaily.bean.NewsList;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

import static com.allsunny.myzhihudaily.utils.Constants.BASE_URL;

/**
 * Created by allsunny on 2016/12/9.
 */

public class RetrofitManager {

    Retrofit mRetrofit = new Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build();
    ZhihuDailyService mZDService = mRetrofit.create(ZhihuDailyService.class);



}
